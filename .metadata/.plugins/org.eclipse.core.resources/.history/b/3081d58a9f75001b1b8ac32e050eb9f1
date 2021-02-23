package LeetCode;

public class t1423_2021_2_6 {
	class Solution {
	    public int maxScore(int[] cardPoints, int k) {
	        int sum = 0;
	        for(int i = 0; i < cardPoints.length; i++) sum += cardPoints[i];
	        int left = 0;
	        int right = cardPoints.length - k;
	        int currentnum = 0;
	        int min = 0;
	        for(int i = 0; i < right; i++) currentnum += cardPoints[i];
	        min = currentnum;
	        while(right != cardPoints.length){
	            right++;
	            currentnum += cardPoints[right - 1];
	            currentnum -= cardPoints[left];
	            left++;
	            if(min > currentnum) min = currentnum;
	        }
	        return sum - min;

	    }
	}
}
