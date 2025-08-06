package day03_0806;

import java.util.Scanner;

public class SEWA_1215_회문2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트케이스 총 10개
		int TC = 10;
				
		for(int tc = 1; tc<=TC; tc++) {
			//첫번째 줄은 회문의 길이
			int T = sc.nextInt();
			sc.nextLine();
		//8 x 8배열 생성
		char [][] arr = new char [8][8];
		
		//나중에 일치하는 회문 세기 위해서
		int cnt = 0;
		
		//배열안에 입력 (1차배열로 먼저 읽고, 2차 배열에 집어넣기)
		for(int r = 0; r<arr.length; r++) {
			//char [] line = sc.nextLine().toCharArray();
			String line = sc.nextLine();
			for(int c = 0; c<arr.length; c++) {
				//arr[r][c] = line[c];
				arr[r][c] = line.charAt(c);
			}
		}
		
		// 가로회문 검사
		for(int r = 0; r<arr.length; r++) {
			for(int c =0; c<=arr.length-T; c++) {		
				boolean found1 = true; //다 회문인데 아닌걸 찾는걸로 가저
				for(int i = 0; i<T/2; i++) {
					if(arr[r][c+i] != arr[r][c+T-1-i]) {
						found1 = false;
					break;
				}
			} 
			if (found1)
				cnt ++;
			}
		}
		
		//세로회문 검사
		for(int c = 0; c<arr.length; c++) {
			for(int r =0; r<=arr.length-T; r++) {
				boolean found2 = true;
				for(int i = 0; i<T/2; i++) {
					if(arr[r+i][c] != arr[r+T-1-i][c]) {
						found2 = false;
					break;
				}
			} 
			if (found2)
				cnt ++;
			}
		}
				
		System.out.println("#" + tc + " " + cnt);
	}
}
}