package LeetCode;

public class t0202_2021_01_31 {
	class Solution {
	    public boolean isHappy(int n) {
	        if(n == 4) return false;
	        int re = 0;
	        while(n != 0){
	            int current = n % 10;
	            n /= 10;
	            re += current * current;
	        }
	        if(re == 1) return true;
	        return isHappy(re);
	    }
	}
}
