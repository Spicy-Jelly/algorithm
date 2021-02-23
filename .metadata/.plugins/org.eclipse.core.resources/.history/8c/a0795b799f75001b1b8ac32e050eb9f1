package LeetCode;

public class t1208_2021_2_5 {
	class Solution {
	    public int equalSubstring(String s, String t, int maxCost) {
	        int[] cost = new int[s.length()];
	        for(int i = 0; i < s.length(); i++)
	            cost[i] = Math.abs(s.charAt(i) - t.charAt(i));
	        //»¬¶¯´°¿Ú
	        int currentCost = 0;
	        int maxLen = 0;
	        int currentLen = 0;
	        for(int left = 0,right = 1; right <= cost.length;){
	            if(currentCost + cost[right - 1] <= maxCost){
	                currentCost += cost[right - 1];
	                currentLen++;
	                if(currentLen > maxLen) maxLen = currentLen;
	                right++;
	            }
	            else{
	                currentCost -= cost[left];
	                currentLen--;
	                left++;
	            }
	        }
	        return maxLen;
	    }
	}
}
