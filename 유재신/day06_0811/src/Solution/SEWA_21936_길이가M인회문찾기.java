package Solution;

import java.util.Arrays;
import java.util.Scanner;

public class SEWA_21936_길이가M인회문찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		//테스트케이스 찾기
		int tc = sc.nextInt();
		
		for(int t = 0; t<=tc; t++) {
			//문자길이 5
			int N = sc.nextInt();
			//회문길이 3
			int M = sc.nextInt();
			//문자열 입력
			String line = sc.next();
			
			boolean isOk = true;
			for(int i = 0; i<N-M; i++) {			
			String tmp = line.substring(i, i+M);
			StringBuilder sb = new StringBuilder(tmp).reverse();
			if(tmp.equals(sb.toString())) {
				isOk = false;
				System.out.println("#" + t+ " " + tmp);
			} 
		}
			if (isOk) {
				System.out.println("#" + t+ " " + "NONE");
			}
	}

	}
}