package LeetCode;

public class t0006_2021_1_27 {
	class Solution {
	    public String convert(String s, int numRows) {
	        if(numRows == 1) return s;
	        String[] re = new String[numRows];
	        for(int i = 0; i < numRows; i++) re[i] = "";
	        //currentP ,current row.
	        //direction, 1 means down, -1 means up
	        int currentP = 0; int direction = 1;
	        //divide
	        for(int i = 0; i < s.length(); i++){
	            String k = Character.toString(s.charAt(i));
	            if(direction == 1 && currentP < numRows){
	                re[currentP] += k;
	                currentP++;
	            }
	            else if(direction == 1 && currentP == numRows){
	                currentP -= 2;
	                re[currentP] += k;
	                currentP--;
	                direction = -1;
	            }
	            else if(direction == -1 && currentP >= 0){
	                re[currentP] += k;
	                currentP--;
	            }
	            else{
	                currentP += 2;
	                re[currentP] += k;
	                currentP++;
	                direction = 1;
	            }
	        }//for
	        //merge;
	        String str = "";
	        for(int i = 0; i < re.length; i++)
	            str += re[i];
	        return str;
	    }
	}
}
