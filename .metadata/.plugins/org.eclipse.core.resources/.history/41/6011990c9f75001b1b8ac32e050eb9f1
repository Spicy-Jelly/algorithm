package LeetCode;

import java.util.PriorityQueue;

public class t0703_2021_2_11 {
	class KthLargest {

		PriorityQueue<Integer> data;
		int k;
		    public KthLargest(int k, int[] nums) {
		        this.k = k;
		        data = new PriorityQueue<Integer>();
		        for(int i = 0; i < nums.length; i++){
		            add(nums[i]);
		        }
		    }
		    
		    public int add(int val) {
		        data.offer(val);
		        while(data.size() > k)
		            data.poll();
		        return data.peek();
		    }
		}

		/**
		 * Your KthLargest object will be instantiated and called as such:
		 * KthLargest obj = new KthLargest(k, nums);
		 * int param_1 = obj.add(val);
		 */
}
