package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class t0995_2021_02_18 {
	class Solution {
	    public int minKBitFlips(int[] A, int k) {
	        Queue<Integer> queue = new LinkedList<Integer>();
	        int re = 0;
	        for(int i = 0; i < A.length; i++){
	            //step1:check out whether reverse is out of range
	            if(!queue.isEmpty() && queue.element() + k == i) queue.remove();
	            //step2:whether value meet the request
	            int q = queue.size() % 2;
	            //if so, continue; if not,add to queue
	            if((A[i] == 0 && q == 0) || (A[i] == 1 && q == 1)){
	                //if k outof arrayrange,return false, cannot meet request
	                if(i + k > A.length) return -1;
	                //reverse the range k which head is i
	                queue.add(i);
	                re++;
	            }
	        }//for
	        return re;
	    }
	}
}
