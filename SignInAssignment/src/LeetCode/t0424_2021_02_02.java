package LeetCode;

public class t0424_2021_02_02 {
	class Solution {
	    public int characterReplacement(String s, int k) {
	        if(s.length() == 0) return 0;
	        //init
	        int left = 0, right = 1;
	        int[] sub = new int[26];
	        sub[s.charAt(0) - 'A'] ++;
	        int maxCharNum = 1;
	        int maxLen = 0;
	        int currentLen = 1;       
	        //slid windows
	        while(right <= s.length()){
	            if(currentLen <= k + maxCharNum){
	                if(currentLen > maxLen) maxLen = currentLen;
	                if(right == s.length()) break;
	                right++;
	                sub[s.charAt(right - 1) - 'A']++;
	                maxCharNum = updateMaxNumber(sub, s.charAt(right - 1) - 'A', maxCharNum);
	                currentLen = right - left;
	            }
	            else{
	                sub[s.charAt(left) - 'A']--;
	                left++;
	                currentLen--;
	                maxCharNum = updateMaxNumber(sub);
	            }
	        }
	        return maxLen;
	    }
	    int updateMaxNumber(int[] sub,int k,int maxCharNum){
	        if(sub[k] > maxCharNum) return sub[k];
	        else return maxCharNum;
	    }
	    int updateMaxNumber(int[] sub){
	        int max = 0;
	        for(int i = 0; i < sub.length; i++)
	            if(max < sub[i]) max = sub[i];
	        return max;
	    }
	    int updateMaxLen(int maxLen,int currentLen){
	        if(currentLen > maxLen) return currentLen;
	        else return maxLen;
	    }
	}
}
