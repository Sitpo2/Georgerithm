package day03_0806;

import java.util.Scanner;

public class SEWA_1213_2 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	int tc = 10; //테스트케이스 10
	
	//처음에 있는 숫자 입력 -> 이후 #1에 사용	
	for(int t=1; t<=tc; t++) {
		sc.nextLine();
	
	String p = sc.nextLine(); // 찾고자 하는 패턴
	int M = p.length();
	String te = sc.nextLine(); // 찾을 문자열
	int N = te.length();
	int cnt = 0; //똑같은 문자열 발견시 카운트
	
	for(int i=0; i<=N-M; i++) {
		boolean found = true;
		for(int j=0; j<M; j++) {
			if(te.charAt(i+j)!= p.charAt(j)) {
			found = false;
			break;
		}
	} 
		if (found) {
		cnt++;
		}
		
	}
	System.out.println("#" + t + " " + cnt);
	}
}
}