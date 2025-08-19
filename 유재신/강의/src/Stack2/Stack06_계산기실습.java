package Stack2;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Stack06_계산기실습 {

	public static void main(String[] args) {
		// 문자열로된 수식 -> 입력받은 수식
		String infix = "(6+5*(2-8/2))";
		
		//연산자 우선순위 (Map을 이용해보자) -> 스택 내부에서 판단할 것이기 때문에 닫는 괄호는 필요 없음.
		
		// * / : 2
		//+ - : 1
		// ( : 0
		
		Map<Character, Integer> priority = new HashMap<>();
		priority.put('*', 2);
		priority.put('/', 2);
		priority.put('+', 1);
		priority.put('-', 1);
		priority.put('(', 0);
		
		StringBuilder postfix = new StringBuilder();
		//연산자를 담는 스택
		Stack<Character> op = new Stack<>();
		
		//글자를 하나씩 읽어오자! (피연산자는 한자리수임을 보장!)
		for(int i = 0; i<infix.length(); i++) {
			char tmp = infix.charAt(i);
			//1. 피연산자라면
			if(tmp>= '0' && tmp<='9') {
				postfix.append(tmp);
			} //2. 연산자라면... -> 고민
			//2-1. '(' 소괄호라면
			else if(tmp == '(') {
				//바로 추가
				op.push(tmp);
				
			}
			//2-2. ')' 닫는 소괄호라면 -> 여는 괄호 만날때까지 pop
			else if(tmp==')') {
				while(op.peek() != '(') {
					postfix.append(op.pop());
			}
			op.pop(); //스택의 top은 '('를 가리키고 있음 (버리기)
			}
		//2-3. 연산자라면
			else { 
				//공백상태라면...
				op.push(tmp);
			} else { 
			//연산자 우선순위를 비교해서 처리한다!
		}
	}
		while(!op.isEmpty())
			postfix.append(op.pop());
	}
	}
