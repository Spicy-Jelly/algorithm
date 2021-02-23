package LeetCode;

import java.util.HashSet;

public class t0888_2021_02_01 {
	class Solution {
	    public int[] fairCandySwap(int[] A, int[] B) {
	        //init
	        int sumA = 0, sumB = 0;
	        HashSet<Integer> set = new HashSet<Integer>();
	        for(int i = 0; i < A.length; i++) sumA += A[i];
	        for(int i = 0; i < B.length; i++) {sumB += B[i]; set.add(B[i]);}
	        int[] re = new int[2];
	        //check
	        for(int i = 0; i < A.length; i++){
	            int require = (2*A[i] + sumB - sumA) / 2;
	            if(set.contains(require)){
	                re[0] = A[i];
	                re[1] = require;
	                break;
	            }
	        }
	        return re;
	    }
	}
}
