package LeetCode;

public class t0073_2021_03_21 {
	class Solution {
	    public void setZeroes(int[][] matrix) {
	        for(int i = 0; i < matrix.length; i++)
	            for(int j = 0; j < matrix[0].length; j++)
	                if(matrix[i][j] == 0)
	                    setPartlyZeroes(matrix,i,j);
	        for(int i = 0; i < matrix.length; i++)
	            for(int j = 0; j < matrix[0].length; j++)
	                if(matrix[i][j] == -999)
	                    matrix[i][j] = 0;
	                    
	    }
	    void setPartlyZeroes(int[][] matrix,int x,int y){
	        for(int i = 0; i < matrix.length; i++)
	            if(matrix[i][y] != 0) matrix[i][y] = -999;
	        for(int j = 0; j < matrix[0].length; j++)
	            if(matrix[x][j] != 0) matrix[x][j] = -999;
	    }
	}
}
