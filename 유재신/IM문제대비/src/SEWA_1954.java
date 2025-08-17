import java.util.Arrays;
import java.util.Scanner;

public class SEWA_1954 {
	
	static int [] dr = {0, 1, 0, -1}; //우, 하, 좌, 상
	static int [] dc = {1, 0, -1, 0}; //우, 하, 좌, 상
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt(); //테스트케이스
		
		for(int t = 1; t<=tc; t++) {
			
			int N = sc.nextInt(); // 길이 N인 배열생성			
			int [][] arr = new int [N][N];
						
			int nowr = 0; //시작점 설정
			int nowc = 0; //시작점 설정
			int d = 0; //방향
			
			for(int n = 1; n<=N*N; n++) {
				arr[nowr][nowc] = n; // arr[0][0] = 1부터 시작
				
				int nextr = nowr + dr[d]; //다음 좌표 정하기
				int nextc = nowc + dc[d];
				
				//방향전환 조건
				if(nextr < 0 || nextc < 0 || nextr>=N || nextc>=N || arr[nextr][nextc] !=0) {
					d = (d+1) % 4;
					nextr = nowr + dr[d];
					nextc = nowc + dc[d];
				}
							
				nowr = nextr;
				nowc = nextc;
				
			}
			System.out.println("#" + t);
			for(int r = 0; r<N; r++) {
				for(int c = 0; c<N; c++) {
					System.out.print(arr[r][c] + " ");
				}
				System.out.println("");
			}
			
			
			
			
			
			
		}

 }
		
}



