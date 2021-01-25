package practice;

public class t0959_2021_1_25 {
	class Solution {
	    public int regionsBySlashes(String[] grid) {
	        //init parent array
	        int[] parent = new int[grid.length * grid[0].length() * 4];
	        for(int i = 0; i < parent.length; i++) parent[i] = -1;
	        //disjoin set algorithm
	        for(int i = 0; i < grid.length; i++){ //col
	            for(int j = 0; j < grid[0].length(); j++){
	                //situation 1,divide into 2 set
	                int key = (i * grid[0].length() + j) * 4;
	                if(grid[i].charAt(j) == '/'){
	                    parent[key + 1] = key;
	                    parent[key + 3] = key + 2;
	                }
	                else if(grid[i].charAt(j) == ' '){
	                    parent[key + 1] = key;
	                    parent[key + 2] = key;
	                    parent[key + 3] = key;
	                }
	                else if(grid[i].charAt(j) == '\\'){
	                    parent[key + 3] = key;
	                    parent[key + 2] = key + 1;
	                }
	                //join top set
	                if(i != 0){
	                    int rootCurrent = findRoot(key,parent);
	                    int rootTop = findRoot(((i - 1)*grid[0].length() + j) * 4 + 2,parent);
	                    if(rootCurrent != rootTop)
	                        parent[rootCurrent] = rootTop;
	                }
	                //join left set
	                if( j != 0){
	                    int rootCurrent = findRoot(key + 1,parent);
	                    int rootLeft = findRoot((i*grid[0].length() + j-1) * 4 + 3,parent);
	                    if(rootCurrent != rootLeft)
	                        parent[rootCurrent] = rootLeft;
	                }
	            }//for j
	        }//for i
	        //check how much set
	        int re = 0;
	        for(int i = 0; i < parent.length; i++)
	            if(parent[i] == -1) re++;
	        return re;
	    }
	    int findRoot(int node,int[] parent){
	        if(parent[node] == -1) return node;
	        else return findRoot(parent[node], parent);
	    }
	}
}
