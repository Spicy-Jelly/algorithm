package LeetCode;

public class t0867_2021_02_25 {
	class Solution {
	    public int[][] transpose(int[][] matrix) {
	        int[][] re = new int[matrix[0].length][matrix.length];
	        for(int i = 0; i < matrix.length; i++)
	            for(int j = 0; j < matrix[0].length; j++)
	                re[j][i] = matrix[i][j];
	        return re;
	    }
	}
}
