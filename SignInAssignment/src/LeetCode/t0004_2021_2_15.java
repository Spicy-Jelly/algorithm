package LeetCode;

public class t0004_2021_2_15 {
	class Solution {
	    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int[] nums = new int[nums1.length + nums2.length];
	        int q = 0;
	        int q1 = 0, q2 = 0;
	        while(q1 < nums1.length){
	            //ÓÃÍênums2
	            if(q2 == nums2.length)
	                nums[q++] = nums1[q1++];
	            else if(nums1[q1] > nums2[q2])
	                nums[q++] = nums2[q2++];
	            else nums[q++] = nums1[q1++];
	        }
	        while(q2 < nums2.length){
	            nums[q++] = nums2[q2++];
	        }
	        int len = nums.length;
	        if(len == 0) return 0;
	        if(len % 2 == 0) return (double)(nums[len / 2] + nums[(len-1)/2])/2;
	        else return nums[len/2];
	    }
	}
}
