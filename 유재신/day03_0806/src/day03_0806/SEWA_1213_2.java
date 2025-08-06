package day03_0806;

import java.util.Scanner;

public class SEWA_1213_2 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = 10;
		
	//테스트 케이스 입력 1부터 10까지
		for(int t = 1; t<=T; t++) {
			//다음값을 읽기 위해
			sc.nextLine();
			
			String pattern = sc.nextLine(); //2번째줄을 pattern으로 인식하고 다음줄로 이동
			String text = sc.nextLine(); //3번째줄을 전체 문장으로 인식
			int count = 0; //나중에 해당 문자를 찾으면 값을 증가시키기 위해 사용
			
			for(int i =0; i<= text.length()-pattern.length(); i++) {
				boolean find = true;
				for(int j = 0; j<pattern.length(); j++) {
					if(text.charAt(i+j) != pattern.charAt(j)) {
						find = false;
						break;
					}
				}
				if (find) {
					count++;
			}
			}
			System.out.println("#" + t + " " + count);
		}
		
	}
}