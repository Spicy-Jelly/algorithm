package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class t0131_2021_03_07 {
	class Solution {
	    public List<List<String>> partition(String s) {
	        //dp���������
	        boolean[][] dp = new boolean[s.length()][s.length()];
	        for(int i = 0; i < s.length(); i++)
	            for(int j = 0; j <= i; j++)
	                dp[i][j] = true;
	        for(int i = s.length()-2; i >= 0; i--)
	            for(int j = i+1; j < s.length(); j++)
	                dp[i][j] = dp[i+1][j-1] && (s.charAt(i) == s.charAt(j));

	        List<List<String>> re = new ArrayList<List<String>>();
	        List<String> current = new ArrayList<String>();
	        backtrack(s,re,current,dp,0);    
	        return re;
	    }
	    private void backtrack(String s,List<List<String>> re,List<String> current,boolean[][] dp,int start){
	        if(start == s.length()){
	            ArrayList<String> utimate = new ArrayList<String>(current);
	            re.add(utimate);
	            return;
	        }
	        for(int j = start; j < s.length(); j++){
	            if(dp[start][j] == true){
	                current.add(s.substring(start,j+1));
	                backtrack(s,re,current,dp,j+1);
	                current.remove(current.size()-1);
	            }
	        }
	        return;
	    }
	}
}
