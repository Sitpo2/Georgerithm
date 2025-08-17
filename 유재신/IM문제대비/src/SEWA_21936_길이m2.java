import java.util.Scanner;

public class SEWA_21936_길이m2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt(); //테스트케이스 3
		
		for(int t = 1; t<=tc; t++) {
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		String str = sc.next();
		String answer = "None";
		
		for(int i = 0; i<=N-M; i++) {
			String original = str.substring(i, i+M);
			String reverse = new StringBuilder(str.substring(i, i+M)).reverse().toString();
			if(original.equals(reverse)) {
				answer = original;
		}
		}
		System.out.println(answer);
	}

}
}
