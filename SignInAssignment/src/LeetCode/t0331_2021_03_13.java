package LeetCode;

import java.util.Stack;

public class t0331_2021_03_13 {
	class Solution {
	    public boolean isValidSerialization(String preorder) {
	        Stack<Character> stack = new Stack<Character>();
	        for(int i = 0; i < preorder.length();){
	            Character key = preorder.charAt(i);
	            if(key >= '0' && key <= '9'){
	                stack.push(key);
	                while(i < preorder.length() && preorder.charAt(i) != ',') i++;
	            }
	            else if(key == '#'){
	                try{
	                    while(!stack.empty() && stack.peek() == '#'){
	                        stack.pop();
	                        stack.pop();
	                    }
	                }catch(Exception e){
	                    return false;
	                }
	                
	                stack.push(key);
	                i++;
	            }
	            else i++;
	        }
	        if(stack.size() == 1 && stack.peek() == '#') return true;
	        else return false;
	    }
	}
}
