package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class DiameterOfBinaryTree {
    static class Node
    {
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data = data;
        }
    }
    static int minimumDiff = Integer.MAX_VALUE;
    public static  int getMinimumDifference(Node root) {
        List<Integer> al = new ArrayList<>();
        while(root!= null)
        {
            al.add(root.data);
            root = root.left;
        }
        System.out.println(al);
        for (int i = 1; i < al.size(); i++) {
             minimumDiff = Math.min(minimumDiff, Math.abs(al.indexOf(i)-al.indexOf(i-1)));
        }
        return minimumDiff;
    }
    public static int diameterOfBinarytree(Node root)
    {
        if(root == null) return 0;
        int leftDiameter = diameterOfBinarytree(root.left);
        int rightDiameter = diameterOfBinarytree(root.right);
        return Math.max(leftDiameter, rightDiameter) + 1;

    }

    public static void inordertraversal(Node root)
    {
        if(root == null) return;

        inordertraversal(root.left);
        System.out.print(root.data + " ");
        inordertraversal(root.right);
    }
    public static void postOrder(Node root)
    {
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
    public static void preOrder(Node root)
    {
        if(root == null) return;
        System.out.print(root.data + " ");
        postOrder(root.left);
        postOrder(root.right);

    }
    public static void main(String[] args) {
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.left.left.left = new Node(6);

        Node root = new Node(10);
        root.left = new Node(9);
        root.right = new Node(17);
        root.left.left = new Node(5);
        root.left.right = new Node(11);
        root.left.left.left = new Node(99);
        root.right.left = new Node(19);
        root.right.right = new Node(25);
        //System.out.println(diameterOfBinarytree(root));
        //System.out.println(getMinimumDifference(root));
        preOrder(root);
        System.out.println();
        inordertraversal(root);
        System.out.println();
        postOrder(root);
    }
}
