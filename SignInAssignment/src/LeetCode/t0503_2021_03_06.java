package LeetCode;

import java.util.Stack;

public class t0503_2021_03_06 {
	class Solution {
	    public int[] nextGreaterElements(int[] nums) {
	        if(nums.length == 0){
	            int[] q1 = {};
	            return q1;
	        }
	        if(nums.length == 1){
	            int[] q2 = {-1};
	            return q2;
	        }
	        int[] re = new int[nums.length];
	        for(int i = 0; i < re.length; i++) re[i] = -1;        
	        Stack<Node> stack = new Stack<Node>();
	        Node current = new Node(0,nums[0]);
	        stack.push(current);
	        int i = 1;
	        int loop = 1;
	        while(loop < 3){
	            current = new Node(i,nums[i]);
	            while(!stack.empty() && current.value > stack.peek().value){
	                re[stack.peek().position] = current.value;
	                stack.pop();
	            }
	            stack.push(current);
	            if(i+1 == nums.length) loop++;
	            i = (i+1) % nums.length;
	        }
	        return re;
	    }
	}
	class Node{
	    int position;
	    int value;
	    Node(int position,int value){
	        this.position = position;
	        this.value = value;
	    }
	}
}
