package LeetCode;
//ֱ�ӻ�������
public class t1052_2021_02_23 {
	class Solution {
	    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
	        int left = 0 , right = X;
	        int current = 0;
	        for(int i = 0; i < customers.length; i++)
	            if(i >= left && i < right) current +=customers[i];
	            else if(grumpy[i] == 0) current += customers[i];
	        int max = current;
	        while(right < customers.length){
	            if(grumpy[left] == 1) current -= customers[left];
	            if(grumpy[right] == 1) current += customers[right];
	            if(max < current) max = current;
	            left++;right++;
	        }//while
	        return max;
	    }
	}
}
