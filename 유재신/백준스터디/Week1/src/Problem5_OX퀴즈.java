import java.util.Scanner;

public class Problem5_OX퀴즈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Tc = sc.nextInt(); //5
		sc.nextLine();
		
		for(int i =0; i<Tc; i++) {
			
			String str = new String();
			str = sc.nextLine();
			int N = str.length();
			
			int cnt = 0;
			int sum = 0;
			
			//조건 걸기
			for(int j = 0; j<N; j++) {
				if(str.charAt(j) == 'O') {
					cnt++;
					sum += cnt;
				}
				//X를 만나면 cnt는 0으로 초기화
				else {
					cnt=0;
				}
			}
			System.out.println(sum);
		}		
		}
}