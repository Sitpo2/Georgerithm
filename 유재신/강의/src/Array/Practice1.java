package Array;

import java.util.Arrays;

public class Practice1 {

	public static void main(String[] args) {
		int[] arr = {55, 7, 78, 12, 42, 8, 18};
		
		//길이 정의
		int N = arr.length;
		
		//반복문1. 4, 3, 2, 1 순으로 이동할거임
		for(int i = N-1; i>0; i--) {
			//반복문2.
			for(int j = 0; j<i; j++) {
				//오름차순
				if(arr[j] > arr[j+1]) {
					int tem = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tem;
				}
			}
			System.out.println("결과값");
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("결과값1");
		System.out.println(Arrays.toString(arr));
	}	
}
