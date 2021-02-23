package LeetCode;

public class t0765_2021_02_14 {
	class Solution {
	    public int minSwapsCouples(int[] row) {
	        //init
	        int N = row.length / 2; //ÇéÂÂ¶ÔÊı
	        int[] lover = new int[N];
	        int[] setsize = new int[N];
	        for(int i = 0; i < lover.length; i++) lover[i] = -1;
	        for(int i = 0; i < setsize.length; i++) setsize[i] = 1;

	        //disjoint set
	        for(int i = 0; i < row.length; i += 2){
	            int couple1 = row[i] / 2;
	            int couple2 = row[i+1] / 2;
	            if(couple1 == couple2) continue;
	            int c1Root = findRoot(lover,couple1);
	            int c2Root = findRoot(lover,couple2);
	            if(c1Root != c2Root) {
	                lover[c2Root] = c1Root;
	                setsize[c1Root] += setsize[c2Root];
	            }
	        }
	        //calculate result
	        int re = 0;
	        for(int i = 0; i < lover.length; i++)
	            if(lover[i] == -1) re += setsize[i] - 1;
	        return re;
	    }
	    private int findRoot(final int[] lover,int couple){
	        if(lover[couple] == -1) return couple;
	        else return findRoot(lover,lover[couple]);
	    }
	}
}
