package LeetCode;

import java.util.ArrayList;
import java.util.List;


public class t0119_2021_02_12 {
	class Solution {
	    //main,���ڴ������,���㷨λ��calculate��
	    public List<Integer> getRow(int rowIndex) {
	        List<Integer> list = new ArrayList<Integer>();
	        list.add(1);
	        list = Calculate(0,list,rowIndex);
	        return list;
	    }
	    //��һ�����ּ���
	    List<Integer> Calculate(int index,List<Integer> list,final int lastrow){
	        if(index == lastrow) return list;
	        list.add(0,0);
	        for(int i = 0; i < list.size() - 1; i++)
	            list.set(i, list.get(i)+list.get(i+1));
	        return Calculate(index+1,list,lastrow);
	    }
	}
}
