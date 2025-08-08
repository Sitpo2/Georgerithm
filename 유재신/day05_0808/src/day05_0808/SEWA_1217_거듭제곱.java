package day05_0808;

import java.util.Scanner;

public class SEWA_1217_거듭제곱 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//첫째 줄 입력
		int Tc = 10;
		
		//#1 구현
		for(int t = 1; t<=Tc; t++) {
			t = sc.nextInt();
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.println("#" + t + " "+ power(n, m));
		}
	}
	
	public static int power(int n, int m) {
		
		//1. 기본
		if(m<=1) return n;
		
		//2. 재귀
			return 
				(n)*power(n, m-1);				
	}
}