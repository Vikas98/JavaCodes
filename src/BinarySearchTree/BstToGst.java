package BinarySearchTree;

public class BstToGst {

    public static BuildBST.Node bstToGst(BuildBST.Node root) {
       if (root == null) return root;
      BuildBST.Node rightNode = bstToGst(root.right);
        root.data = root.data+ rightNode.data;
      BuildBST.Node leftNode = bstToGst(root.left);

      root.data = root.data+  leftNode.data;
      return root;
    }
// use one util method to solve it
    public static void main(String[] args) {
        int[] nums = {4,1,6,0,2,5,7,3,8};
        BuildBST.Node root=null;
        for (int i = 0; i < nums.length ; i++) {
            root = BuildBST.BuildBST(root, nums[i]);
        }
        bstToGst(root);
        BuildBST.InorderTraversal(root);
    }
}
