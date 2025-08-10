import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MM15 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		
		int N = 5;  // 예시 5x5 배열
		int[][] arr = {
		    {1, 2, 3, 4, 5},
		    {6, 7, 8, 9, 10},
		    {11,12,13,14,15},
		    {16,17,18,19,20},
		    {21,22,23,24,25}
		};

		// 주변 8방향 이동을 위한 delta 배열 (상, 우상, 우, 우하, 하, 좌하, 좌, 좌상)
		int[] dr = {-1, -1,  0, 1, 1, 1,  0, -1};
		int[] dc = { 0,  1,  1, 1, 0,-1, -1, -1};

		// 예시 좌표 (4,0) 왼쪽 아래 구석
		int r = 4;
		int c = 0;
		int sum = 0;
		System.out.println("중심 좌표 값: " + arr[r][c]);

		System.out.println("주변 8방향 값들:");
		for (int d = 0; d < 8; d++) {
		    int nr = r + dr[d];
		    int nc = c + dc[d];
		    
		    // 경계 검사
		    if (nr >= 0 && nr < N && nc >= 0 && nc < N) {
		        sum += arr[nr][nc];
		    } 
		}System.out.println(sum);

		
		
}
}
