package BinarySearchTree;

import java.util.*;

public class BuildBST {
    public static class Node {
        int data;
       public Node left;
       public Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    // static boolean b ,c ;
    public static boolean searchKey(Node root, int data) {

        if (root == null) return false;
        if (root.data == data) return true;
        if (data > root.data)
            return searchKey(root.right, data);
        else
            return searchKey(root.left, data);

    }

    public static void InorderTraversal(Node root) {
        if (root == null) return;

        InorderTraversal(root.left);
        System.out.print(root.data + " ");
        InorderTraversal(root.right);
    }

    public static Node invertTree(Node root) {
        if (root == null)
            return null;
        Node left = invertTree(root.left);
        Node right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

        public static List<String> binaryTreePaths(Node root) {
        List<String> list = new ArrayList<>();
        if (root == null)
            return list;
        if (root.left == null && root.right == null) {
            list.add(String.valueOf(root.data));
            return list;
        }
        List<String> left = binaryTreePaths(root.left);
        List<String> right = binaryTreePaths(root.right);
        for (String s : left) {
            list.add(root.data + "->" + s);
        }
        for (String s : right) {
            list.add(root.data + "->" + s);
        }
        return list;
    }
//    public static  int sumOfLeft(Node root)
//    {
//        if (root == null) return 0;
//        int sum = 0;
//        if (root.left != null) {
//            sum += root.left.data;
//            System.out.println("Sum of left  "+sum);
//
//        }
//        sum += sumOfLeft(root.left);
//        System.out.println("After left call  "+sum);
//        sum += sumOfLeft(root.right);
//        System.out.println("After right call  "+sum);
//        return sum;
//    }
    public static Node BuildBST(Node root, int val) {
        if (root == null) return new Node(val);
        if (val > root.data)
            root.right = BuildBST(root.right, val);
        else
            root.left = BuildBST(root.left, val);

        return root;
    }

    public static Node delete(Node root, int val) {
        if (root == null) {
            System.out.println("Node not found");
            return null;
        }
        if (val > root.data) root.right = delete(root.right, val);
        else if (val < root.data) root.left = delete(root.left, val);
        else {
            //case 1 left==null and right == null
            if (root.left == null && root.right == null) return null;

            // case 2
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            // case 3
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null)
            root = root.left;
        return root;
    }

    public static void printInRange(Node root, int k1, int k2)
    {
        if (root == null ) return;
        if(root.data >=k1 && root.data <= k2)
        {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data<k1)
        {
            printInRange(root.left, k1, k2);
        }
        else
        {
            printInRange(root.right, k1, k2);
        }
    }
    public static void main(String[] args) {
       int[] values ={8,5,3,1,4,6,10,11,14};

       Node root  = null;
       for (int i = 0;i<values.length;i++)
       {
           root = BuildBST(root,values[i]);
       }
       printInRange(root,5,12);
//
//       InorderTraversal(root);
//       root = delete(root,3);
//       System.out.println();
//       InorderTraversal(root);
        List<String> list = binaryTreePaths(root);
        System.out.println(list);

    }
}
