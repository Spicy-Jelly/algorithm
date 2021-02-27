package LeetCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class t0395_2021_02_27 {
	class Solution {
	    int Maxlength = 0;
	    public int longestSubstring(String s, int k) {
	        Maxlength = 0;
	        Find_subString(s,k,0,s.length()-1);
	        return Maxlength;
	    }
	    private void Find_subString(String s,int k,int start,int end){
	        //��������
	        if(start > end) return;
	        //��ʼ��
	        HashMap<Character,Integer> set = new HashMap<Character,Integer>();
	        HashMap<Character,Integer> positon = new HashMap<Character,Integer>();
	        //��¼ÿ���ؼ��ֳ��ֵĴ������Լ�λ��
	        for(int i = start; i <= end; i++){
	            char key = s.charAt(i);
	            if(set.containsKey(key))
	                set.put(key,set.get(key)+1);
	            else {
	                set.put(key,1);
	                positon.put(key,i);
	            }
	        }

	        //������
	        Iterator<Map.Entry<Character, Integer>> entries = set.entrySet().iterator();
	        while(entries.hasNext()){
	            Map.Entry<Character, Integer> entry = entries.next();
	            //����������������ݹ�����Ӵ�
				if(entry.getValue() < k){
	                Find_subString(s,k,start,positon.get(entry.getKey())-1);
	                Find_subString(s,k,positon.get(entry.getKey())+1,end);
	                return;
	            }
	        }
	        //��������������������ֵ��
	        int length = end - start + 1;
	        if(length > Maxlength) Maxlength = length;
	        return;
	    }
	}
}
