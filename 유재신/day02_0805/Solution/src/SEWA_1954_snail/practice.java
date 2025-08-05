package SEWA_1954_snail;

public class practice {
	static int[] dr = { 0, 1, 0, -1}; // right down left up
	static int[] dc = { 1, 0, -1, 0}; // right down left up
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nowR = 0;
		int nowC;
		int nextR;
		int nextC;
		
		for (int n =0; n < N; n++) {
			
		
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
