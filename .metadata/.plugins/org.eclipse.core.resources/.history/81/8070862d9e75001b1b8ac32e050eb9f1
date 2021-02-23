package LeetCode;

public class t0014_2021_2_10 {
	class Solution {
	    public String longestCommonPrefix(String[] strs) {
	        if(strs.length == 0) return "";
	        String re = "";
	        for(int i = 0;i < strs[0].length();i++){
	            char key = strs[0].charAt(i);
	            for(int q = 1; q < strs.length; q++){
	                if(i >= strs[q].length()) return re;
	                if(key != strs[q].charAt(i)) return re;
	            }
	            re = re + Character.toString(key);
	        }
	        return re;
	    }
	}
}
