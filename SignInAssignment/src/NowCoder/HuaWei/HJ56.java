package NowCoder.HuaWei;
import java.util.*;
public class HJ56 {

	    static public void main(String[] args){
	        Scanner scanner = new Scanner(System.in);
	        HJ56 main = new HJ56();
	        while(scanner.hasNext()){
	            int Num = scanner.nextInt();
	            int re = main.findPerfectNumber(Num);
	            System.out.println(re);
	        }//while
	    }
	    //找完美数字的个数
	    private int findPerfectNumber(int Num){
	        int re = 0;
	        for(int i = 2; i <= Num; i++){
	            //看i是不是完美数
	            boolean check = judge(i);
	            if(check == true) re++;
	        }//for
	        return re;
	    }
	    private boolean judge(int num){
	        HashSet<Integer> set = new HashSet<Integer>();
	        int sum = 1;
	        for(int i = 2; i <= num / 2 + 1; i++){
	            if(num % i == 0){
	                if(!set.contains(i)){
	                    sum = sum + i + num / i;
	                    set.add(i);
	                    set.add(num / i);
	                }
	            }//if
	        }//for
	        if(sum == num) return true;
	        else return false;
	    }
	
}
