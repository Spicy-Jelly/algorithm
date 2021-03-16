package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class t0056_2021_03_15 {
	class Solution {
	    public int[][] merge(int[][] intervals) {
	        List<List<Integer>> list = new ArrayList<List<Integer>>();
	        quicksort(intervals,0,intervals.length-1);
	        int start = intervals[0][0];
	        int end = intervals[0][1];
	        for(int i = 1; i < intervals.length; i++){
	            if(intervals[i][0] <= end){
	                end = Math.max(end,intervals[i][1]);
	            }
	            else{
	                ArrayList<Integer> current = new ArrayList<Integer>();
	                current.add(start);
	                current.add(end);
	                list.add(current);
	                start = intervals[i][0];
	                end = intervals[i][1];
	            }
	        }
	        ArrayList<Integer> current = new ArrayList<Integer>();
	        current.add(start);
	        current.add(end);
	        list.add(current);


	        int[][] re = new int[list.size()][2];
	        for(int i = 0; i < re.length; i++){
	            re[i][0] = list.get(i).get(0);
	            re[i][1] = list.get(i).get(1);
	        }
	        return re;
	    }
	    void quicksort(int[][] intervals,int start,int end){
	        if(start >= end) return;
	        int qs = start;
	        int qe = end;
	        int key = intervals[qs][0];
	        while(qs < qe){
	            while(qs < qe && key <= intervals[qe][0]) qe--;
	            while(qs < qe && key >= intervals[qs][0]) qs++;
	            if(qs < qe){
	                int temp0 = intervals[qs][0];
	                intervals[qs][0] = intervals[qe][0];
	                intervals[qe][0] = temp0;
	                int temp1 = intervals[qs][1];
	                intervals[qs][1] = intervals[qe][1];
	                intervals[qe][1] = temp1;
	            }
	        }
	        int key0 = intervals[start][0];
	        intervals[start][0] = intervals[qe][0];
	        intervals[qe][0] = key0;
	        int key1 = intervals[start][1];
	        intervals[start][1] = intervals[qe][1];
	        intervals[qe][1] = key1;
	        quicksort(intervals,start,qe-1);
	        quicksort(intervals,qe+1,end);
	    }
	}
}
