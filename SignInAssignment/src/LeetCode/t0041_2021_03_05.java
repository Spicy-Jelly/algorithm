package LeetCode;

public class t0041_2021_03_05 {
	class Solution {
	    public int firstMissingPositive(int[] nums) {
	        int[] count = new int[nums.length+2];
	        for(int i = 0; i < nums.length; i++){
	            if(nums[i] > 0 && nums[i] < count.length)
	                count[nums[i]]++;
	        }
	        for(int i = 1; i < count.length; i++){
	            if(count[i] == 0) return i;
	        }
	        return 0;
	    }
	}
}
