package day03_0806;

import java.util.Scanner;

public class SEWA_1215_회문1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트케이스 총 10개
		int tc = 10;
		
		for(int t = 1; t<=tc; t++) {
			
			//첫번째 줄의 찾아야 할 회문길이 정의
			int f = sc.nextInt();
			sc.nextLine();
			
			//2차 배열 정의하기(한 줄 씩 2차배열의 0행, 1행 ... 7행으로 옮기기)
			char [][] arr = new char[8][8];
			for(int r = 0; r<arr.length; r++) {
				String line = sc.nextLine();
				for(int c = 0; c<arr.length; c++) {
					arr[r][c] = line.charAt(c);							
				}
			}		
			
			int count = 0; 
			//회문 찾기(가로)
			for(int r = 0; r<arr.length; r++) {
				for(int c = 0; c<=arr.length-f; c++) { //f를 4라고 가정 -> 4글자이므로 [0][4]까지 진행하면 됨
					boolean find = true;
					//찾는 문자열 길이에 따라 찾는 위치가 달라짐
					//예시로 4개의 문자를 찾기 위해 0부터 5까지만 탐색하면 됨 -> arr.lengt-f
					for(int i = 0; i<(f/2); i++) {
						if(arr[r][c+i] != arr[r][c+f-i-1]) {
							find = false;
							break;
						}	
					}
					if(find) {
						count++;
					}
				}
			}
			
			//회문 찾기(세로)
			for(int c = 0; c<arr.length; c++) {
				for(int r = 0; r<=arr.length-f; r++) {
					boolean find = true;
					//찾는 문자열 길이에 따라 찾는 위치가 달라짐
					//예시로 4개의 문자를 찾기 위해 0부터 5까지만 탐색하면 됨 -> arr.lengt-f
					for(int i = 0; i<(f/2); i++) {
						if(arr[r+i][c] != arr[r+f-i-1][c]) {
							find = false;
							break;
						}	
						}
					if (find) {
						count++;
					}
				}
			}
			System.out.println("#" + t + " " + count);
		}
	}
}