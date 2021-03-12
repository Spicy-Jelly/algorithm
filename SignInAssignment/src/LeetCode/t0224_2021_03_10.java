package LeetCode;

import java.util.Stack;

public class t0224_2021_03_10 {
	class Solution {
	    public int calculate(String s) {
	        Stack<Integer> stack = new Stack<Integer>();
	        for(int i = 0; i < s.length();){
	            Character key = s.charAt(i);
	            if(key == '-' || (key >= '0' && key <= '9')){
	                Update current = calculateNum(i,s);
	                i = current.i;
	                stack.push(current.num);
	            }
	            else if(key == '('){
	                Update current = getSubValue(i,s);
	                i = current.i ;
	                stack.push(current.num);
	            }
	            else i++;
	        }
	        int re = 0;
	        while(!stack.empty()) re += stack.pop();
	        return re;
	    }
	    Update calculateNum(int start,String s){
	        int symbol = 1;
	        if(s.charAt(start) == '-'){
	            symbol = -1;
	            start++;
	        }
	        int i = start;
	        while(s.charAt(i) == ' ') i++;
	        if(s.charAt(i) =='('){
	            Update current = getSubValue(i,s);
	            current.num = symbol * current.num;
	            return current;
	        }
	        int num = 0;
	        for(; i < s.length(); i++){
	            if(s.charAt(i) == ' ') continue;
	            if(s.charAt(i) > '9' || s.charAt(i) < '0') break;
	            num = num * 10 + s.charAt(i) - '0';
	        }
	        Update current = new Update(i,symbol * num);
	        return current;
	    }

	    Update getSubValue(int start,String s){
	        Stack<Integer> stack = new Stack<Integer>();
	        int i = start + 1;
	        while(s.charAt(i) != ')'){
	            Character key = s.charAt(i);
	            if(key == '-' || (key >= '0' && key <= '9')){
	                Update current = calculateNum(i,s);
	                i = current.i;
	                stack.push(current.num);
	            }
	            else if(key == '('){
	                Update current = getSubValue(i,s);
	                i = current.i;
	                stack.push(current.num);
	            }
	            else i++;
	        }
	        int num = 0;
	        while(!stack.empty()) num += stack.pop();
	        Update current = new Update(i+1,num);
	        return current;
	    }


	    class Update{
	        int i;
	        int num;
	        Update(int i,int num){
	            this.i = i;
	            this.num = num;
	        }
	    }
	}
}
