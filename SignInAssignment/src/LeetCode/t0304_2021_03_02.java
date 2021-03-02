package LeetCode;

public class t0304_2021_03_02 {
	class NumMatrix {
	    int[][] sumMatrix;
	    public NumMatrix(int[][] matrix) {
	        if(matrix.length == 0) return;
	        sumMatrix = new int[matrix.length][matrix[0].length];
	        sumMatrix[0][0] = matrix[0][0];
	        for(int i = 1; i < matrix[0].length; i++) sumMatrix[0][i] = sumMatrix[0][i-1] + matrix[0][i];
	        for(int i = 1; i < matrix.length; i++) sumMatrix[i][0] = sumMatrix[i-1][0] + matrix[i][0];

	        for(int i = 1; i < matrix.length; i++)
	            for(int j = 1; j < matrix[0].length; j++){
	                sumMatrix[i][j] = sumMatrix[i-1][j] + sumMatrix[i][j-1] + matrix[i][j] - sumMatrix[i-1][j-1];
	            }
	    }
	    
	    public int sumRegion(int row1, int col1, int row2, int col2) {
	        if(row1 == 0 && col1 == 0)
	            return sumMatrix[row2][col2];
	        else if(row1 == 0)
	            return sumMatrix[row2][col2] - sumMatrix[row2][col1-1];
	        else if(col1 == 0)
	            return sumMatrix[row2][col2] - sumMatrix[row1-1][col2];
	        else
	            return sumMatrix[row2][col2] - sumMatrix[row2][col1-1] - sumMatrix[row1-1][col2] + sumMatrix[row1-1][col1-1];
	    }
	}

	/**
	 * Your NumMatrix object will be instantiated and called as such:
	 * NumMatrix obj = new NumMatrix(matrix);
	 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
	 */
}
