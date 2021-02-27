package LeetCode;

import java.util.Stack;

public class t0032_2021_01_26 {
	class Solution {
	    public int longestValidParentheses(String s) {
	        boolean[] record = new boolean[s.length()];
	        for(int i = 0; i < record.length; i++) record[i] = false;
	        Stack<Integer> stackI = new Stack<Integer>();
	        for(int i = 0; i < s.length(); i++){
	            //���Ϊ�����ŵ�ʱ�򣬵�ջ��ûջ������һ��ֵ
	            if(s.charAt(i) == ')'){
	                if(stackI.empty())
	                    continue;
	                else{
	                    record[i] = true;
	                    record[stackI.pop()] = true;
	                }
	            }//if')'
	            //���Ϊ�����ŵ�ʱ��ѹջ
	            else stackI.push(i);
	        }
	        int re = 0;
	        int current = 0;
	        for(int i = 0; i < record.length; i++){
	            if(record[i] == true){
	                current++;
	                if(current > re) re = current;
	            }
	            else current = 0;
	        }
	        return re;
	    }
	}
}