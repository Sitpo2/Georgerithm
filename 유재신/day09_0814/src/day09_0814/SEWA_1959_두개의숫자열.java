package day09_0814;

import java.util.Arrays;
import java.util.Scanner;

public class SEWA_1959_두개의숫자열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트케이스 tc 10
		int tc = sc.nextInt();
			
		//#1 만들기
		for(int t = 1; t<=tc; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int [] arr1 = new int [N]; //3
			int [] arr2 = new int [M]; //5
			
		
		for(int i = 0; i<N; i++) {
			arr1[i] = sc.nextInt();
		}
		for(int j = 0; j<M; j++) {
			arr2[j] = sc.nextInt();
		}
		
		//총합 구하기
		int sum = 0;
		
		//N이 M보다 작을 때
		if(N<M) {	
			//고정값 주기
			for(int i = 0; i<=M-N; i++) {
				//tmp 초기화
				int tmp = 0;
				//변동값 주기
				for(int j = 0; j<N; j++) {					
					tmp += arr1[j]*arr2[i+j];
				}
				if (tmp>sum) {
					sum = tmp;
				}
			}	
		}
		//M이 N보다 작을 때
				if(M<N) {	
					//고정값 주기
					for(int i = 0; i<=N-M; i++) {
						//tmp 초기화
						int tmp = 0;
						//변동값 주기
						for(int j = 0; j<M; j++) {					
							tmp += arr2[j]*arr1[i+j];
						}
						if (tmp>sum) {
							sum = tmp;
						}
					}	
				}			
				System.out.println("#" + t + " " + sum);
		}
	}			
}


