package TACP;

import java.util.Scanner;

/**
 * 求解 m和n的最大公因数(m,n都为正整数),改进之后，m,n不用经常替换
 * @author Spicy Jelly
 *
 */
public class E1_1 {
	static public void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int re = E1_1(m,n);
		System.out.println(re);
	}
	static int E1_1(int m,int n) {
		if(n == 0) return m;
		int r = m % n;
		m = r;
		return E1_1(n,m);
//		m = n;
//		n = r;
//		return E1_1(m,n);
	}
}
