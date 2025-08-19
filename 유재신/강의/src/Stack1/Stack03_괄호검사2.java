package Stack1;

import java.util.Stack;

public class Stack03_괄호검사2 {

	public static void main(String[] args) {
		String str = "(글쎄, 나는) 너를 그런() 의도로 행한건() 아니지()";
		
		//Stack으로 쌓기
		Stack<Character> stack = new Stack<>();
		
		//boolean을 써서 진실, 거짓인지 확인
		boolean isOK = true;
		
		//i번째 있는 값이 ( 인지 확인
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i); //각각의 문자를 ch에 입력
		
			
			//(, )인 경우 
			if(ch == '(') {
				stack.push(ch);
			} else if (ch == ')') {
				if(stack.isEmpty()) {
				isOK = false;
				break; // 다시 위의 for문으로 이동
				}
				stack.pop();
			}
					
		}
		
		
		if(isOK && stack.isEmpty()) {
			System.out.println("이상무");
		} else {
			System.out.println("이상있음");
		}
	}
	
	}
		
	


