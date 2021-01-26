package practice;
import java.util.*;
public class t0066_2021_1_23 {
	class Solution {
	    public int[] plusOne(int[] digits) {
	        //init
	        int carry = 0;
	        Stack<Integer> stack = new Stack<Integer>();
	        //add 1 and update
	        for(int i = digits.length - 1; i >= 0; i--){
	            int val = digits[i] + carry;
	            if(i == digits.length - 1){
	                val++;
	            }
	            stack.push(val % 10);
	            carry = val / 10;
	        }
	        if(carry == 1) stack.push(carry);
	        int[] re = new int[stack.size()];
	        int i = 0;
	        while(!stack.isEmpty()){
	            re[i] = stack.pop();
	            i++;
	        }
	        return re;
	    }
	}
}
