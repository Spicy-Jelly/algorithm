package LeetCode;

public class t0643_2021_02_04 {
	class Solution {
	    public double findMaxAverage(int[] nums, int k) {
	        int max = 0;
	        int current = 0;
	        int i = 0, j = k - 1;
	        for(int q = i; q <= j; q++) current += nums[q];
	        max = current;
	        while(j < nums.length - 1){
	            current -= nums[i];
	            i++; j++;
	            current += nums[j];
	            if(current > max) max = current;
	        }//while
	        double Max = (double)max;
	        double re = Max / k ;
	        return re;
	    }
	}
}
