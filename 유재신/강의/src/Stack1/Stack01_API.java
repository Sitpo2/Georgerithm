package Stack1;

import java.util.Stack;

public class Stack01_API {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>(); //List<> stack = mew StacK<>() 도 가능
		//<>: 참조자료형 쓰는 자리
		// 위는 이제 Integer를 넣어 숫자를 담을 수 있음
		//Stack<String> : 문자 담음
		
		//주요 메서드
		//1. push(item: 참조자료형(Integer))
		int result = stack.push(10);
		System.out.println(result);
		
		stack.push(20);
		stack.push(30); //30 20 10 이렇게 현재 쌓여있음
		
		
		//2. pop()
		System.out.println(stack.pop()); //남은거 20 10
		System.out.println(stack.pop()); // 10
		System.out.println(stack.pop()); // 아무것도 안남음
//		System.out.println(stack.pop()); //없는걸 꺼내려하면 예외발생 (unchecked error 발생)
		
		//무작정 빼면 안 될것같아.... 비어있냐?
		System.out.println(stack.isEmpty());
		
		
		//안에 있는거 전부 빼라
		stack.clear(); //스택을 초기화 해버리는 것!
		
		//조건을 확인해봐야 함
		while(!stack.isEmpty()) { //while의 조건문이 거짓이면 멈춤
			stack.pop();
		}
		while(stack.size() > 0) { //while의 조건문이 거짓이면 멈춤
			stack.pop();
		}
		
		System.out.println(stack.size());
		
		//4. peek() 꺼내지 않고 제일 위의 값을 확인만 함
		stack.push(100);
		stack.push(200);
		
		System.out.println(stack.peek());
	}

}
