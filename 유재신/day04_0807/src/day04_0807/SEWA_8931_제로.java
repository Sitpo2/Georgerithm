package day04_0807;

import java.util.Scanner;
import java.util.Stack;

public class SEWA_8931_제로 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack <Integer> stack = new Stack<>();

		//테스트 케이스의 개수
		int tc = sc.nextInt();
		
		
		//#1 하기 위한 준비
		for(int t = 1; t<=tc; t++) {	
			int result = 0;
			//몇 개의 수를 가져오는지 선택
			int k = sc.nextInt();
						
			//stack에 쌓기
			for(int j = 0; j<k; j++) {
			int f = sc.nextInt();
				//값이 0 초과하면 result에 더한다.
			if(f > 0) {
				stack.push(f);
				result += stack.push(f);
				//값이 0이면 result에서 뺀다.
			} else if (f == 0) {
				if(!stack.isEmpty()) {
				stack.pop();
				result -= stack.pop();
			} else {
				result = 0;
			}
			}				
			}			
			System.out.println("#" + t + " " + result );
		}
	}
}