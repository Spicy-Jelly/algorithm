package LeetCode;

public class t1232_2021_1_17 {
	//这题可以有更好解法
	class Solution {
	    public boolean checkStraightLine(int[][] coordinates) {
	        int x0 = coordinates[0][0]; int y0 = coordinates[0][1];
	        int x1 = coordinates[1][0]; int y1 = coordinates[1][1];
	        if(x0 == x1){
	            double k = (x0 - x1);
	            for(int i = 2; i < coordinates.length; i++){
	                double k_current = x0 - coordinates[i][0];
	                if(k_current != k) return false;
	            }
	        }
	        else{
	            double k = (y0 - coordinates[1][1] + 1.0 - 1.0) / (x0 - coordinates[1][0]);
	            for(int i = 2; i < coordinates.length; i++){
	                if(x0 - coordinates[i][0] == 0) return false;
	                double k_current = (y0 - coordinates[i][1] + 1.0 - 1.0) / (x0 - coordinates[i][0]);
	                if(k_current != k) return false;
	            }
	        }
	        
	        return true; 
	    }
	}
}
