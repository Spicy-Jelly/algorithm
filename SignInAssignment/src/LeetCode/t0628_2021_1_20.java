package LeetCode;
import java.util.Arrays;
/**
 * һ�������ַ���ֵ������Ҫ����ô����������ۣ�ֱ�ӷ��ش�ļ���
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
