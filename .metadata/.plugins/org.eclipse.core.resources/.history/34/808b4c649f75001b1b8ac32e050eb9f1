package LeetCode;

public class t1004_2021_2_19 {
	class Solution {
	    public int longestOnes(int[] A, int K) {
	        int left = 0 , right = 0;
	        int re = 0;
	        while(right < A.length){
	            int indexValue = A[right];
	            right++;
	            if(indexValue == 0){
	                K--;
	                while(K < 0){
	                    if(A[left] == 0){left++;break;}
	                    left++;
	                }
	            }
	            int current = right - left;
	            if(current > re) re = current;
	        }
	        return re;
	    }
	}
}
