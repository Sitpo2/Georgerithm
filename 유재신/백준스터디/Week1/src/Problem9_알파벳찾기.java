import java.util.Arrays;
import java.util.Scanner;

public class Problem9_알파벳찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//baekjoon 등록
		String str = sc.next();
		
		//이거 몰랐음. 알파벳도 할 수 있구나...
		for(char ch ='a'; ch<='z'; ch++) {
			//처음 발견했을 때 수 구하기
			int idx = str.indexOf(ch);
		
			
			System.out.print(idx + " ");
		}
		
	}
}