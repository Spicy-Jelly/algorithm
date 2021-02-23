package LeetCode;

public class t0035_2021_02_15 {
	class Solution {
	    public int searchInsert(int[] nums, int target) {
	        int re = findelement(nums,target,0,nums.length-1);
	        return re;
	    }
	    int findelement(final int[] nums,final int target,int start,int end){
	        if(nums[end] < target) return end+1;
	        if(start == end) return start;
	        int mid = (start + end) / 2;
	        if(nums[mid] >= target)
	            return findelement(nums, target, start, mid);
	        else 
	            return findelement(nums, target, mid+1, end);
	    }
	}
}
