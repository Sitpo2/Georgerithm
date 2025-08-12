import java.util.Arrays;
import java.util.Scanner;

public class Problem4_나머지2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int N = sc.nextInt();		// 테스트 케이스 개수
		int N  = 10;
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			int num = sc.nextInt();
			arr[i] = num % 42;
		}
		
		int cnt = 1;
		Arrays.sort(arr);		
		for(int i =0; i < N-1; i++) {
			if(arr[i]!=arr[i+1]) {
				cnt++;
			}
		}

		System.out.println(cnt);
		
	}
}