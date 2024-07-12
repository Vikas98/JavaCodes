package LEETCODE;

import BinarySearchTree.BuildBST;

public class BalancedBST {
    public static BuildBST.Node balancedBst(BuildBST.Node root)
    {
        if (root == null) return root;
        int lh = 0,rh=0;
        lh = Height(root.left);
        rh = Height(root.right);



        return null;
    }
    public static int Height(BuildBST.Node root)
    {
        if(root==null) return 0;

        return 1+Math.max(Height(root.left),Height(root.right));
    }
    public static void main(String[] args) {
        int [] nums = {3,4,1,2};
        BuildBST.Node root = null;
        for (int i = 0; i < nums.length; i++) {
           root = BuildBST.BuildBST(root,nums[i]);
        }
        BuildBST.InorderTraversal(root);
        balancedBst(root);
    }
}
