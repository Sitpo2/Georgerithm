package day03_0806;

import java.util.Scanner;

public class SWEA1989_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스
		int T;
		T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			
			//문자열 정의
			String str = sc.next();
			int result = 0;
			
			StringBuilder sb = new StringBuilder();
			sb.append(str).reverse();
			
			if(str.equals(sb.toString())) {
				result = 1;
			} else {
				result = 0;
			}
			
			System.out.println("#" + t + " " + result);
		}
		
	}
}