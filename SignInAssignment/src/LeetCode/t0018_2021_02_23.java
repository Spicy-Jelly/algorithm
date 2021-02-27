package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class t0018_2021_02_23 {
	class Solution {
	    public List<List<Integer>> fourSum(int[] nums, int target) {
	        Set<List<Integer>> set = new HashSet<List<Integer>>();
	        Arrays.sort(nums);
	        for(int i = 0; i < nums.length; i++){
	            for(int j = i + 1; j < nums.length; j++){
	                int left = j + 1;
	                int right = nums.length - 1;
	                while(left < right){
	                    int current = nums[i] + nums[j] + nums[left] + nums[right];
	                    if(current == target){
	                        List<Integer> list = new ArrayList<Integer>();
	                        list.add(nums[i]);
	                        list.add(nums[j]);
	                        list.add(nums[left]);
	                        list.add(nums[right]);
	                        set.add(list);
	                        left++;
	                    }
	                    else if(current < target) left++;
	                    else right--;
	                }//while
	            }//for j
	        }//for i
	        List<List<Integer>> re = new ArrayList<List<Integer>>(set);
	        return re;
	    }
	}
}
