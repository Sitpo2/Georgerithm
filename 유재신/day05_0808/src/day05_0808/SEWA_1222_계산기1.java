package day05_0808;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class SEWA_1222_계산기1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 10개
		int tc = 10;
		
		for(int t  = 1; t<=tc; t++) {
			//첫줄은 계산식의 길이 나옴
			int Line = sc.nextInt();
			sc.nextLine();
			//다음 줄 전체 st로 이동
			String st = sc.nextLine();
			
			//연산자 우선순위 결정
			Map <Character, Integer> priority = new HashMap<>();
			priority.put('*', 2);
			priority.put('/', 2);
			priority.put('+', 1);
			priority.put('-', 1);
			priority.put('(', 0);
			
			//비연산자 담을 그릇
			StringBuilder sb = new StringBuilder(); // 현재 sb는 빈 상태. 나중에 담아야 함
			//연산자 담을 그릇
			Stack <Character> stack = new Stack<>();
			
			for(int i =0; i<st.length(); i++) {
				//임시적으로 st의 0번째부터 길이-1까지 tmp에 저장
				char tmp = st.charAt(i);
				
				//비연산자이면 sb에 추가하기
				if (tmp>='0' && tmp<='9') {
					sb.append(tmp);
				} 
				//여는 괄호이면 넣기
				else if (tmp == '(') {
					stack.push(tmp);
					// 닿는 괄호이면 ( 만날 때까지 빼고 sb에 넣기
				} else if (tmp == ')') {
					while(stack.peek()!='(') {
						sb.append(stack.pop());
					} stack.pop();
					//연산자인 경우(stack이 비지 않아야 하고 -> 비었으면 그냥 넣음, 제일 위에 있는게 현재 넣는것보다 커야함)
				} else { 
					while(!stack.isEmpty() && priority.get(stack.peek()) >= priority.get(tmp)) {
						sb.append(stack.pop());
					}
					stack.push(tmp);
				}
						
			}
			//마지막에 있는 + 넣기 위해
			while(!stack.isEmpty()) {
				sb.append(stack.pop());
			}	
		System.out.println(sb.toString());
			
		}
	}
	

}
