package LeetCode;

import java.util.ArrayList;
import java.util.List;


public class t0119_2021_02_12 {
	class Solution {
	    //main,用于传入参数,主算法位于calculate中
	    public List<Integer> getRow(int rowIndex) {
	        List<Integer> list = new ArrayList<Integer>();
	        list.add(1);
	        list = Calculate(0,list,rowIndex);
	        return list;
	    }
	    //加一个数字即可
	    List<Integer> Calculate(int index,List<Integer> list,final int lastrow){
	        if(index == lastrow) return list;
	        list.add(0,0);
	        for(int i = 0; i < list.size() - 1; i++)
	            list.set(i, list.get(i)+list.get(i+1));
	        return Calculate(index+1,list,lastrow);
	    }
	}
}
