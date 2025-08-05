package SEWA_1209_Sum;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/SEWA_1209_Sum/Sum.txt");
		Scanner sc = new Scanner(file);
		
		//테스트케이스 반복 10까지
		for(int tc = 1; tc<=10; tc++) {
			tc = sc.nextInt();		
			//2차배열 선언
			int [][] arr = new int [100][100];
			int N = arr.length;
			
			//최대값 정의
			int Maxr = 0;
			int Maxc = 0;
			int Max1 = 0;
			int Max2 = 0;
			
			//2차배열 정의하기
			for(int r = 0; r<N; r++) {
				for(int c = 0; c<N; c++) {
					arr[r][c] = sc.nextInt();
				}
			}	
			
			//각 행마다 합계 구하고 최대값 뽑아내기
			for(int r = 0; r<N; r++) {
				int sumr = 0;
				for(int c = 0; c<N; c++) {
					sumr += arr[r][c];
				}
					if (sumr > Maxr) {
						Maxr = sumr;
				}				
		}
				
			//각 열마다 합계 구하고 최대값 뽑아내기
			for(int c = 0; c<N; c++) {
				int sumc = 0;
				for(int r = 0; r<N; r++) {
					sumc += arr[r][c];	
				}	
					if (sumc > Maxc) {
						Maxc = sumc;
				}				
		}			
			
			//오른쪽으로 내려가는 대각선 합계 구하기	
			int sum1 = 0;
			for(int i = 0; i<N; i++) {			
				sum1 += arr[i][i];
					} 
					Max1 = sum1;
					
			
			//왼쪽으로 내려가는 대각선 합계 구하기
			int sum2 = 0;
			for(int i = 0; i<N; i++) {
				sum2 += arr[i][N-1-i];
					}
					Max2 = sum2;
						
			//4개의 값 중 최대합계 나오게 하기		
				
			if(Maxc>=Maxr && Maxc>=Max1 && Maxc>=Max2) {
				System.out.println("#" + tc + " " + Maxc);
			} else if (Maxr>=Maxc && Maxr>=Max1 && Maxr>=Max2) {
				System.out.println("#" + tc + " " + Maxr);
			} else if (Max1>=Maxc && Max1>=Maxr && Max1>=Max2) {
				System.out.println("#" + tc + " " + Max1);	
			} else {
				System.out.println("#" + tc + " " + Max2);
		}

	}
}
}