package day05_0808;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class SEWA_1222_계산기2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 10개
		int tc = 10;
		
		for(int t = 1; t<=tc; t++) {
			int length = sc.nextInt();
			sc.nextLine();
			String str = sc.nextLine();
			
			Map<Character, Integer> priority = new HashMap<>();
			priority.put('*', 2);
			priority.put('/', 2);
			priority.put('+', 1);
			priority.put('-', 1);
			priority.put('(', 0);
			
			StringBuilder sb = new StringBuilder();
			Stack <Character> stack = new Stack<>();
			
			for(int i = 0; i<str.length(); i++) {
				char tmp = str.charAt(i);
				
				if(tmp>='0' && tmp<='9') {
					sb.append(tmp);
				} 
				else if(tmp == '(') {
					stack.push(tmp);
				}
				else if(tmp == ')') {
					while(stack.peek() != '(') { //( 가 아니면 뽑아낸다
						sb.append(stack.pop());
					} stack.pop(); // (이면 이거 뽑음
				}
				else {
					while (!stack.isEmpty() && priority.get(stack.peek())>=priority.get(tmp)) {
						sb.append(stack.pop());
					} 
					stack.push(tmp);
				}				
			}
			while(!stack.isEmpty()) {
				sb.append(stack.pop());
			}
			//계산식
			Stack <Integer> intStack = new Stack<>();
			for(int i = 0; i<length; i++) {
				char c = sb.charAt(i);
				
				if(c>='0' && c<='9') {
					 intStack.push(c - '0');
				} else {
					intStack.push(intStack.pop()+intStack.pop());
				}
			}
			System.out.println("#" + t + " " + intStack.pop() );
		}	
	}
}

