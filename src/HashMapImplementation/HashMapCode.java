package HashMapImplementation;

import java.util.*;

public class HashMapCode {
    static class HashMap<K,V>
    {
        private class Node
        {
            K key;
            V value;

            private Node(K key,V value)
            {
                this.key = key;
                this.value = value;
            }
        }
        private int n;//size of a linked list present on each index of array of linkedlist
        private int N;// size of array of Linkedlist
        private LinkedList<Node> buckets[];
        public HashMap()
        {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < N ; i++) {
                buckets[i] = new LinkedList<>();// create a linkedlist at every index of an array
            }
        }
        private int searchInLL(K key,int bi)
        {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (int i = 0;i<ll.size();i++)
            {
                Node node = ll.get(i);
                if (node.key==key)
                    return di;
                di++;
            }
            return -1;
        }
        private int hashFuction(K key)
        {
            int hc = key.hashCode();
            return Math.abs(hc)%N;
        }
        private void rehash()
        {
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[2*N];// creating new bucket with double size
            N = 2*N;
            for (int i = 0; i < N ; i++) {
                buckets[i] = new LinkedList<>();//initialize linkedlist to every idx of new bucket
            }
            // copying the value of oldbuck into newbuck
            for (int i = 0; i < oldBuck.length; i++) {
                LinkedList<Node> ll = buckets[i];// we get a linkedlist present on every index
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();// getting nodes present in oldbuck and remove them
                    put(node.key, node.value);//adding them the key and value of node that is removed from the oldbuck
                }
            }
        }
        public void put(K key,V value)
        {
            int bi = hashFuction(key);
            int di = searchInLL(key,bi);
            if(di != -1)
            {
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            else
            {
                buckets[bi].add(new Node(key,value));
                n++;
            }
            // if our lambda is greater then our threshold value(n/N it can be any value let us consider it as 2.0 intially)
            double lambda = (double) n/N;
            if (lambda>2.0)
            {
                rehash();
            }
        }
        public boolean containsKey(K key)
        {
            int bi = hashFuction(key);
            int di = searchInLL(key,bi);
            if(di != -1)
                return  true;
            return false;
        }
        public V remove(K key)
        {
            int bi = hashFuction(key);
            int di = searchInLL(key,bi);
            if(di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }else
            {
                return null;
            }
        }
        public V get(K key)
        {
            int bi = hashFuction(key);
            int di = searchInLL(key,bi);
            if(di != -1)
            {
                Node node = buckets[bi].get(di);
                return node.value;
            }
            else
            {
                return  null;
            }
        }
        public ArrayList<K> keySet()
        {
            ArrayList<K> al = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                LinkedList<Node> ll = buckets[i];
                for (int j = 0; j <ll.size() ; j++) {
                     Node node = ll.get(j);
                     al.add(node.key);
                }
            }
            return al;
        }
        public boolean isEmpty()
        {
            return n==0;
        }
    }
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India",100);
        map.put("China",150);
        map.put("Nepal",10);
        map.put("Pakistan",20);
        System.out.println(map.containsKey("China"));
        System.out.println(map.remove("Pakistan"));
        System.out.println(map.containsKey("Pakistan"));
        System.out.println(map.get("India"));
        System.out.println(map.keySet());
    }
}
