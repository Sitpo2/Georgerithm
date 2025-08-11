package Solution;

import java.util.Arrays;
import java.util.Scanner;

public class SEWA_3499_퍼펙트셔플 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 개수 3
		int Tc = sc.nextInt();
		
		for(int t = 1; t<=Tc; t++) {
			//덱의 개수 6
			int n = sc.nextInt();
			//배열 생성
			String [] arr = new String[n];
			
			for(int i =0; i<n; i++) {
				arr[i] = sc.next();
			}
			//왼쪽, 오른쪽 배열 정의
			String [] left = new String[(int) Math.ceil(n/2.0)];
			String [] right = new String [n/2];
			
			//왼쪽, 오른쪽 배열에 값들 입력
			for(int i =0; i<left.length; i++) {
				left[i] = arr[i];
			}
			for(int i =0; i<right.length; i++) {
				right[i] = arr[i+left.length];
			}
			
			
			System.out.print("#" + t + " ");
			//왼 오 왼 오 이렇게 출력함
			for(int i = 0; i<right.length; i++) {
				System.out.print(left[i] + " " + right[i] + " ");
			}
			//왼쪽이 3, 오른쪽이 2인 경우 왼쪽 마지막 더해야함
			if(left.length > right.length) {
				System.out.print(left[n/2]);
			}
			System.out.println();
			
			
		
		}
	}
}