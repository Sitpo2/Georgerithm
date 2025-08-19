package Stack2;

import java.util.Arrays;

public class Stack08_팩토리얼 {
	static int[] count = new int[100];
	public static void main(String[] args) {
		//N은 음수가 들어오지 않는다.
		System.out.println(fibo(15));
//		System.out.println(Arrays.toString(count));
	}
	//n을 구하려면 n-1, n-2 필요
	public static int fibo(int n) {
		
		//기본 부분
//		if(n==0) {
//			return 0;
//		}
//		
//		if(n == 1) {
//			return 1;
//		}
		
		if(n<2) return n;
		
		//재귀 부분
		return fibo(n-1) + fibo (n-2);
	}
	//저장해서 쓰면 중복연산을 막을거 같은데? 메모리 vs 시간
	static int [] memo = new int[50];
	static {
		memo[0]=0;
		memo[1] =1;
	}
	
	public static int fibo2(int n) {
		if(n>=2 && memo[n]==0) 
			memo[n] = fibo2(n-1) + fibo2(n-2);
			return memo[n];
	}
}
