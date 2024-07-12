package BinaryTree;

import java.util.Stack;

import static java.lang.Math.floor;

public class KthAncestor {
    public static int kAncestor(Binarytrees.Node root,int  n ,int k)
    {
        if (root==null)
            return -1;
        if (root.data == n)
        {
            return 0;
        }
        int leftDist = kAncestor(root.left,n,k);
        int rightDist = kAncestor(root.right,n,k);
        if (leftDist == -1 && rightDist == -1)
            return -1;
        int max = Math.max(leftDist,rightDist);
        if (max+1 == k)
            System.out.print("Kth Ancestor  "+root.data);

        return max+1;
    }

    public static void main(String[] args) {
        Binarytrees.Node root = new Binarytrees.Node(1);
        root.left = new Binarytrees.Node(2);
        root.right = new Binarytrees.Node(3);
        root.left.left = new Binarytrees.Node(4);
        root.left.right = new Binarytrees.Node(5);
        root.right.left = new Binarytrees.Node(6);
        root.right.right = new Binarytrees.Node(7);

        System.out.print(STR."\nDistance    \{kAncestor(root,5,2)}");


    }
}
