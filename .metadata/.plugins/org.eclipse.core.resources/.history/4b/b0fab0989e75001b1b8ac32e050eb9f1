package LeetCode;

public class t0485_2021_2_15 {
	class Solution {
	    public int findMaxConsecutiveOnes(int[] nums) {
	        int max = 0;
	        int current = 0;
	        for(int i = 0; i < nums.length; i++)
	            if(nums[i] == 0) current = 0;
	            else{
	                current++;
	                if(current > max) max = current;
	            }
	        return max;
	    }
	}
}
