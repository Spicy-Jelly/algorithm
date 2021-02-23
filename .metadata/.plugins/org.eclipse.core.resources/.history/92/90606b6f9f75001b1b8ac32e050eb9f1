package LeetCode;


import java.util.*;

/**
 * 利用hashMap去重即可
 * @author SpicyJelly
 *
 */
public class t1128_2021_1_26 {
	class Solution {
	    public int numEquivDominoPairs(int[][] dominoes) {
	        //init
	        HashMap<List<Integer>,Integer> set = new HashMap<List<Integer>,Integer>();
	        int re = 0;
	        //iterator every dominor to find whethere there is a same dominoe
	        for(int i = 0; i < dominoes.length; i++){
	            ArrayList<Integer> dominoe = new ArrayList<Integer>();
	            if(dominoes[i][0] > dominoes[i][1]) dominoe.add(dominoes[i][0]);
	            else dominoe.add(dominoes[i][1]);
	            dominoe.add(dominoes[i][0] + dominoes[i][1] - dominoe.get(0));
	            if(!set.containsKey(dominoe)) set.put(dominoe,1);
	            else{
	                set.put(dominoe,set.get(dominoe) + 1);
	            }
	        }
	        for(Integer value : set.values()){
	            re += calculate(value);
	        }
	        return re;
	    }
	    int calculate(int value){
	        if(value == 1) return 0;
	        int re = value * (value - 1) / 2;
	        return re;
	    }
	}
}
