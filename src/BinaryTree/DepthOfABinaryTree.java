package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

import static javax.swing.Spring.height;

public class DepthOfABinaryTree {

        public static boolean isBalanced(Binarytrees.Node root) {
            if (root == null) {
                return true;
            }
            int left = height(root.left);
            int right = height(root.right);
            return Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }

       private static int height(Binarytrees.Node left) {

            if (left == null) {
                return 0;
            }
            return Math.max(height(left.left), height(left.right)) + 1;
      }
     public static void levelOrderTraversal(Binarytrees.Node root) {
         Queue<Binarytrees.Node> q = new LinkedList<>();
         q.add(root);
         while (!q.isEmpty()) {
             Binarytrees.Node curr = q.poll();
             System.out.print(curr.data + " ");
             if (curr.left != null) {
                 q.add(curr.left);
             }
             if (curr.right != null) {
                 q.add(curr.right);
             }
         }
     }
      public static int minDepth(Binarytrees.Node root) {
          if (root == null) {
              return 0;
          }
          int left = minDepth(root.left);
          int right = minDepth(root.right);
          return Math.min(left, right) + 1;
      }
    public static void main(String[] args) {
        Binarytrees.Node root = new Binarytrees.Node(2);
        root.right = new Binarytrees.Node(3);
        root.right.right = new Binarytrees.Node(4);
        root.right.right.right = new Binarytrees.Node(5);
        root.right.right.right.right = new Binarytrees.Node(6);

        System.out.println(isBalanced(root));
              System.out.println(minDepth(root));


    }
}
