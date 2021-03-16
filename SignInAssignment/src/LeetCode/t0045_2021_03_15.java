package LeetCode;

public class t0045_2021_03_15 {
	class Solution {
	    public int jump(int[] nums) {
	        int[] dp = new int[nums.length];
	        for(int i = 0; i < nums.length; i++){
	            int key = nums[i];
	            int current = dp[i];
	            for(int q = i+1; q < dp.length && q <= i + key; q++){
	                if(dp[q] == 0) dp[q] = current + 1;
	                else
	                    dp[q] = Math.min(dp[q],current+1);
	                
	            }//for
	        }
	        return dp[dp.length - 1];
	    }
	}
}
