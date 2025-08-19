package Array2;

import java.util.Scanner;

public class sanil2 {

	static int [] dr = {0, 1, 0, -1}; //왼, 아, 오, 위
	static int [] dc = {-1, 0, 1, 0};		
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		// 테스타케이스 값 입력
		int T;
		T = sc.nextInt();
		for(int t = 1; t<=T; t++) {
			
			//초기값 설정(현재값, 방향)
			int nowr = 0;
			int nowc = t-1;
			int dir = 0; //처음에는 오른쪽로 이동할거기 때문
			
			//배열 설정 및 정의
			int [][] arr = new int [t][t];
			
			for(int n=1; n<=t*t; n++) {
				arr[nowr][nowc] = n;
				
				int nextr = nowr + dr[dir];
				int nextc = nowc + dc[dir];
			
			
			//만약 범위를 벗어나거나 0이 아닌 값을 만나면 방향 전환
			if(nextr<0 || nextc<0 || nextr>=t || nextc>=t || arr[nextr][nextc] !=0 ) {
				dir = ((dir+1) % 4);
			
			
			//다음에 이동하는 값을 정의
			nextr = nowr + dr[dir];
			nextc = nowc + dc[dir];
			}
			
			nowr = nextr;
			nowc = nextc;
			
		}
			System.out.println("#" + t);
			for(int r=0; r<t; r++) {
				for(int c=0; c<t; c++) {
					System.out.print(arr[r][c] + " ");
				}
				System.out.println("");
			}

		}
	}

}
