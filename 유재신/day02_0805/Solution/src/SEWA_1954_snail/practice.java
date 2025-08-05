
package SEWA_1954_snail;

public class practice {
	static int[] dr = { 0, 1, 0, -1}; // right down left up
	static int[] dc = { 1, 0, -1, 0}; // right down left up
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int T = sc.nextInt();
		
		int nowR = 0; //초기값 설정(0,0)
		int nowC = 0;
		int dir = 0; // 방향 인덱스 설정(오른쪽 먼저 시작)
		
		for (int n =1; n<=T*T; n++) {
			
			
			
			
		
			for (int i = 0; i < 4; i++) {
				// i = 0
				nextR = nowR + dr[i];
				nextC = nowC + dc[i];
				
				if (nextR >= 0 && nextR < N) {
					nowR = nextR;
					
					arr[nowR][nowC] = n;
					
				}
			}
		}
	}

}
