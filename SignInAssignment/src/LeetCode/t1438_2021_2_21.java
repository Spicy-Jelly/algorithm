package LeetCode;

public class t1438_2021_2_21 {
	class Solution {
	    public int longestSubarray(int[] nums, int limit) {
	        int min = Integer.MAX_VALUE;
	        int max = Integer.MIN_VALUE;
	        int left = 0;
	        int right = 0;
	        int re = 0;
	        while(right < nums.length){
	            right++;
	            if(nums[right-1] < min) min = nums[right-1]; 
	            if(nums[right-1] > max) max = nums[right-1];

	            if(max - min > limit){
	                //iterator,find last position of max and min
	                int maxi = 0,mini = 0;
	                for(int i = left; i < right; i++){
	                    if(nums[i] == max) maxi = i;
	                    if(nums[i] == min) mini = i;
	                }
	                if(maxi > mini) left = mini+1;
	                else left = maxi+1;
	                max = nums[left];min = nums[left];
	                for(int i = left+1; i < right; i++){
	                    if(nums[i] > max) max = nums[i];
	                    if(nums[i] < min) min = nums[i];
	                }
	                
	            }
	            if(right - left > re) re = right - left;
	        }
	        return re;
	    }
	}
}
