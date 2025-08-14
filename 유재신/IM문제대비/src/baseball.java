import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class baseball {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/input.txt");
		Scanner sc = new Scanner(file);
		
		
		int tc = sc.nextInt(); //테스트케이스 수 3
		
		for(int t = 1; t<=tc; t++) {
			int N = sc.nextInt(); //야구선수 수
			int K = sc.nextInt(); //실력 차이
			
			int [] arr = new int[N]; //배열 생성
			
			for(int i = 0; i<N; i++) {
				arr[i] = sc.nextInt(); //숫자 입력
			}
			
			Arrays.sort(arr); // 오름차순
		
			
			int cnt = 1; // 실력 내에 있는 사람 카운트하기
			
			for(int i = 1; i<N; i++) {
				if ((arr[0] + K) >= arr[i]) {
					cnt++;
				}
			}

			System.out.println("#" + t + " " + cnt);
		}
	}
}