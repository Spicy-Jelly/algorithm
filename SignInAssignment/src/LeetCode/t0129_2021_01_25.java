package LeetCode;

public class t0129_2021_01_25 {

	  //Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
	 
	static class Solution {
	    static int sum = 0;
	    public int sumNumbers(TreeNode root) {
	        if(root == null) return 0;
	        dfs(root,0);
	        int re = sum;
	        sum = 0;
	        return re;
	    }
	    private void dfs(TreeNode root,int current){
	        if(root == null) return;
	        if(root.left == null && root.right == null){
	            current = current * 10 + root.val;
	            sum += current;
	            return;
	        }
	        current = current * 10 + root.val;
	        dfs(root.left,current);
	        dfs(root.right,current);
	    }
	}
}
