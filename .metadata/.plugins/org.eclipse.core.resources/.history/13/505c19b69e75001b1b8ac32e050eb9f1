package LeetCode;
import java.util.Arrays;
/**
 * 一共就两种返回值，不需要分那么多种情况讨论，直接返回大的即可
 * @author asus
 *
 */
public class t0628_2021_1_20 {
	class Solution {
	    public int maximumProduct(int[] nums) {
	        //sort first
	        Arrays.sort(nums);
	        int len = nums.length;
	        return Math.max(nums[len - 1] * nums[len - 2] * nums[len - 3] , nums[len - 1] * nums[0] * nums[1]);

	    }
	}
}
