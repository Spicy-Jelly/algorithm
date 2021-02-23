package LeetCode;

public class t0200_2021_01_31 {
	class Solution {
	    public int numIslands(char[][] grid) {
	        //init
	        int[] parent = new int[grid.length * grid[0].length];
	        for(int i = 0; i < parent.length; i++) parent[i] = -1;

	        for(int i = 0; i < grid.length; i++)
	            for(int j = 0; j < grid[0].length; j++){
	                if(grid[i][j] == '1'){
	                    //right
	                    if(j < grid[0].length - 1 && grid[i][j+1] == '1'){
	                        int root1 = findRoot(parent,i * grid[0].length + j);
	                        int root2 = findRoot(parent,i * grid[0].length + j+1);
	                        if(root1 != root2) parent[root2] = root1;
	                    }
	                    //down
	                    if(i < grid.length - 1 && grid[i+1][j] == '1'){
	                        int root1 = findRoot(parent,i * grid[0].length + j);
	                        int root2 = findRoot(parent,(i+1) * grid[0].length + j);
	                        if(root1 != root2) parent[root2] = root1;
	                    }
	                }
	                else parent[i * grid[0].length + j] = -2;
	            }
	        int re = 0;
	        for(int i = 0; i < parent.length; i++)
	            if(parent[i] == -1) re++;
	        return re;
	    }
	    int findRoot(int[] parent,int x){
	        if(parent[x] == -1) return x;
	        else return findRoot(parent, parent[x]);
	    }
	}
}
