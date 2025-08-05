package SEWA_1954_snail;

import java.util.Scanner;

public class practice2 {
	
	//변화값 주기
	static int [] dr = {0, 1, 0, -1}; //오른쪽, 아래, 왼쪽, 위
	static int [] dc = {1, 0, -1, 0}; //오른쪽, 아래, 왼쪽, 위
			
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		for(int tc = 1; tc<=10; tc++) {
			int T = sc.nextInt();
		//현재 위치, 미래 위치 기록
		int nowR = 0; // 초기값 arr[0][0] = 0 설정
		int nowC = 0;
		int dir = 0; //방향 정하기
		
		//배열 생성
		int[][] arr = new int[T][T]; //모든 값은 0으로 정해짐.
		
		//각 칸마다 1씩 증가하도록 설정(1부터 T*T까지 증가)
		for(int n = 1; n<=T*T; n++) {
			arr[nowR][nowC] = n;
			
			int nextR = nowR + dr[dir];
			int nextC = nowC + dc[dir];
			
			//방향 전환하기
			if(nextR<0 || nextR>=T || nextC<0 || nextC>=T || arr[nextR][nextC] !=0) {
				dir = (dir+1) % 4;
				nextR = nowR+dr[dir];
				nextC = nowC+dc[dir];
			}
			nowR = nextR;
			nowC = nextC;
		}
		//완성된 값 출력하기
		System.out.println("#" + tc);
		for(int r = 0; r<T; r++) {
			for(int c = 0; c<T; c++) {
				 System.out.print(arr[r][c] + " ");
			}
			 System.out.println("");
		} 
		
		
	}

	}
}