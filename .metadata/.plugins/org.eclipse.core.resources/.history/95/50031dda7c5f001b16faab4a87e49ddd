package practice;
import java.util.*;
public class t0989_2021_1_22 {
	class Solution {
	    public List<Integer> addToArrayForm(int[] A, int k) {
	        LinkedList<Integer> re = new LinkedList<Integer>();
	        int carry = 0;
	        //make full use of A array
	        for(int i = A.length - 1; i >= 0; i--){
	            int addk = k % 10;//k bit, then update
	            k /= 10; 
	            int addA = A[i]; //A bit
	            int current = addk + addA + carry; //update current,carray
	            carry = current / 10;
	            current = current % 10;
	            re.addFirst(current);
	        }//for A
	        //make full use of B
	        while(k != 0){
	            int addk = k % 10; //update k
	            k /= 10;
	            int current = addk + carry;
	            carry = current / 10;
	            current = current % 10;
	            re.addFirst(current);
	        }
	        if(carry == 1) re.addFirst(carry);
	        return re;
	    }
	}
}
