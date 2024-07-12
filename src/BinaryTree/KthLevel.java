package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class KthLevel {
    public static void kLevel(Binarytrees.Node root , int level , int k)
    {
        if (root==null) return;
        if (level==k){
            System.out.print(STR."\{root.data}  " );
            return;
        }
        kLevel(root.left,level+1,k);
        kLevel(root.right,level+1,k);
    }
    public static void levelOrderKLevel(Binarytrees.Node root , int level , int k)
    {
        if (root==null)
        {
          return;
        }
        Queue<Binarytrees.Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty())
        {
            Binarytrees.Node currNode = q.remove();
            if (currNode == null)
            {
                System.out.println();
                level++;
                if (q.isEmpty())
                {
                    break;
                }
                else
                {
                    q.add(null);
                }
            }
            else
            {
                if(level == k)
                       System.out.print(STR."\{currNode.data} | ");

                if (currNode.left != null)
                {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }

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

       // kLevel(root,1,3);
        levelOrderKLevel(root,1,3);
    }
}

