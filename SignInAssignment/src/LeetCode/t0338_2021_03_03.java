package LeetCode;

public class t0338_2021_03_03 {
	class Solution {
	    public int[] countBits(int num) {
	        int[] count = new int[num+1];
	        count[0] = 0;
	        for(int i = 1; i <= num; i++){
	            if(i % 2 == 1) count[i] = count[i-1] + 1;
	            else count[i] = count[i/2];
	        }
	        return count;
	    }
	}
}
