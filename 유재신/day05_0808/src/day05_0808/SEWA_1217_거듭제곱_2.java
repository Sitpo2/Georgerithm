package day05_0808;

import java.util.Scanner;

public class SEWA_1217_거듭제곱_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = 10;
		
		for(int t =0; t<tc; t++) {
			t = sc.nextInt();
			sc.nextLine();
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.println("#" + t + power(n, m));
		}
	}
		
		public static int power(int n, int m) {
			//1.기본
			if (m<=1) {
				return n;
			}
			
			//2. 재귀 기준
			return n*power(n, m-1);
				
			}
}