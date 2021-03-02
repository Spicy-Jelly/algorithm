package LeetCode;

public class t0896_2021_02_28 {
	class Solution {
	    public boolean isMonotonic(int[] A) {
	        if(A.length == 1) return true;
	        int current = 0;
	        for(int i = 0; i < A.length - 1; i++){
	            int result = A[i] - A[i+1];
	            if(current == 0) current = result;
	            else
	                if(current * result < 0) return false;
	        }
	        return true;
	    }
	}
}
