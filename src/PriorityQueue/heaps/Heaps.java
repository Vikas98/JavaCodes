package PriorityQueue.heaps;

import java.util.ArrayList;

public class Heaps {
     static class Heap
    {
        ArrayList<Integer> al = new ArrayList<>();

        public void add(int data)
        {
            al.add(data);

            int child = al.size() - 1;
            int parent = (child -1)/2;

            while(al.get(child) < al.get(parent)) // o(log n)  if n nodes then we have log n levels exits
            {
                int temp = al.get(child);
                al.set(child, al.get(parent));
                al.set(parent, temp);
                child = parent;
                parent = (child-1)/2;
            }
        }
        public int peek()
        {
            return al.get(0);
        }
        private void heapify(int index)
        {
            int left = 2*index+1;
            int right = 2*index+2;
            int minIdx = index;

            if(left < al.size() && al.get(minIdx)>al.get(left))
                minIdx = left;
            if(right< al.size() && al.get(minIdx) > al.get(right))
                minIdx = right;

            if(minIdx != index)
            {
                int temp = al.get(index);
                al.set(index,al.get(minIdx));
                al.set(minIdx,temp);
                heapify(minIdx);
            }

        }
        public int remove()
        {
            int data = al.get(0);

            int temp = al.get(0);
            al.set(0,al.get(al.size()-1));
            al.set(al.size()-1,temp);

            al.remove(al.size()-1);

            heapify(0);
            return data;

        }
        public boolean isEmpty()
        {
            return al.size()==0;
        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.add(3);
        heap.add(4);
        heap.add(1);
        heap.add(5);
        while(!heap.isEmpty())
        {
            System.out.println(heap.peek());
            heap.remove();
        }
    }
}
