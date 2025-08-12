package day07_0812;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SEWA_12712_파리퇴치3_2 {
	
	static int [] dr = {0, 1, 0, -1}; //우 하 좌 상
	static int [] dc = {1, 0, -1, 0}; //우 하 좌 상
	static int [] drx = {-1, 1, 1, -1}; //우상, 우하, 좌하, 좌상
	static int [] dcx = {1, 1, -1, -1}; //우상, 우하, 좌하, 좌상
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/day07_0812/input.txt");
		Scanner sc = new Scanner(file);
		
		//테스트 케이스 수
		int tc = sc.nextInt();
		
		
		for(int t = 1; t<=tc; t++) {
					
		//배열 수
		int N = sc.nextInt();
		//분사기 세기
		int M = sc.nextInt();
		
		int[][] arr = new int[N][N]; //N*N 배열 생성
		//십자가와 X자 중 최대값 설정하기 위해 둠
		int Max = 0;
		
		//2차 배열 안에 값들을 넣기
		for(int r = 0; r<N; r++) {
			for (int c =0; c<N; c++) {
				arr[r][c] = sc.nextInt();
			}
		}
		
		//십자가 계산
		for(int r =0; r<N; r++) {
			for(int c =0; c<N; c++) {
				//처음에 기준이 될 값을 tmp에 저장
				int tmp = arr[r][c];
				//M의 세기를 다 더해야 함, 근데 그림을 보면 M이 1이면 현재 값 그대로인듯
				for(int m = 1; m<M; m++) {
					//4방향 값들을 더할거임
					for(int i = 0; i<4; i++) {
						//움직혔을 때 arr[nr][nc]
						int nr = r + dr[i]*m;
						int nc = c + dc[i]*m;
						//근데 조건이 필요함, 배열 범위를 벗어나면 안됨.
						if(nr>=0 && nc>=0 && nr<N && nc<N)
						//tmp값에 차례대로 더해야 함
						tmp += arr[nr][nc];											
					}
				}
				if(tmp > Max)
					Max = tmp;
			}			
		}
		//X자 계산
				for(int r =0; r<N; r++) {
					for(int c =0; c<N; c++) {
						//처음에 기준이 될 값을 tmp에 저장
						int tmp = arr[r][c];
						//M의 세기를 다 더해야 함, 근데 그림을 보면 M이 1이면 현재 값 그대로인듯
						for(int m = 1; m<M; m++) {
							//4방향 값들을 더할거임
							for(int i = 0; i<4; i++) {
								//움직혔을 때 arr[nr][nc]
								int nr = r + drx[i]*m;
								int nc = c + dcx[i]*m;
								//근데 조건이 필요함, 배열 범위를 벗어나면 안됨.
								if(nr>=0 && nc>=0 && nr<N && nc<N)
								//tmp값에 차례대로 더해야 함
								tmp += arr[nr][nc];											
							}
						}
						if(tmp > Max)
							Max = tmp;
					}			
				}
		
		System.out.println("#" + t + " " + Max);
		}		
}
}
