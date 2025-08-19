package Stack2;

public class Stack07_재귀 {

	public static void main(String[] args) {
		function1();
	}
	//단순히 나자신을 호출하게 되면... 무한 호출 곤란!
	public static void function1() {
		System.out.println("function1 호출");
//		function1();
		function2(10);
	}
	
	public static void function2(int num) {
		//1. 기본 부분(재귀를 끝내는 조건) -> 잘 커버할 수 있게 해야한다.
		if(num<0) {
			return;
		}
		//2. 재귀를 호추라는 부분
		else {
			System.out.println("function2 호출");
			function2(num-1);
		}
	}

}
