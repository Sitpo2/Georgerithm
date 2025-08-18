import java.util.Scanner;

public class secretnumber_565_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 
		
		int[] arr = new int[2000]; 
		int[] arr2 = new int[2000];
		
		int max = 0;
		
		for(int k = 1; k <= n; k++) {
			
			arr[0] = n;
			arr[1] = k;
			
			int cnt = 2; 
			
			for(int i = 2; i < 2000; i++) {
				arr[i] = arr[i-2] - arr[i-1];
				
				// 0을 포함하여 0보다 크거나 같은 경우에만 수열에 추가
				if(arr[i] >= 0) { 
					cnt++;
				} else {
					break; // 음수가 나오면 종료
				}
			}
			
			if(cnt > max) {
				max = cnt;	
				for(int m = 0; m < max; m++) {
					arr2[m] = arr[m];
				}
			}
		}
		
		System.out.println(max);
		for(int i = 0; i < max; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}