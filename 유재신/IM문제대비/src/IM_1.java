import java.util.Scanner;

public class IM_1 {

	static int [] dr = {0, 1, 0, -1}; // 우 하 좌 상
	static int [] dc = {1, 0, -1, 0}; // 우 하 좌 상
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc= sc.nextInt(); //3
		
		for(int t =1; t<=tc; t++) {
			int N = sc.nextInt(); //5
			
			//배열 생성
			int [][] arr = new int[N][N];
			
			//숫자 입력할 거임
			for(int r = 0; r<N; r++) {
				for(int c = 0; c<N; c++) {
					arr[r][c] = sc.nextInt(); //2차 배열 안에 숫자 입력
				}
			}
			//최소값 입력
			int min = 0;
			// 카운트하기
			int cnt = 0;
			

			
			//각 배열에 맞춰 이동하기 위한 조건 만들기
			for(int r = 0; r<N; r++) {
				for(int c = 0; c<N; c++) {
					
					int nowr = r; //현재 행
					int nowc = c; //현재 열
					int idx = 0; //방향 어디로 이동할지

						int a = Math.min(arr[nowr+dr[idx]][nowc+dc[idx]], arr[nowr+dr[idx+1]][nowc+dc[idx+1]]);
						int b = Math.min(arr[nowr+dr[idx+2]][nowc+dc[idx+2]], arr[nowr+dr[idx+3]][nowc+dc[idx+3]]);
						int m = Math.min(a, b);	//최소값 구하기
						
						if(m<arr[nowr][nowc]) {
							cnt++;
							//배열의 다음 값 입력
							for(int i = 0; i<N; i++) {
								for(int j = 0; j<N; j++) {
									if(arr[i][j] == m) {
										int nxr = i;
										int nxc = j;
										nowr = nxr;
										nowc = nxc;
									}
								}
							}
							
				
						} else { 
							continue;
						}
							
						}
					}
	
					
					
				}
			}
			
			
			
			
			
		}


