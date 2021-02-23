package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;

public class t0136_2021_01_28 {
	class Solution {
	    public int singleNumber(int[] nums) {
	        HashSet<Integer> set = new HashSet<Integer>();
	        for(int i = 0; i < nums.length; i++){
	            if(set.contains(nums[i])) set.remove(nums[i]);
	            else set.add(nums[i]);
	        }
	        ArrayList<Integer> re = new ArrayList<Integer>(set);
	        return re.get(0);
	    }
	}
}
