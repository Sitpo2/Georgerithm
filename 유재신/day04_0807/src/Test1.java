import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
	
	//2차원배열 (8방탐색 이동하고 원상복귀)
			// dr, dc 델타 만들기
			
			//내가 있는 위치 [cr, cc]
			// nr = cr+dr[i] / nc = cc+dc[i]
			
	static int [] dr = {0, 1, 0, -1}; //우, 하, 왼, 상
	static int [] dc = {1, 0, -1, 0}; //우, 하, 왼, 상 
	static int [] drx = {-1, 1, 1, -1}; //우상, 우하, 좌하, 좌상
	static int [] dcx = {1, 1, -1, -1}; //우상, 우하, 좌하, 좌상
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();

		
		for(int tc =1; tc<=T; tc++) {
			int N = sc.nextInt(); //배열 크기
			int M = sc.nextInt(); // 세기
			int sum = 0;
			
			
			int [][] arr = new int [N][N];
			
			for(int r = 0; r<N; r++) {
				for(int c = 0; c<N; c++) {
					arr[r][c] = sc.nextInt();
				}
			}
			
			for(int r = 0; r<N; r++) {
				for(int c = 0; c<N; c++) {
					int tmp = arr[r][c];
					for(int m =1; m<M; m++) {
						for(int d = 0; d<4; d++) {
							int nr = r + dr[d]*m;
							int nc = c + dc[d]*m;
							if(nr>=0 && nc>=0 && nc<N && nr<N) {
								tmp += arr[nr][nc];
							}
						}
					}
					if(tmp>sum) {
						sum=tmp;
					}
				}
			}
			
			for(int r = 0; r<N; r++) {
				for(int c = 0; c<N; c++) {
					int tmp = arr[r][c];
					for(int m =1; m<M; m++) {
						for(int d = 0; d<4; d++) {
							int nr = r + drx[d]*m;
							int nc = c + dcx[d]*m;
							if(nr>=0 && nc>=0 && nc<N && nr<N) {
								tmp += arr[nr][nc];
							}
						}
					}
					if(tmp>sum) {
						sum=tmp;
				}
			}
			
			
		}
			System.out.println("#" + tc + " " + (sum));

	}
	}
}

