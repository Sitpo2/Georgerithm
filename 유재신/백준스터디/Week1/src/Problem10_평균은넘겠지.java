import java.util.Arrays;
import java.util.Scanner;

public class Problem10_평균은넘겠지 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for(int t = 1; t<=tc; t++) {
		//학생수
		int N = sc.nextInt();
		
		int [] arr = new int[N];
		
		int sum = 0;
		
		//점수 총합 구하기
		for(int i = 0; i<N; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];			
		}
		
		// 점수 평균 구하기
		double avg = sum / (double) N;
		int cnt = 0;
		double percentage = 0;
		for(int j = 0; j<N; j++) {
			if (avg < arr[j])
				cnt++;	
			percentage = (double) cnt/N;
		}
		
		//100곱해서 %값 만들기 위한 마지막 과정
//		double pc = percentage*100; // 40.0
//		double pc2 = pc*1000; // 40000
//		double answer = ((double)Math.round(pc2))/1000;
		double answer = ((double)Math.round((percentage*100)*1000))/1000;
		
		
		System.out.printf("%.3f", answer); //소수점 셋째자리까지 표기
		System.out.println("%");
		
		}
	}
	}