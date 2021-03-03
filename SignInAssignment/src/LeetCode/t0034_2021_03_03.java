package LeetCode;

public class t0034_2021_03_03 {
	class Solution {
	    public int[] searchRange(int[] nums, int target) {
	        int key = findKey(nums,target,0,nums.length-1);
	        if(key == -1){
	            int[] re = {-1,-1};
	            return re;
	        }
	        else{
	            int left = key;
	            while(left > 0){
	                if(nums[left-1] == target)
	                    left--;
	                else break;
	            }
	            int right = key;
	            while(right < nums.length-1){
	                if(nums[right+1] == target)
	                    right++;
	                else break;
	            }
	            int[] re = {left,right};
	            return re;
	        }
	    }
	    int findKey(int[] nums,int target,int start,int end){
	        if(start > end) return -1;
	        int middle = (start + end) / 2;
	        if(nums[middle] == target) return middle;
	        else if(nums[middle] > target)
	            return findKey(nums,target,start,middle-1);
	        else 
	            return findKey(nums,target,middle+1,end);
	    }
	}
}
