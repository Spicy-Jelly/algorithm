package LeetCode;

public class t0766_2021_2_22 {
	class Solution {
	    public boolean isToeplitzMatrix(int[][] matrix) {
	        //column count
	        for(int q = 0; q < matrix.length; q++){
	            int key = matrix[q][0];
	            for(int i = q,j = 0; i < matrix.length && j < matrix[0].length; i++,j++){
	                if(key != matrix[i][j]) return false;
	            }
	        }
	        //volumn count
	        for(int q = 0; q < matrix[0].length; q++){
	            int key = matrix[0][q];
	            for(int i = 0,j = q; j < matrix[0].length && i < matrix.length; i++,j++){
	                if(key != matrix[i][j]) return false;
	            }
	        }
	        return true;
	    }
	}
}
