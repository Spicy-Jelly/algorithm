package LeetCode;

import java.util.LinkedList;

public class t0005_2021_1_27 {
	class Solution {
	    public String longestPalindrome(String s) {
	        int max = 0;
	        String reStr = "";
	        for(double center = 0; center < s.length(); center += 0.5){
	            int current = 0;
	            LinkedList<Character> currentStr = new LinkedList<Character>();
	            //单中心
	            if(center % 1 == 0){
	                current = findSubString(s,(int)center,currentStr);
	            }
	            //双中心
	            else{
	                int left = (int)center;
	                int right = left + 1;
	                current = findSubString(s,left,right,currentStr);
	            }
	            if(current > max){
	                reStr = "";
	                max = current;
	                for(char i : currentStr)
	                    reStr += Character.toString(i);
	            }
	        }
	        return reStr;                                                
	    }
	    int findSubString(String s,int center,LinkedList<Character> currentStr){
	        int re = 1;
	        currentStr.add(s.charAt(center));
	        int leftIterator = center - 1;
	        int rightIterator = center + 1;
	        while(leftIterator >= 0 && rightIterator < s.length()){
	            if(s.charAt(leftIterator) == s.charAt(rightIterator)){
	                currentStr.addFirst(s.charAt(leftIterator));
	                currentStr.add(s.charAt(rightIterator));
	                re+= 2;
	                leftIterator--;
	                rightIterator++;
	            } 
	            else break;
	        }
	        return re;
	    }
	    int findSubString(String s,int left,int right,LinkedList<Character> currentStr){
	        int re = 0;
	        while(left >= 0 && right < s.length()){
	            if(s.charAt(left) == s.charAt(right)){
	                currentStr.addFirst(s.charAt(left));
	                currentStr.add(s.charAt(right));
	                re += 2;
	                left --;
	                right ++;
	            }
	            else break;
	        }
	        return re;
	    }
	}
}
