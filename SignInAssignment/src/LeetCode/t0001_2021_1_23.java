package LeetCode;
import java.util.*;
public class t0001_2021_1_23 {
	class Solution {
	    public int[] twoSum(int[] nums, int target) {
	        int[] re = new int[2];
	        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	        for(int i = 0; i < nums.length; i++){
	            if(map.containsKey(target - nums[i])){
	                re[0] = map.get(target - nums[i]);
	                re[1] = i;
	                break;
	            }
	            else map.put(nums[i],i);
	        }
	        return re;
	    }
	}
}
