package LeetCode;

/**
 * 使用并查集方法，
 * 并查集可以用于寻找图是否有环路，并可以知道每个节点的根
 * 利用parent数组标注出每个节点的根
 * 当两个节点的根是相同的时候，说明这条边是冗余的
 * @param edges
 * @return
 */

public class t0684_2021_01_15 {
	class Solution {
	    public int[] findRedundantConnection(int[][] edges) {
	        //record array and init
	        int[] array = new int[edges.length+1];
	        init(array);
	        int[] re = new int[2];
	        //algorithm
	        for(int i = 0; i < edges.length; i++){
	            int key1 = edges[i][0]; int key2 = edges[i][1];
	            int rootKey1 = find_root(key1,array);
	            int rootKey2 = find_root(key2,array);
	            if(rootKey1 == rootKey2){re[0] = key1; re[1] = key2;}
	            else array[rootKey2] = rootKey1;
	        }
	        return re;
	    }

	    public void init(int[] array){
	        for(int i = 1; i < array.length; i++)
	            array[i] = -1;
	    }
	    public int find_root(int key,int[] array){
	        int parent = array[key];
	        if(parent == -1) return key;
	        else{
	            return find_root(parent,array);
	        }
	    }
	}
}
