package Stack1;


//기초 자료형, 참조 자료형 인지 필요


public class Stack04_함수호출 {

	public static void main(String[] args) {
		
		System.out.println("메인함수 실행"); //1
		int a = 10;
		function1();
		System.out.println("메인함수 종료"); //6

	}

	private static void function1() {
		System.out.println("함수1 실행"); //2
		int a = 20;
		function2(a);
		System.out.println(a);
		System.out.println("함수1 종료"); //5
		
	}

	private static void function2(int a) {
		System.out.println("함수2 실행"); //3
		System.out.println(a);
		a = 30;
		System.out.println(a);
		System.out.println("함수2 종료"); //4
		
	}

}
