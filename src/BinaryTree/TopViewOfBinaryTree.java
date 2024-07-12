package BinaryTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopViewOfBinaryTree {

    static class info
    {
        Binarytrees.Node node;
        int hd;

        public info(Binarytrees.Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topView(Binarytrees.Node root)
    {
        Queue<info> q = new LinkedList<>();
        q.add(new info(root,0));
        q.add(null);
        HashMap<Integer, Binarytrees.Node> map = new HashMap<>();
        int min = 0, max = 0;
        while (!q.isEmpty())
        {
            info curr = q.remove();
            if (curr == null)
            {
                if (q.isEmpty()) {
                    break;
                }
                else
                {
                    q.add(null);
                }
            }
            else {
                if (!map.containsKey(curr.hd))
                {
                    map.put(curr.hd,curr.node);
                }
                if(curr.node.left != null)
                {
                    q.add(new info(curr.node.left,curr.hd-1));
                    min = Math.min(min, curr.hd-1);
                }
                if (curr.node.right != null)
                {
                    q.add(new info(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }
            }
        }
        for (int i = min;i<=max;i++)
        {
            if(map.get(i)!=null)
              System.out.print(STR."\{map.get(i).data}  ");
            else
            {
                break;
            }
        }
    }
    public static void main(String[] args) {
        Binarytrees.Node root = new Binarytrees.Node(1);
        root.left = new Binarytrees.Node(2);
        root.right = new Binarytrees.Node(3);
        root.left.left = new Binarytrees.Node(4);
        root.left.right = new Binarytrees.Node(5);
        root.right.left = new Binarytrees.Node(6);
        root.right.right = new Binarytrees.Node(7);

        topView(root);

    }

}
