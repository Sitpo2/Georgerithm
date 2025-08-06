package day03_0806;

import java.util.Scanner;

public class SEWA_1213 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int T = 10;

		for(int t =1; t<=T; t++) {
			sc.nextLine();
			
			String pattern; //찾는 문자
			pattern = sc.nextLine();
			int M = pattern.length();
			
			String text; //전체 문장
			text = sc.nextLine();
			int N = text.length();
			
			//카운트하는거 적기 0부터 시작
			int count = 0;
			
			for(int i =0; i<=N-M; i++) {
				boolean found = true;
				for(int j = 0; j<M; j++) {
					if(text.charAt(i+j) != pattern.charAt(j)) {
						found = false;
						break;
					}
				}
				if(found) {
					count++;				
				}
				
			}			
			System.out.println("#" + t + " " + count);
		}				
	}	
}