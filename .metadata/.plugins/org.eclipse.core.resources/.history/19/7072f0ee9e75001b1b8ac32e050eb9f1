package LeetCode;

public class t0674_2021_1_24 {
	class Solution {
	    public int findLengthOfLCIS(int[] nums) {
	        if(nums.length == 0) return 0;
	        //DP algorithm
	        //init
	        int Maxlen = 1;
	        int currentlen = 1;
	        int latest_num = nums[0];
	        //iterator 
	        for(int i = 1; i < nums.length; i++){
	            //it match the requirement, update currentlen, and compare with re
	            if(nums[i] > latest_num){
	                currentlen++;
	                latest_num = nums[i];
	                if(currentlen > Maxlen) Maxlen = currentlen;
	            }
	            //it does not , calcuate it again
	            else{
	                currentlen = 1;
	                latest_num = nums[i];
	            }
	        }//for
	        return Maxlen;
	    }
	}
}
