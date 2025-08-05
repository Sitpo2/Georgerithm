
package SEWA_1954_snail;

import java.util.Scanner;

public class practice {
	
	//변화값 주가 위해
	static int[] dr = {0, 1, 0, -1}; //행변화 오른쪽, 아래, 왼쪽, 위
	static int[] dc = {1, 0, -1, 0}; //열변화
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트케이스 입력
		int T = sc.nextInt();
		for(int t = 1; t<=T; t++) {
			
			//배열에 있는 수 정의
			int nowr = 0;
			int nowc = 0;
			int dir = 0; //방향 정할 때 씀
			
			//배열 입력
			int [][] arr = new int [t][t];
			
			//한칸씩 이동할 때마다 수 증가함
			for(int n=1; n<=t*t; n++) {
				arr[nowr][nowc] = n;
				
				//다음에 나올 행, 열 값 구하기(
				int nextr = nowr + dr[dir];
				int nextc = nowc + dc[dir];
				
				if(nextr<0 || nextc<0 || nextr>=t || nextc>=t || arr[nextr][nextc]!=0) {
					dir = ((dir+1) % 4);
				}
				nextr = nowr + dr[dir];
				nextc = nowc + dc[dir];
				
				//값 초기화 시켜야 함
				nowr = nextr;
				nowc = nextc;				
			}
			
			//완성값 출력
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