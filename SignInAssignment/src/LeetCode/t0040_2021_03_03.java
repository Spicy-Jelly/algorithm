package LeetCode;
import java.util.*;
public class t0040_2021_03_03 {
	class Solution {
	    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
	        Arrays.sort(candidates);
	        Set<List<Integer>> set = new HashSet<List<Integer>>();
	        List<Integer> list = new ArrayList<Integer>();
	        combinationSum(candidates,target,set,list,0);
	        return new ArrayList<List<Integer>>(set);
	    }
	    private void combinationSum(int[] candidates, int target, Set<List<Integer>> set, List<Integer> list, int start){
	        if(start >= candidates.length) return;
	        for(int i = start; i < candidates.length; i++){
	            if(candidates[i] == target){
	                list.add(candidates[i]);
	                List<Integer> current = new ArrayList<Integer>(list);
	                set.add(current);
	                list.remove(list.size()-1);
	            }
	            else if(candidates[i] < target){
	                list.add(candidates[i]);
	                combinationSum(candidates,target-candidates[i],set,list,i+1);
	                list.remove(list.size()-1);
	            }
	        }
	        return;
	    }
	}
}
