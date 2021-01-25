package practice;
import java.util.*;
public class t0039_2021_1_25 {
	class Solution {
	    public List<List<Integer>> combinationSum(int[] candidates, int target) {
	        List<List<Integer>> re = new ArrayList<List<Integer>>();
	        Set<List<Integer>> set = new HashSet<List<Integer>>();
	        ArrayList<Integer> current = new ArrayList<Integer>();
	        backTrack(candidates,target,0,current,re,set);
	        return re;
	    }
	    private void backTrack(int[] candidates,int target,int i,ArrayList<Integer> current,List<List<Integer>> re,Set<List<Integer>> set){
	        if(target == 0){
	            if(!set.contains(current)) re.add(current);
	            return;
	        }
	        if(i >= candidates.length) return;
	        ArrayList<Integer> Current = new ArrayList<Integer>(current);
	        backTrack(candidates,target,i+1,Current,re,set);
	        while(target - candidates[i] >= 0){
	            target -= candidates[i];
	            Current.add(candidates[i]);
	            backTrack(candidates,target,i+1,Current,re,set);
	        }
	    }
	}
}
