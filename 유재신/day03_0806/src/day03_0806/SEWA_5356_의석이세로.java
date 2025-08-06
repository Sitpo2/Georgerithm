package day03_0806;

import java.util.Scanner;

public class SEWA_5356_의석이세로 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//메모장 첫번째 라인 T로 선언 및 다음줄로 이동
		int T;
		T = sc.nextInt();
		sc.nextLine();
		
		for(int t=1; t<=T; t++) {
			char [][] arr = new char [5][15];  //5행 15열의 2차배열이 생성
			
			//배열 입력
			for (int r = 0; r<arr.length; r++) { // 5
				char [] line = sc.nextLine().toCharArray(); //받아온 문자를 문자열로 만듬
				for(int c = 0; c<line.length; c++) { 
					arr[r][c] = line[c]; //0행에서 숫자를 차례대로 입력
				}
			}
			
			//배열 출력
			System.out.print("#" + t + " ");
			for(int c = 0; c<arr[0].length; c++) {
				for(int r = 0; r<arr.length; r++) {
					if(arr[r][c]==0)
						continue;
					
					System.out.print(arr[r][c]);
				}
			}
			System.out.println(" ");
			
		}		
}
}