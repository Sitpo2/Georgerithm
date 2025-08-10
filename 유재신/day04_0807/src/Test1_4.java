import java.util.Scanner;

public class Test1_4 {
	
	static int [] dr = {0, 1, 0, -1}; //우, 하, 좌, 상
	static int [] dc = {1, 0, -1, 0}; //우, 하, 좌, 상
	static int [] drx = {-1, 1, 1, -1}; //우상, 우하, 좌하, 좌상
	static int [] dcx = {1, 1, -1, -1}; //우상, 우하, 좌하, 좌상
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Tc = sc.nextInt();
		
		for (int t = 1; t<=Tc; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int sum = 0;
			
			int [][] arr = new int [N][N];
			
			for (int r = 0; r<N; r++) {
				for(int c = 0; c<N; c++) {
					arr[r][c] = sc.nextInt();
				}
			}
			
			for(int r = 0; r<N; r++) {
				for(int c = 0; c<N; c++) {
					int tmp = arr[r][c];
					for(int m = 1; m<M; m++) {
						for(int d = 0; d<4; d++) {
							int nr = r + dr[d]*m;
							int nc = c + dc[d]*m;
							if(nr>=0 && nc>=0 & nr<N && nc<N) {
								tmp+=arr[nr][nc];
							}
						}
					}
					if(tmp>sum) {
						sum = tmp;
					}
				}
			}
			for(int r = 0; r<N; r++) {
				for(int c = 0; c<N; c++) {
					int tmp = arr[r][c];
					for(int m = 1; m<M; m++) {
						for(int d = 0; d<4; d++) {
							int nr = r + drx[d]*m;
							int nc = c + dcx[d]*m;
							if(nr>=0 && nc>=0 & nr<N && nc<N) {
								tmp+=arr[nr][nc];
							}
						}
					}
					if(tmp>sum) {
						sum = tmp;
					}
				}
			}
			System.out.println(sum);
		}
		
	}
}