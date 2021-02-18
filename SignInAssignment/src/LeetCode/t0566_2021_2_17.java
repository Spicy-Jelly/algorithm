package LeetCode;

public class t0566_2021_2_17 {
	class Solution {
	    public int[][] matrixReshape(int[][] nums, int r, int c) {
	        if(nums.length * nums[0].length != r * c) return nums;
	        int[][] re = new int[r][c];
	        for(int i1 = 0; i1 < nums.length; i1++)
	            for(int j1 = 0; j1 < nums[0].length; j1++){
	                int sum = i1*nums[0].length + j1;
	                re[sum/re[0].length][sum%re[0].length] = nums[i1][j1];
	            }
	        return re;
	    }
	}
}
