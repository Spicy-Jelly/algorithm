package LeetCode;

public class t0665_2021_2_7 {
	class Solution {
	    public boolean checkPossibility(int[] nums) {
	        int node = -1;
	        int segment = 1;
	        for(int i = 1; i < nums.length; i++)
	            if(nums[i] < nums[i-1]){
	                segment++;
	                node = i;
	            }
	        if(node == -1) return true;
	        if(segment > 2) return false;
	        if(node == nums.length -1 || node == 1) return true;
	        else if(nums[node-1] > nums[node+1] && nums[node-2] > nums[node]) return false;
	        else return true;
	        
	    }
	}
}
