package BinaryTree;

import java.util.*;

public class LowestCommonAncestor {

    public static boolean getPath(Binarytrees.Node root , int n , ArrayList<Binarytrees.Node> path)
    {
        if (root==null) return false;
        path.add(root);
        if (root.data == n) return true;

        boolean foundleft = getPath(root.left,n,path);
        boolean foundright = getPath(root.right,n,path);

        if (foundleft || foundright) return  true;

        path.remove(path.size()-1);

        return false;
    }
    public static Binarytrees.Node lca(Binarytrees.Node root , int n1 ,int n2)
    {
        ArrayList<Binarytrees.Node> path1 = new ArrayList<>();
        ArrayList<Binarytrees.Node> path2 = new ArrayList<>();

        getPath(root,n1,path1);
        getPath(root,n2,path2);

        int i = 0;
        for (; i<path1.size() && i<path2.size(); i++) {

            if (path1.get(i) != path2.get(i))
                break;;
        }
        Binarytrees.Node lca = path1.get(i-1);
        return lca;
    }
    public static Binarytrees.Node lca2(Binarytrees.Node root , int n1 ,int n2)
    {
        if(root==null || root.data == n1 || root.data==n2)
        {
            return root;
        }

        Binarytrees.Node leftLca = lca2(root.left,n1,n2);
        Binarytrees.Node rightLca = lca2(root.right,n1,n2);

        if (leftLca == null)  return rightLca;
        if (rightLca == null) return leftLca;

        return root;
    }
    public static int minDistance(Binarytrees.Node root, int n1,int n2)
    {
        Binarytrees.Node lcaNode = lca2(root,n1,n2);
        int leftDist = distance(lcaNode,n1);
        int rightdist = distance(lcaNode,n2);

        return leftDist+rightdist;
    }
    public static int distance(Binarytrees.Node root , int n) {
        if (root == null)
            return -1;
        if (root.data == n)
            return 0;
        int leftdist = distance(root.left, n);
        int rightdist = distance(root.right, n);
        if (leftdist == -1 && rightdist == -1) return -1;
        else if (leftdist == -1) return rightdist+1;
        else return leftdist+1;
    }
    public static int profit(ArrayList<Integer> prices)
    {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.size(); i++) {
            minPrice = Math.min(minPrice, prices.get(i));
            maxProfit = Math.max(maxProfit, prices.get(i)-minPrice);
        }
        return maxProfit;
    }
    static void _getMinAtPop(Stack<Integer>stack)
    {
        // your code here
        int [] nums = new int[stack.size()];
        for(int i = 0 ;i<nums.length;i++)
        {
            nums[i] = stack.pop();
        }
        for(int i = nums.length-1 ;i>=0;i--)
        {
            stack.push(nums[i]);
        }
        Arrays.sort(nums);
        int i = 0;
        while (!stack.isEmpty())
        {
            int curr = stack.pop();
            if (curr == nums[i] && i < nums.length)
            {
                i++;
            }
            int min = Math.min(curr,nums[i]);
            System.out.print(min + " ");
        }
    }
    public static Queue<Integer> reverseQueue(Queue<Integer> q) {
        // add code here.
        if (q.isEmpty())
           return q;
        int curr = q.poll();

        reverseQueue(q);

        q.add(curr);
        return q;
    }
    public static int pathSum(Binarytrees.Node root)
    {
        if(root==null)
            return 0;

        int leftsum = pathSum(root.left);
        int rightSum = pathSum(root.right);


        int sum = root.data + leftsum + rightSum;
        return sum;

    }
    static int sum = 0;
    public static  boolean hasPathSum(Binarytrees.Node root, int targetSum) {

        if (root == null)
            return false;

        if (root.left == null && root.right == null && root.data == targetSum)
            return true;

        return hasPathSum(root.left, targetSum - root.data) || hasPathSum(root.right, targetSum - root.data);
    }
    static List<Integer> list = new ArrayList<>();
    public static List<Integer> preorderTraversal(Binarytrees.Node root) {

        if (root == null)
            return list;

        list.add(root.data);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
    public static void main(String[] args) {
       Binarytrees.Node root = new Binarytrees.Node(1);
        root.left = new Binarytrees.Node(2);
        root.right = new Binarytrees.Node(5);
        root.left.left = new Binarytrees.Node(3);
        root.left.right = new Binarytrees.Node(4);
        root.right.left = new Binarytrees.Node(6);
        root.right.right = new Binarytrees.Node(7);

//        System.out.println(root.data+pathSum(root.left));
//        System.out.println(pathSum(root.right));
//        System.out.println(lca2(root,4,6).data);
//        System.out.println(minDistance(root,6,8));
        System.out.println(hasPathSum(root,7));

        List<Integer> list = preorderTraversal(root);
        System.out.println(list);

    }
}
