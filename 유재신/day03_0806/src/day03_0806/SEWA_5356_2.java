package day03_0806;

import java.util.Scanner;

public class SEWA_5356_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//처음에 있는 숫자 읽음(test case)
		int T = sc.nextInt();
		sc.nextLine();
	
		//배열 정의 및 각 숫자별 나오는 수 입력하기
		for(int t = 1; t<=T; t++) {
			char [][] arr = new char [5][15]; //5행 15열까지 입력가능하도록 함(문제에서 정의)
			int N = arr.length; //2차 배열 행의 길이: 5
			
			//2차 배열 안에 입력
			for(int r=0; r<arr.length; r++) {
				char [] line = sc.next().toCharArray(); //line이라는 1차배열에 값들을 넣기
				for(int c=0; c<line.length; c++) {
					arr[r][c] = line[c];
				}
			}
			
			//2차 배열 출력
			System.out.print("#" + t + " ");
			for(int c = 0; c<arr[0].length; c++) {
				for(int r = 0; r<arr.length; r++) {
					if (arr[r][c]==0) 
						continue;
					System.out.print(arr[r][c]);
				}			  
			}
			System.out.println(" ");
		}

	}

}
