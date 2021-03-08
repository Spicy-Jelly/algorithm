package LeetCode;

public class t0132_2021_03_08 {
	class Solution {
	    public int minCut(String s) {
	        //init dp
	        boolean[][] dp = new boolean[s.length()][s.length()];
	        for(int i = 0; i < s.length(); i++)
	            for(int j = 0; j <= i; j++)
	                dp[i][j] = true;
	        for(int i = s.length() - 2; i >= 0; i --)
	            for(int j = i + 1; j < s.length(); j++)
	                dp[i][j] = dp[i+1][j-1] && (s.charAt(i) == s.charAt(j));
	        
	        int[] dp2 = new int[s.length()];
	        for(int i = 1; i < dp2.length; i++){
	            int min = dp2[i-1] + 1;
	            for(int j = 0; j < i; j++){
	                if(dp[j][i] == true){
	                    if(j==0) min = 0;
	                    else{
	                        if(dp2[j-1] + 1 < min) min = dp2[j-1] + 1;
	                    }
	                }
	            }
	            dp2[i] = min;
	        }
	        return dp2[dp2.length - 1];
	    }
	}
}
