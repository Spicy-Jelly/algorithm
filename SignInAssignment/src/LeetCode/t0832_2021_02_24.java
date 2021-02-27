package LeetCode;

public class t0832_2021_02_24 {
	class Solution {
	    public int[][] flipAndInvertImage(int[][] A) {
	        for(int i = 0; i < A.length; i++){
	            int left = 0;
	            int right = A[0].length - 1;
	            while(left < right){
	                if(A[i][left] == A[i][right]){
	                    A[i][left] = 1 - A[i][left];
	                    A[i][right] = 1 - A[i][right];
	                }
	                left++; right--;
	            }
	            if(left == right) A[i][left] = 1 - A[i][left];
	        }
	        return A;
	    }
	}
}
