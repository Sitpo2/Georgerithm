package day03_0806;

import java.util.Scanner;

public class SWEA1989 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트케이스 입력
		int T = sc.nextInt();
		for(int t = 1; t<=T; t++) {
			
			//문자열 정의하기
			String str;
			str = sc.next();
			
			//StringBuilder 활용하기
			StringBuilder sb = new StringBuilder();
			sb.append(str).reverse();
			
			//일치하면 1, 아니면 0
			int result = 0;
			
			if(str.equals(sb.toString())) {
				result = 1;
			} else {
				result = 0;
			}				
			System.out.println("#" + t + " " + result);			
		}
	}

}
