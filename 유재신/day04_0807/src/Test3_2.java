public class Test3_2 {


	
	public static void main(String[] args) {
		int n =4;
		hanoi(n, 'A', 'B', 'C');
		System.out.println(cnt);
	}
	static int cnt = 0;
	static void hanoi (int n, char from, char tmp, char to) {
		//1. 종료될 떄
		if(n==1) {
			System.out.printf("%c -> %c\n", from, to);
			cnt++;
		}
		//2. 재귀조건
		if(n>1) {
			hanoi(n-1, from, to, tmp);
			System.out.printf("%c -> %c\n", from, to);
			hanoi(n-1, tmp, from, to);
			cnt++;
		}
	}

}
