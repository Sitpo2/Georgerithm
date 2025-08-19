package Stack1;

import java.util.Stack;

public class Stack03_괄호검사 {

	public static void main(String[] args) {
		// 소괄호만 있는
		
		//괄호검사
		//1. 여는괄호와 닫는괄호의 개수는 동일해야 한다.
		//2. 여늘괄호는 닫는괄호보다 먼저 나와야 한다.
		//3. 괄호는 포함관계여야 한다. (소괄호만 있으니까 여기서는 굳이.)
		
		String str = "()()((())";
		
		Stack<Character> stack = new Stack<>();
		boolean isOK = true ; //정상인지 아닌지를 체크하기 위함 
		//만약 str이 ())()()이면 더이상 진행할 필요 없음
		
		for(int i =0; i<str.length(); i++) {
			//1. 여는 괄호 넣어!
			if(str.charAt(i) == '(') {
				stack.push(str.charAt(i));
			}
			//2. 닫는괄호 확인 필수
			else {
				//공백체크
				if(stack.isEmpty()) {
					isOK = false;
					break;
				} else {
					char c = stack.pop(); //검사실시
					
	//				if(c==')') 오후에는 필요
				}
			}
		}// 검사 for문
		
		//괄호검사 끝
		if(isOK && stack.isEmpty()) {
			System.out.println("검사결과 이상 무!");
		} else 
			System.out.println("이슈 발생");
		}
	
		}
		
	


