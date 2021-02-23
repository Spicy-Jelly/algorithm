package LeetCode;

import java.util.HashSet;

public class t0839_2021_1_31 {
	class Solution {
	    public int numSimilarGroups(String[] strs) {
	        //init
	        int parent[] = new int[strs.length];
	        for(int i = 0; i < parent.length; i++) parent[i] = -1;
	        // disjoin set algorithm
	        for(int i = 0; i < parent.length; i++)
	            for(int j = i + 1; j < parent.length; j++){
	                String s1 = strs[i];
	                String s2 = strs[j];
	                boolean check = JudgeSimalar(s1,s2);
	                if(check == true){
	                    int rooti = findRoot(i,parent);
	                    int rootj = findRoot(j,parent);
	                    if(rooti != rootj){
	                        parent[rootj] = rooti;
	                    }//if
	                }//if
	            }//for
	        int re = 0;
	        for(int i = 0; i < parent.length; i++)
	            if(parent[i] == -1) re++;
	        return re;
	    }
	    boolean JudgeSimalar(String s1,String s2){
	        HashSet<Character> set = new HashSet<Character>();
	        int check = 0;
	        for(int i = 0; i < s1.length(); i++){
	            if(set.size() > 2 || check > 2) return false;
	            if(s1.charAt(i) != s2.charAt(i)){
	                check++;
	                set.add(s1.charAt(i));
	                set.add(s2.charAt(i));
	            }
	        }
	        return true;
	    }
	    int findRoot(int x, int[] parent){
	        if(parent[x] == -1) return x;
	        else return findRoot(parent[x],parent);
	    }
	}
}
