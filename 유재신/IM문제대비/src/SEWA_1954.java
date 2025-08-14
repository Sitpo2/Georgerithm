import java.util.Scanner;

public class SEWA_1954 {
	
	static int [] dr = {0, 1, 0, -1}; //우, 하, 좌, 상
	static int [] dc = {1, 0, -1, 0}; //우, 하, 좌, 상
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	int tc = sc.nextInt(); // 테스트케이스 10

	for(int t = 1; t<=tc; t++) {
	
	
		int N = sc.nextInt();
		int [][] arr = new int[N][N]; //t x t 2차배열 생성
		
		//현재 값 입력
		int nowr = 0;
		int nowc = 0;
		int d = 0; //방향걉
		
		for(int n = 1; n<=N*N; n++) {
			//arr[0][0] = 1 초기값 설정
			arr[nowr][nowc] = n;
			
			int nextr = nowr + dr[d];
			int nextc = nowc + dc[d];
			
			
			if(nextr<0 || nextc<0 || nextr>=N || nextc>=N || arr[nextr][nextc] != 0) {
				//벽을 만나거나 범위를 벗어나면
				d = (d+1) % 4;
			
			nextr = nowr + dr[d];
			nextc = nowc + dc[d];	
			}
			
			//값 다시 돌리기
			nowr = nextr;
			nowc = nextc;
		}
		
		System.out.println("#" + t);
		for(int r = 0; r<N; r++) {
			for(int c = 0; c<N; c++) {
				System.out.print(arr[r][c] + " ");			
			}
			System.out.println(" ");
		}		
	}

 }
		
}



