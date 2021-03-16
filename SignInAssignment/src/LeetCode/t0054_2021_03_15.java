package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class t0054_2021_03_15 {
	class Solution {
	    public List<Integer> spiralOrder(int[][] matrix) {
	        List<Integer> list = new ArrayList<Integer>();
	        int direction = 0;
	        int i = 0;int j = 0;
	        while(list.size() < matrix.length * matrix[0].length){
	            list.add(matrix[i][j]);
	            matrix[i][j] = 0;
	            if(direction == 0){
	                j++;
	                if(j == matrix[0].length || matrix[i][j] == 0){
	                    j--;
	                    i++;
	                    direction = 1;
	                }
	            }
	            else if(direction == 1){
	                i++;
	                if(i == matrix.length || matrix[i][j] == 0){
	                    i--;
	                    j--;
	                    direction = 2;
	                }
	            }
	            else if(direction == 2){
	                j--;
	                if(j == -1 || matrix[i][j] == 0){
	                    j++;
	                    i--;
	                    direction = 3;
	                }
	            }
	            else if(direction == 3){
	                i--;
	                if(i == -1 || matrix[i][j] == 0){
	                    i++;
	                    j++;
	                    direction = 0;
	                }
	            }
	        }
	        return list;
	    }
	}
}
