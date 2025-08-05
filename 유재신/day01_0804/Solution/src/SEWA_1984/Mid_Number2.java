package SEWA_1984;

import java.util.Arrays;
import java.util.Scanner;


public class Mid_Number2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T;
		T = sc.nextInt();
		
		//#작성하는 거
		for(int C = 1; C<=T; C++) {
			

			//배열 정의
			int [] arr = new int [10];
			//배열 길이 정의
			int N = arr.length;
			
			for(int i =0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			int sum = 0;
			for(int i = 1; i<N-1; i++) {
				sum += arr[i];				
			}
			//double을 하나한테만 줘서 형변환 해야 함. 
			int avg = (int) Math.round((double) sum/(N-2));
			
			System.out.println("#" + C + " " +  avg);
			
		}
		
}
}