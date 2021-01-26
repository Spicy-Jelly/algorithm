package LeetCode;

public class t0007_2021_1_23 {
	class Solution {
	    public int reverse(int x) {
	        //init
	        long re = 0;
	        int carry = 1;
	        if(x < 0) carry = -1;
	        //process
	        while(x != 0){
	            if(re > re*10 + Math.abs(x % 10)) return 0;
	            re = re*10 + Math.abs(x % 10);
	            x /= 10;
	        }
	        re = carry * re;            
	        //check whether it is match requirement?
	        return re > Integer.MAX_VALUE || re < Integer.MIN_VALUE ? 0 : (int)re;
	    }
	}
}
