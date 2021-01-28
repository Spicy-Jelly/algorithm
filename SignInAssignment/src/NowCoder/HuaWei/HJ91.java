package NowCoder.HuaWei;
import java.util.*;
public class HJ91 {

	    public static void main(String[] args){
	        Scanner scanner = new Scanner(System.in);
	        while(scanner.hasNext()){
	            int col = scanner.nextInt() + 1;
	            int vol = scanner.nextInt() + 1;
	            HJ91 ma = new HJ91();
	            int re = ma.calcWay(col,vol,1,1);
	            System.out.println(re);
	        }//while
	    }
	    int calcWay(int col,int vol,int currentCol,int currentVol){
	        if(currentCol == col && currentVol == vol) return 1;
	        if(currentCol == col) return calcWay(col,vol,currentCol,currentVol+1);
	        else if(currentVol == vol) return calcWay(col,vol,currentCol+1,currentVol);
	        else return calcWay(col,vol,currentCol+1,currentVol) + calcWay(col,vol,currentCol,currentVol+1);
	    }
	
}
