package LeetCode;

public class t0724_2021_01_28 {
	class Solution {
	    public int pivotIndex(int[] nums) {
	        if(nums.length == 0) return -1;
	        //init sum and current number, calculate the sum
	        int sum = 0;
	        for(int i = 0; i < nums.length; i++) sum += nums[i];
	        int current = 0;
	        //if left == right, that is the index we should find
	        for(int i = 0; i < nums.length; i++){
	            if(current == sum - nums[i] - current) return i;
	            current += nums[i];
	        }
	        return -1;
	    }
	}
}
