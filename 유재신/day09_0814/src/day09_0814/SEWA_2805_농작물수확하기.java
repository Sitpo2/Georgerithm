package day09_0814;

import java.util.Scanner;

public class SEWA_2805_농작물수확하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트케이스 50
		int tc = sc.nextInt();
		
		for(int t = 1; t<=tc; t++) {
			//배열의 길이
			int N = sc.nextInt();
			
			int [][] arr2 = new int [N][N];
			
			for(int r = 0; r<N; r++) {
			String str = sc.next();			
			for(int c = 0; c<N; c++) {
			//	arr2[r][c] = Integer.parseInt(str.charAt(c) + "");
//				arr2[r][c] = Integer.parseInt(String.valueOf(str.charAt(c)));
				arr2[r][c] = str.charAt(c) - '0';
			}	
		}
			
			//합계
			int tmp = 0;
			
			//0행부터 3행까지 계산
			for(int r = 0; r<=N/2; r++) {

				for(int c = N/2-r; c<=N/2+r; c++) {
					tmp += arr2[r][c];
				}
			}
			
			//4행부터 6행까지 계산
			for(int r = N/2+1; r<N; r++) {
				for(int c = r-N/2; c<N-r+N/2; c++) {
					tmp += arr2[r][c];
				}
			}
			
		System.out.println("#" + t + " " + tmp);
		
		}
		
	}

}
