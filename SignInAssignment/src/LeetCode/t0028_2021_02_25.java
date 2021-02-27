package LeetCode;
/**
 * KMP算法，详情在博客中
 * @author asus
 *
 */
public class t0028_2021_02_25 {
	class Solution {
	    public int strStr(String haystack, String needle) {
	        if(needle.equals("")) return 0;
	        //int[] Next = CalculateNext(needle);
	        //for(int i = 0; i < Next.length; i++) System.out.print(Next[i] + "\t");
	        //System.out.println();
	        int[] Next = CalculateNext(needle,true);
	        //for(int i = 0; i < Next.length; i++) System.out.print(Next[i] + "\t");
	        //System.out.println();
	        return findPosition(needle,haystack,Next);
	    }
	    private int[] CalculateNext(String substr,boolean y){
	        int[] Next = new int[substr.length()];
	        int prefix = 0;
	        for(int i = 2; i < substr.length(); i++){
	            while(prefix > 0 && substr.charAt(prefix) != substr.charAt(i-1)){
	                prefix = Next[prefix];
	            }
	            if(substr.charAt(prefix) == substr.charAt(i-1)){
	                prefix++;
	            }
	            Next[i] = prefix;
	        }
	        return Next;
	    }


//	    private  static int[] CalculateNext(String substr){
//	        int[] Next = new int[substr.length()];
//	        for(int i = 2; i < substr.length(); i++){
//	            int left = 0; int right = i - 1;
//	            String l = Character.toString(substr.charAt(left));
//	            String r = Character.toString(substr.charAt(right));
//	            int maxLen = 0;
//	            while(left < i - 1){
//	                if(l.equals(r)) maxLen = l.length();
//	                left++;
//	                right--;
//	                l = l + Character.toString(substr.charAt(left));
//	                r = Character.toString(substr.charAt(right)) + r;
//	            }
//	            Next[i] = maxLen;
//	        }
//	        return Next;
//	    }

	    private int findPosition(String subStr,String str,int[] Next){
	        int i = 0;
	        int j = 0;
	        while(j + subStr.length() - i <= str.length()){
	            if(subStr.charAt(i) == str.charAt(j)){
	                i++;j++;
	                if(i == subStr.length()) return j - subStr.length();
	            }
	            else {
	                if(i == 0) j++;
	                i = Next[i];
	            }
	        }
	        return -1;
	    }
	}
}
