import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IM_1_2 {

	static int [] dr = {0, 1, 0, -1}; // 우 하 좌 상
	static int [] dc = {1, 0, -1, 0}; // 우 하 좌 상
		
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/input2.txt");
		Scanner sc = new Scanner(file);
		
		int tc= sc.nextInt(); //3
		
		for(int t =1; t<=tc; t++) {
			int N = sc.nextInt(); //5
			
			//배열 생성
			int [][] arr = new int[N][N];
			
			
			//숫자 입력할 거임
			for(int r = 0; r<N; r++) {
				for(int c = 0; c<N; c++) {
					arr[r][c] = sc.nextInt(); //2차 배열 안에 숫자 모두 입력 완료
				}
			}
			
			int max = 0; //최대 이동 거리

			//모든 칸에서 시작해서 공 굴릴거임
			for(int r = 0; r<N; r++) {
				for(int c = 0; c<N; c++) {
					int nowr = r;
					int nowc = c;
					int cnt = 1; //제자리 카운트하기
					
					while(true) { //무한반복, 조건 충족 때까지
						int min = 501; //500이 최대이기 때문
						//최종적으로 다음에 이동할 값(초기화 값 설정)
						int nextr = 0;
						int nextc = 0;
						
						//4방향 탐색
						for(int i = 0; i<4; i++) {
							//4방향 탐색 중 찾기 위한 수
							int mover = nowr + dr[i];
							int movec = nowc + dc[i];
							
							if(mover>=0 && movec>=0 && mover<N && movec<N) {
								if(arr[mover][movec] < min) {
									min = arr[mover][movec];
									//최종적으로 움직일 곳 입력
									nextr = mover;
									nextc = movec;
								}
							}
						}
						//위치 바꾸면서 cnt+하기
						if(min<arr[nowr][nowc]) {
							nowr = nextr;
							nowc = nextc;
							cnt++;
							
						} else {
							break;
						}
						
					}
					
					if(cnt>max) {
						max = cnt;
					}
				}
			}
			
		
				System.out.println("#" + t + " " + max);
					
		}
	}			
}


