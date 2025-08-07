package day04_0807;

import java.util.Scanner;
import java.util.Stack;

public class SEWA_1218_괄호짝짓기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 
		//테스트 케이스 입력
		int tc = 10;
		
		// #1 하기 위한 준비
		for(int t=1; t<=tc; t++) {
			
			//길이 입력
			int N = sc.nextInt(); // 181

			//Stack 정의
			Stack <Character> stack1 = new Stack <>();
			Stack <Character> stack2 = new Stack <>();
			Stack <Character> stack3 = new Stack <>();
			Stack <Character> stack4 = new Stack <>();
			String str = sc.next(); // 한 문장
			
			//진실인지 아닌지 판단
			boolean isOK1 = true;
			boolean isOK2 = true;
			boolean isOK3 = true;
			boolean isOK4 = true;
			
			
			//str의 1번째부터 181번째까지 받을 거임
			for(int i = 0; i<str.length(); i++) {
				//ch에 str의 값들 하나씩 입력
				char ch = str.charAt(i);
				
				//stack1에 { 입력 그리고 } 발견시 pop
				if(str.charAt(i) == '{') {
					stack1.push(ch);
				} else if (str.charAt(i) == '}') {
					if(stack1.isEmpty()) {
					isOK1 = false;
					break;						
					} 
					stack1.pop();
				}
				
				//stack2에 [
				if(str.charAt(i) == '[') {
					stack2.push(ch);
				} else if (str.charAt(i) == ']') {
					if(stack2.isEmpty()) {
					isOK2 = false;
					break;						
					}
				stack2.pop();
				}
				//stack3에 (
				if(str.charAt(i) == '(') {
					stack3.push(ch);
				} else if (str.charAt(i) == ')') {
					if(stack3.isEmpty()) {
					isOK3 = false;
					break;						
					}
				stack3.pop();
				}
				//stack4에 <
				if(str.charAt(i) == '<') {
					stack4.push(ch);
				} else if (str.charAt(i) == '>') {
					if(stack4.isEmpty()) {
					isOK4 = false;
					break;						
					}
				stack4.pop();							
				}
			//??
				
				
		}
			//stack의 남은 것이 없으면 1 / 있으면 0
			if(isOK1 && isOK2 && isOK3 && isOK4 && stack1.isEmpty() && stack2.isEmpty() && stack3.isEmpty() && stack4.isEmpty()) {
				System.out.println("#" + t + " " + 1);
			} else {
				System.out.println("#" + t + " " + 0);
			}						
			
	}
			
}		
}		