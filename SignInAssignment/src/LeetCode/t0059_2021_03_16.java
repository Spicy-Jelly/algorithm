package LeetCode;

public class t0059_2021_03_16 {
	class Solution {
	    public int[][] generateMatrix(int n) {
	        int[][] re = new int[n][n];
	        int count = 1;
	        int i = 0;
	        int j = -1;
	        int direction = 0;
	        while(count <= n * n){
	            if(direction == 0){
	                j++;
	                if(j == n || re[i][j] != 0){
	                    j--;
	                    direction = 1;
	                    continue;
	                }
	                re[i][j] = count++;
	            }
	            else if(direction == 1){
	                i++;
	                if(i == n || re[i][j] != 0){
	                    i--;
	                    direction = 2;
	                    continue;
	                }
	                re[i][j] = count++;
	            }
	            else if(direction == 2){
	                j--;
	                if(j == -1 || re[i][j] != 0){
	                    j++;
	                    direction = 3;
	                    continue;
	                }
	                re[i][j] = count++;
	            }
	            else if(direction == 3){
	                i--;
	                if(i == -1 || re[i][j] != 0){
	                    i++;
	                    direction = 0;
	                    continue;
	                }
	                re[i][j] = count++;
	            }
	        }
	        return re;
	    }
	}
}
