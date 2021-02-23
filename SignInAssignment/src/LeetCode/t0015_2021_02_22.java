package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class t0015_2021_02_22 {
	//双指针
	//固定一个指针，另外两个指针滑动找符合的值即可
	class Solution {
	    public List<List<Integer>> threeSum(int[] nums) {
	        Set<List<Integer>> set = new HashSet<List<Integer>>();
	        Arrays.sort(nums);
	        for(int i = 0; i < nums.length - 1; i++){
	            int left = i + 1;
	            int right = nums.length-1;
	            while(left != right){
	                //it is the target
	                int target = nums[i] + nums[left] + nums[right];
	                if(target == 0){
	                    List<Integer> current = new ArrayList<Integer>();
	                    current.add(nums[i]);current.add(nums[left]);current.add(nums[right]);
	                    set.add(current);
	                    left++;
	                }
	                else if(target > 0) right--;
	                else left++;
	            }
	        }
	        List<List<Integer>> re = new ArrayList<List<Integer>>(set);
	        return re;
	    }
	    
	}
}
