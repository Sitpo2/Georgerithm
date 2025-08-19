package String;

import java.util.Scanner;

public class dfd {

	static int [] dr = {-1, -1, -1, 0, 1, 1, 1, 0}; //좌상, 상, 우상, 우, 우하, 하, 좌하, 좌
	static int [] dc = {-1, 0, 1, 1, 1, 0, -1, -1}; //좌상, 상, 우상, 우, 우하, 하, 좌하, 좌
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 첫줄 2
		int tc = sc.nextInt();
		
		for(int t =1; t<=tc; t++) {
			
			//배열 길이
			int N = sc.nextInt();
			//중앙값보다 클 때 총합 구하기용
			int sum = 0;

			
			 // (N+2)x(N+2) 배열 생성 → 테두리 100으로 패딩
            int[][] arr = new int[N + 2][N + 2];

            // 테두리를 100으로 채움
            for (int r = 0; r < N + 2; r++) {
                for (int c = 0; c < N + 2; c++) {
                    arr[r][c] = 100;
                }
            }
			
			//배열 정의
			for(int r =1; r<=N; r++) {
				for (int c =1; c<=N; c++) {
					arr[r][c] = sc.nextInt();
				}
			}
			// 중앙값에서 8방으로 뻗어서 자신보다 큰 값들이 8개이면 cnt를 더한다.
			for(int r = 1; r<=N; r++) {
				for (int c = 1; c<=N; c++) {
					//중앙 보다 큰 값들 개수 세기
					int cnt = 0;
					//8방으로 움직이기
					for(int d = 0; d<8; d++) {
						int nr = r + dr[d];
						int nc = c + dc[d];	
						//범위내에 있을 때 사용
						if(arr[r][c]<arr[nr][nc]) {
								cnt++;		
							}																																					
						}	
					if(cnt == 8) {
						sum++;
						}		
					}							
				}
			System.out.println("#" + t + " " + sum);			
			}
			
		}			
	}


