import java.util.Arrays;
import java.util.Scanner;

public class Problem9_숫자찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//baekjoon 등록
		String str = sc.next();
		
		//숫자는 안되나
		for(char ch ='1'; ch<='9'; ch++) {
			//처음 발견했을 때 수 구하기
			int idx = str.indexOf(ch);	
		
			
			System.out.print(idx + " ");
		}
		
	}
}