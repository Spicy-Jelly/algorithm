package LeetCode;
import java.util.*;
public class t0013_2021_01_23 {
	class Solution {
	    public int romanToInt(String s) {
	        //init return value and hashmap
	        int re = 0;;
	        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	        map.put('I', 1);
	        map.put('V', 5);
	        map.put('X', 10);
	        map.put('L', 50);
	        map.put('C', 100);
	        map.put('D',500);
	        map.put('M', 1000);
	        //Iterator every element and check whether it is bigger than next one
	        for(int i = 0; i < s.length(); i++){
	            int current = map.get(s.charAt(i));
	            int next = 0;
	            if(i < s.length() - 1)
	                next = map.get(s.charAt(i+1));
	            if(next > current)
	                re -= current;
	            else re += current;
	        }
	        return re;
	    }
	}
}
