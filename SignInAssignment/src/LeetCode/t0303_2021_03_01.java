package LeetCode;

public class t0303_2021_03_01 {
	class NumArray {
	    int[] Num;
	    public NumArray(int[] nums) {
	        Num = new int[nums.length];
	        int current = 0;
	        for(int i = 0; i < nums.length; i++){
	            current += nums[i];
	            Num[i] = current;
	        }
	    }
	    
	    public int sumRange(int i, int j) {
	        if(i == 0) return Num[j];
	        else return Num[j] - Num[i-1];
	    }
	}

	/**
	 * Your NumArray object will be instantiated and called as such:
	 * NumArray obj = new NumArray(nums);
	 * int param_1 = obj.sumRange(i,j);
	 */
}
