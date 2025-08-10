package day05_0808;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class SEWA_1222_계산기1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = 10;

		
		for(int i = 1; i<tc; i++) {
			//길이수 101
			int length = sc.nextInt();
			sc.nextLine();
			//9+8+5...
			String str = sc.nextLine();
			//연산자 우선순위 설정
			Map<Character, Integer> priority = new HashMap<>();
			priority.put('*', 2);
			priority.put('/', 2);
			priority.put('+', 1);
			priority.put('-', 1);
			priority.put('(', 0);			
			//str에서 숫자만 담을거
			StringBuilder sb = new StringBuilder();
			//연산자 담을 거
			Stack <Character> stack = new Stack<>();
			
			for(int j =0; j<length; j++) {
				char tmp = str.charAt(j);
				//숫자면 str에 넣음
				if(Character.isDigit(tmp)) {
					sb.append(str.charAt(j));
					// '(' 만나면 그냥 stack에 넣기
				} else if (tmp == '(') { 
					stack.push(tmp); 
					// ')' 만나면 ( 만날 떄까지 모두 stack에서 연산자 빼서 sb에 넣기
				} else if (tmp == ')') {
					while(!(stack.peek()=='(')) {
						sb.append(stack.pop());
						//일반 연산자일 때
					} 
				} else {
						while (!stack.isEmpty() && priority.get(tmp)<=priority.get(stack.peek())) {
							sb.append(stack.pop());
					} stack.push(tmp);
				}
						
				} 
				while (!stack.isEmpty()) {
					sb.append(stack.pop());
				}
				
				//계산기
				
			}
			
		}
		
		
	}
