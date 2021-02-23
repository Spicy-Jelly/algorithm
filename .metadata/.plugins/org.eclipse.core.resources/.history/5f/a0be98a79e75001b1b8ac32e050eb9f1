package LeetCode;

public class t0567_202_2_15 {
	public class Solution {

	    public boolean checkInclusion(String s1, String s2) {
	        if(s1.length() > s2.length()) return false;
	        char[] pattern = s1.toCharArray();
	        char[] text = s2.toCharArray();

	        int[] pFreq = new int[26];
	        int[] winFreq = new int[26];

	        for (int i = 0; i < s1.length(); i++) {
	            pFreq[pattern[i] - 'a']++;
	        }

	        //init
	        int left = 0;
	        int right = s1.length();
	        for(int i = left; i < right; i++){
	            winFreq[text[i] - 'a']++;
	        }
	        boolean re = check(pFreq,winFreq);
	        if(re == true) return true;

	        // 固定窗口大小
	        while(right < s2.length()){
	            winFreq[text[left] - 'a']--;
	            left++;
	            winFreq[text[right] - 'a']++;
	            right++;
	            re = check(pFreq,winFreq);
	            if(re == true) return true;
	        }
	        return false;
	    }
	    private boolean check(int[] pFreq,int[] winFreq){
	        for(int i = 0; i < pFreq.length; i++)
	            if(pFreq[i] != winFreq[i]) return false;
	        return true;
	    }
	}
}
