package LeetCode;

import java.util.Arrays;

public class t0016_2021_02_22 {
	class Solution {
	    public int threeSumClosest(int[] nums, int target) {
	        int D_value = Integer.MAX_VALUE;
	        int re = 0;
	        Arrays.sort(nums);
	        for(int i = 0; i < nums.length - 1; i++){
	            int left = i + 1;
	            int right = nums.length - 1;
	            while(left != right){
	                int current = nums[i] + nums[left] + nums[right];
	                int currentDvalue = Math.abs(current - target);
	                if(currentDvalue < D_value){
	                    D_value = currentDvalue;
	                    re = current;
	                }

	                if(current == target) return current;
	                else if(current > target)
	                    right--;
	                else
	                    left++;
	            }
	        }
	        return re;
	    }
	}
}
