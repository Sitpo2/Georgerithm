import java.util.Arrays;
import java.util.Scanner;

public class Test1_2 {
	
	static int[] dr = {0, 1, 0, -1}; //우, 하, 좌, 우
	static int[] dc = {1, 0, -1, 0}; //우, 하, 좌, 우
	static int[] drx = {-1, 1, 1, -1}; // 우상, 우하, 좌하, 좌상
	static int[] dcx = {1, 1, -1, -1}; // 우상, 우하, 좌하, 좌상
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//테스트케이스
		int T = sc.nextInt();
		
		for(int t = 1; t<=T; t++) {
			//배열 크기
			int N = sc.nextInt();
			// 출력
			int M = sc.nextInt();
			//합계
			int sum = 0;

			//배열정의
			int[][]arr = new int[N][N];
			for(int r =0; r<N; r++) {
				for (int c= 0; c<N; c++) {
					arr[r][c] = sc.nextInt();
				}
			}
			//상하좌우
			for(int r = 0; r<N; r++) {
				for(int c = 0; c<N; c++) {
					int tmp = arr[r][c];
					for(int m = 1; m<M; m++) {
						for(int d=0; d<4; d++) {
							int nr = r + dr[d]*m;
							int nc = c + dc[d]*m;
							if(nr>=0 && nc>=0 && nr<N && nc<N) {
								tmp = arr[nr][nc];
							}
						}
					}
					if(tmp > sum) {
						sum = tmp;
					}
				}			
			}
			//X
			for(int r = 0; r<N; r++) {
				for(int c = 0; c<N; c++) {
					int tmp = arr[r][c];
					for(int m = 1; m<M; m++) {
						for(int d=0; d<4; d++) {
							int nr = r + drx[d]*m;
							int nc = c + dcx[d]*m;
							if(nr>=0 && nc>=0 && nr<N && nc<N) {
								tmp = arr[nr][nc];
							}
						}
					}
					if(tmp > sum) {
						sum = tmp;
					}
				}			
			}
			System.out.println("#" + t + " " + sum);
		}
	}
		

}

