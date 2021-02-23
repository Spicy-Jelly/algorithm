package LeetCode;

public class t1319_2021_1_23 {
	class Solution {
	    public int makeConnected(int n, int[][] connections) {
	        //init array parent 
	        int[] parent = new int[n];
	        for(int i = 0; i < parent.length; i++) parent[i] = -1;
	        //init value of useful line which can be used to join node
	        int usefulLine = 0;
	        //disjoint set
	        //we have to iterator every edge to see whether node is in the same set
	        for(int i = 0; i < connections.length; i++){
	            //get two node which are connected by edge[i]
	            int x = connections[i][0]; int y = connections[i][1];
	            //find these two node's root;
	            int rootx = findRoot(x,parent); int rooty = findRoot(y,parent);
	            //if they are in the same set , useful line increase
	            if(rootx == rooty) usefulLine ++;
	            //if they are not in the same set, join these two set
	            else parent[rooty] = rootx;
	        }//for edge
	        //check parent , how many set
	        int setNum = 0;
	        for(int i = 0; i < parent.length; i++)
	            if(parent[i] == -1) setNum++;
	        //if usefulLine can be fully used
	        if(usefulLine >= setNum -1) return setNum-1;
	        else return -1;
	    }
	    //find root mathod
	    private int findRoot(int x,int[] parent){
	        if(parent[x] == -1) return x;
	        else return findRoot(parent[x], parent);
	    }
	}
}
