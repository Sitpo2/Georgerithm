import java.util.Arrays;
import java.util.Scanner;

public class Problem2_평균 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		double sum = 0;

		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		//오름차순
		Arrays.sort(arr);
		
		//최대값
		int M = arr[n-1];
		
		for(int j = 0; j<n; j++) {
			sum += arr[j];
		}
		double result = sum/M*100;
		
		System.out.println(result/n);

	}

}
