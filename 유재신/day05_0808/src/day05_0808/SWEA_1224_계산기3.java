package day05_0808;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class SWEA_1224_계산기3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = 10;
		
		for(int t =1; t<=tc; t++) {
			int length = sc.nextInt(); // 113
			sc.nextLine(); 
			String str = sc.nextLine(); // (9+(5*2...
			
			Map <Character, Integer> priority = new HashMap<>();
			priority.put('*', 2);
			priority.put('+', 1);
			priority.put('(', 0);
			
			Stack <Character> stack = new Stack<>(); //비연산자 담을거야
			StringBuilder sb = new StringBuilder(); //숫자(문자) 담을거야
			
			for(int i = 0; i<length; i++) {
				if(Character.isDigit(str.charAt(i))) {
					sb.append(str.charAt(i)); // 숫자는 sb에 담갔어!
					
				} else if (str.charAt(i) == '(') { // (이면 stack에 넣는다
					stack.push(str.charAt(i));
					
				} else if (str.charAt(i) == ')') {
					while(stack.peek() != '(') {
						sb.append(stack.pop()); // //(만나기 전까지 sb에 넣는다.						
					} stack.pop(); // ( 를 뺀다
					
				} else {
					while (!stack.isEmpty() && priority.get(str.charAt(i))<=priority.get(stack.peek())) {
						sb.append(stack.pop());
					} stack.push(str.charAt(i)); // + * 일때 해결
				}
			}
				while (!stack.isEmpty()) { //남은 연산자 sb에 넣기 //주의! i부터 모든 것까지 행하고 남은 거를 더하는 거
					sb.append(stack.pop());
				}
				
				//계산식을 만들자!
				Stack <Integer> stack2 = new Stack<>(); // Integer로 스택만들거야
				
				int answer = 0;
				
				for(int i = 0; i<sb.length(); i++) {
					int result = 0;
				char tem = sb.charAt(i);
					if(Character.isDigit(tem)) {
						stack2.push(tem - '0');
					}
					else if (tem == '*') {
						result = stack2.pop()*stack2.pop();
						stack2.push(result);
					} else if (tem == '+') {
						result = stack2.pop()+stack2.pop();
						stack2.push(result);				
					}	
					answer = result;
				}
				
				System.out.println("#" + t + " " + answer);
		}
	}
}