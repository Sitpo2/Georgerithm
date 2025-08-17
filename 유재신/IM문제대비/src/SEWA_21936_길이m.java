import java.util.Scanner;

public class SEWA_21936_길이m {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt(); //테스트케이스 3
		
		for(int t = 1; t<=tc; t++) {
			int N = sc.nextInt(); //N 5
			int M = sc.nextInt(); //M 3
			
			String str = sc.next(); //문자열 입력
			String answer = "None"; //기본값 입력
			
			for(int i = 0; i<=N-M; i++) {
				String a = str.substring(i, i+M); //0자리부터 2까지 a로 저장
				String rev = new StringBuilder(a).reverse().toString(); //반대 문자
				if(a.equals(rev)) {
					answer = a;

				}
			}
			System.out.println("#" + t + " " + answer);
			
			
			
		}

	}

}
