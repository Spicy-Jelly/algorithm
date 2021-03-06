package LeetCode;

import java.util.Stack;

public class t0232_2021_03_05 {
	class MyQueue {
	    Stack<Integer> outstack;
	    Stack<Integer> instack;
	    /** Initialize your data structure here. */
	    public MyQueue() {
	        outstack = new Stack<Integer>();
	        instack = new Stack<Integer>();
	    }
	    
	    /** Push element x to the back of queue. */
	    public void push(int x) {
	        instack.push(x);
	    }
	    
	    /** Removes the element from in front of queue and returns that element. */
	    public int pop() {
	        if(outstack.empty()){
	            while(!instack.empty())
	                outstack.push(instack.pop());
	        }
	        return outstack.pop();
	    }
	    
	    /** Get the front element. */
	    public int peek() {
	       if(outstack.empty()){
	            while(!instack.empty())
	                outstack.push(instack.pop());
	        }
	        return outstack.peek();
	    }
	    
	    /** Returns whether the queue is empty. */
	    public boolean empty() {
	        if(instack.empty() && outstack.empty()) return true;
	        else return false;
	    }
	}

	/**
	 * Your MyQueue object will be instantiated and called as such:
	 * MyQueue obj = new MyQueue();
	 * obj.push(x);
	 * int param_2 = obj.pop();
	 * int param_3 = obj.peek();
	 * boolean param_4 = obj.empty();
	 */
}
