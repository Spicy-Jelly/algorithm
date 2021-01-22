
public class t803_2021_1_16 {
	
	class Solution1 {
	    public int[] hitBricks(int[][] grid, int[][] hits) {
	        //init root array
	        int[] parent = new int[grid.length * grid[0].length];
	        for(int i = 0; i < parent.length; i++) parent[i] = -1;
	        //bottom-top update total thought
	        for(int i = 0; i < hits.length;i++)
	            grid[hits[i][0]][hits[i][1]] = 0;
	        //disjoint set algorithm
	        for(int x = grid.length-1 ; x >= 0; x--)
	            for(int y = grid[x].length-1 ; y >= 0; y--){
	                //checkout whether it is a brick
	                if(grid[x][y] == 1){
	                    //merge set
	                    mergeSet(grid,x,y,parent);
	                }
	            }
	        //count node that meet the conditions
	        int current = countNode(parent,grid);
	        //init re array
	        int[] re = new int[hits.length];
	        for(int i = hits.length-1; i >= 0; i--){
	            //recovery situations
	            grid[hits[i][0]][hits[i][1]] = 1;
	            mergeSet(grid,hits[i][0],hits[i][1],parent);
	            re[i] = countNode(parent,grid) - current;
	            current += re[i];
	        }
	        return re;
	    }
	    private void mergeSet(final int[][]grid,int x,int y,int[] parent){
	        //four directions merge

	        //top
	        if(x > 0 && grid[x - 1][y] == 1) Merge(x,y,x-1,y,grid[0].length,parent);
	        //bottom
	        if(x < grid.length -1 && grid[x + 1][y] == 1) Merge(x,y,x+1,y,grid[0].length,parent);
	        //left
	        if(y > 0 && grid[x][y-1] == 1) Merge(x,y,x,y-1,grid[0].length,parent);
	        //right
	        if(y < grid[0].length -1 && grid[x][y+1] == 1) Merge(x,y,x,y+1,grid[0].length,parent);
	    }
	    //merge detail ,just to service for mergeSet
	    private void Merge(int X,int Y,int x,int y,int sizeX,int[] parent){
	        int Node = X * sizeX + Y;
	        int Root = findRoot(parent,Node);
	        int node = x * sizeX + y;
	        int root = findRoot(parent,node);
	        if(root != Root){
	            if(root < Root) parent[Root] = root;
	            else parent[root] = Root;
	        }
	    }
	    private int findRoot(int[] parent,int Node){
	        if(parent[Node] == -1) return Node;
	        else return findRoot(parent,parent[parent[Node]]);
	    }
	    private int countNode(int[] parent,int[][] grid){
	        //count how many brick meet conditions
	        int re = 0;
	        for(int x = grid.length-1 ; x >= 0; x--)
	            for(int y = grid[x].length-1 ; y >= 0; y--){
	                if(grid[x][y] == 1){
	                    int root = findRoot(parent,x*grid[x].length + y);
	                    if(root < grid[x].length) re++;
	                }
	            }
	        return re;
	    }
	}
}
