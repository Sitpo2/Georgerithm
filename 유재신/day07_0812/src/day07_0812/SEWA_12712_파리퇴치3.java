package day07_0812;

import java.util.Scanner;

public class SEWA_12712_파리퇴치3 {
	
	static int [] dr = {0, 1, 0, -1}; //우 하 좌 상
	static int [] dc = {1, 0, -1, 0}; //우 하 좌 상
	static int [] drx = {-1, 1, 1, -1}; //우상, 우하, 좌하, 좌상
	static int [] dcx = {1, 1, -1, -1}; //우상, 우하, 좌하, 좌상
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		//#1
		for(int t = 1 ; t<=tc; t++) {
			//배열 길이 5
			int N = sc.nextInt();
			//몇 칸 움직이는지 3
			int M = sc.nextInt();
			//NxN배열 만들기
			int [][] arr = new int[N][N];
			
			//각 배열의 칸 안에 수 집어넣기
			for(int r = 0; r<N; r++) {
				for(int c = 0; c<N; c++) {
					arr[r][c] = sc.nextInt();
				}
			}
			
			//합계 정하는 수 
			int sum1 = 0;
			int sum2 = 0;
			int sum = 0;
			
			//십자가 숫자 찾기
			for(int r = 0; r<N; r++) {
				for(int c = 0; c<N; c++) {
					//각 배열에 있는 수를 넣을거임
					int tmp = arr[r][c];
					for(int m = 1; m<M; m++) {
						for(int idx = 0; idx<4; idx++) {
							int nr = r + dr[idx]*m; // 이동하는 값
							int nc = c + dc[idx]*m;
							if(nr>=0 && nc>=0 && nr<N && nc<N) {
								tmp += arr[nr][nc];
							}
						}
					}
					if(tmp > sum1) {
						sum1 = tmp;
					}
				}
			}
			//x자 숫자 찾기
			for(int r = 0; r<N; r++) {
				for(int c = 0; c<N; c++) {
					//각 배열에 있는 수를 넣을거임
					int tmp = arr[r][c];
					for(int m = 1; m<M; m++) {
						for(int idx = 0; idx<4; idx++) {
							int nr = r + drx[idx]*m; // 이동하는 값
							int nc = c + dcx[idx]*m;
							if(nr>=0 && nc>=0 && nr<N && nc<N) {
								tmp += arr[nr][nc];
							}
						}
					}
					if(tmp > sum2) {
						sum2 = tmp;
				}
			}
				
				
		}
		if(sum1>sum2) {
			sum = sum1;
		} else {
			sum = sum2;
		}
			
		System.out.println("#" + t + " " + sum);

	}

}
}
