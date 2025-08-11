package Solution;

import java.util.Arrays;
import java.util.Scanner;

public class SEWA_7102_카드놀이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 개수
		int Tc = sc.nextInt();
		
		for (int t = 1; t<=Tc; t++) {
			//첫번째 6
			int N = sc.nextInt();
			//두번째 6
			int M = sc.nextInt();
			
			// 총 합계 배열 정의 (현재 count 배열은 모두 0임)
			int [] count = new int [N+M+1];
			
			for(int i =1; i<=N; i++) {
				for(int j = 1; j<=M; j++) {
					count[i+j]++; // 각 상황마다 현재 0인 값들 오르게 됨.
				}
			}
			//최대값 정의
			int max = 0;
			for(int i =0; i<=N+M; i++) {
				if(count[i] > max) {
					max = count[i];
				}
			}
			System.out.print("#" + t + " ");
			//max값이 동일한 것들을 다 내보내기
			for(int i =0; i<=N+M; i++) {
				if(count[i] == max) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
			}

	}
}