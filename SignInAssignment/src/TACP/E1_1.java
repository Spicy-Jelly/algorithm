package TACP;

import java.util.Scanner;

/**
 * ��� m��n���������(m,n��Ϊ������),�Ľ�֮��m,n���þ����滻
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