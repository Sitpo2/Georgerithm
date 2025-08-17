import java.util.Scanner;

public class Snail_거꾸로 {
	
	static int [] dr = {-1, 0, 1, 0}; //상, 우, 하, 좌
	static int [] dc = {0, 1, 0, -1}; //상, 우, 하, 좌
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //7
		int target = sc.nextInt(); //35
		int [][] arr = new int [N][N]; //7*7배열 생성
		
		int nowR = N/2; //3
		int nowC = N/2; //3
		
		arr[nowR][nowC] = 1;
		int n = 2;
		int step = 1;
		
		while(n<=N*N) {
			for(int d = 0; d<4; d++ ) {
				int movement = step; //1
				
				for(int i = 0; i<movement; i++) {
					nowR += dr[d];
					nowC += dc[d];
					
					if(nowR>=0 && nowR<N && nowC>=0 && nowC<N) {
						arr[nowR][nowC] = n++;
					}
				}
				if(d==1 || d==3) {
					step++;
				}
				
			}			
		}
		for(int r = 0; r<N; r++) {
			for(int c = 0; c<N; c++) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}
		for(int r = 0; r<N; r++) {
			for(int c = 0; c<N; c++) {
				if(arr[r][c] == target) {
					System.out.println((r+1) + " " + (c+1));
				}
			}
		}
	}

}
