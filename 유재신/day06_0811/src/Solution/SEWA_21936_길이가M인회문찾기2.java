package Solution;

import java.util.Arrays;
import java.util.Scanner;

public class SEWA_21936_길이가M인회문찾기2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int tc = sc.nextInt();
		
		for(int t = 1; t<=tc; t++) {
			//문자열 길이 5
			int N = sc.nextInt();
			//회문 길이 3
			int M = sc.nextInt();
			// ABCBD
			String str = sc.next();
			
			
			
			boolean isOk = true; //아직 회문이 없다.
			for(int i=0; i<=N-M; i++) { //0부터 2까지 가야 함
				String tmp = str.substring(i, i+M);
				StringBuilder sb = new StringBuilder(tmp).reverse(); //sb는 tmp를 뒤집은 것
				if(tmp.equals(sb.toString())) {
					isOk = false; //회문이 있다.
					System.out.println("#" + t + " " + tmp);
				}
			}
			if (isOk) {
				System.out.println("#" + t + " " + "NONE");
			}
			
			
		}

	}
}