package Array2;

public class Array_델타 {
	
	// 상하좌우 정리를 해보자!
	static int[] dr = {-1, 1, 0, 0}; //행의 변화량 dx dy di
	static int[] dc = {0, 0, -1, 1}; //열의 변화량 dy dx dj
	static int[][] drc = {{-1,0},{1,0},{0,-1},{0,1}}; //2차원 배열로 구할 때
	
	public static void main(String[] args) {
		
		int N = 3;
		int[][] arr = new int[N][N];
		//0 0 0
		//0 [0] 0		
		//0 0 0
		
		int r = 1;
		int c = 1;

		for(int d = 0; d<4; d++) {
			//d방향으로 이동했을 경우의 좌표값 (nr, nc)
			int nr = r + dr[d];
			int nc = c + dc[d];
			
//			System.out.println(nr+ "," +nc+":"+arr[nr][nc]);
			
			//거기 갈 수 있나요? 물어봐야 함
			//1. 내 안에 들어오면 진행해
//			if(nr>=0 && nr<N && nc>=0 && nc<N) {
//				System.out.println(arr[nr][nc]);
//			}
			
			
			//2. 내 밖이네? 그럼 넘어가
			if(nr<0 || nr>=N || nc<0 || nr>=N)
				continue;
			System.out.println(arr[nr][nc]);
			
			
		}//4방향 탐색
		
		 int[i][j] = j, N-J+1
	}

}
