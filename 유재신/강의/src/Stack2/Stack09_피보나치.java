package Stack2;

public class Stack09_피보나치 {

	public static void main(String[] args) {
		//재귀의 흐름을 손으로 그려서!
		System.out.println(fact(5));
		
		System.out.println(fact(13)); // 아래 int2개를 long으로 바꾸기

	}
	
	public static int fact(int n) {
		//1. 기본 부분
		if(n <= 1) { //정답은 없고 문제를 보고 판단! 음수인 경우
			return 1;
		}
		
		//2. 재귀 부분
		return n*fact(n-1);
	}
}
