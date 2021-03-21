package LeetCode;

import java.util.Stack;

public class t0150_2021_03_20 {
	class Solution {
	    public int evalRPN(String[] tokens) {
	        Stack<Integer> stack = new Stack<>(); 
	        for(int i = 0; i < tokens.length; i++){
	            if(tokens[i].equals("+")){
	                Integer second = stack.pop();
	                Integer first = stack.pop();
	                stack.push(first+second);
	            }
	            else if(tokens[i].equals("-")){
	                Integer second = stack.pop();
	                Integer first = stack.pop();
	                stack.push(first-second);
	            }
	            else if(tokens[i].equals("*")){
	                Integer second = stack.pop();
	                Integer first = stack.pop();
	                stack.push(first*second);

	            }
	            else if(tokens[i].equals("/")){
	                Integer second = stack.pop();
	                Integer first = stack.pop();
	                stack.push(first/second);
	            }
	            else{
	                stack.push(Integer.parseInt(tokens[i]));
	            }
	        }
	        return stack.pop();
	    }
	}
}
