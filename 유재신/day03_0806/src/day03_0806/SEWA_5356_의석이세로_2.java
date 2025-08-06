package day03_0806;

import java.util.Scanner;

public class SEWA_5356_의석이세로_2 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			//테스트 케이스 입력
			int T = sc.nextInt();
			sc.nextLine();
			
			for(int t= 1; t<=T; t++) {
				
				//입력받을 2차배열 정의
				char [][] arr = new char[5][15];
				//숫자 입력받을 1차배열 정의해야 함
				for(int r = 0; r<arr.length; r++) { //길이5
					//행을 고정하고, 열을 왼쪽에서 오른쪽으로 이동시켜 값을 입력해야 함
					//char[] line = sc.nextLine().toCharArray(); //1차배열에 입력받은 수들 입력
					String line = sc.nextLine();
					for(int c = 0; c<line.length(); c++) {
						//arr[r][c] = line[c]; //arr[0][0] ~ arr[0][4]까지 line[0] ~ line[4]값 입력
						arr[r][c] = line.charAt(c);
					}
				}
				
				//배열 출력
				System.out.print("#" + t + " ");
				for(int c = 0; c<arr[0].length; c++) {
					for(int r = 0; r<arr.length; r++) {
						if(arr[r][c] == 0) {
							break;
						}
						System.out.print(arr[r][c]);
					}
					
				}
				System.out.println(" ");
			}
		
		}
	}	