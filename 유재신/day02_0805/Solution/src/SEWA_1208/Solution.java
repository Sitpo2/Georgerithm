package SEWA_1208;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/SEWA_1208/flatten.txt");
		//Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(file);
		
		//10개의 테스트케이스가 주어짐
		for(int tc = 1; tc<=10; tc++) {
			
			
			//덤프개수 입력하기 및 상자높이 
			int T = sc.nextInt();
			int [] arr = new int [100];
			int N = arr.length; //100
			int Max = 0;
			int Min = 0;
			
			//배열정의하기
			for(int i =0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			
			//배열 반복(입력되는 값 상자높이로 받기)
			for(int t =0; t<T; t++) {
				for(int i = N-1; i>=0; i--) {
					for(int j = 0; j<i; j++) {
						if(arr[j]>arr[j+1]) {
							int tem = arr[j];
							arr[j] = arr[j+1];
							arr[j+1] = tem;			
						}
					}	
				}
				//최대값에서 -1, 최소값에서 +1
				arr[99] = arr[99]-1;
				arr[0] = arr[0]+1;
				
				//최대값 정의
				if(arr[99]>arr[98]) {
					Max = arr[99];
				} else {
					Max = arr[98];
				}
				//최소값 정의
				if(arr[0]>arr[1]) {
					Min = arr[1];
				} else {						
					Min = arr[0];
				}				
			}			
			System.out.println("#" + tc + " " + (Max-Min));
		}
	}
}
