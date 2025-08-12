package 시험문제;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem1_2 {
	static StringBuilder ans; //변수가 class 만들어지자마자 함께 들어감
		
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("./src/시험문제/input.txt");
		Scanner sc = new Scanner(file);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc<=T; tc++) {
			ans = new StringBuilder(); // 초기화
			
			// 문자 입력받기 (String)
			// chartAt
			// .length() 길이 ->n
			// 문자의 길이만큼 반복
			
			//i, j 투 포인트
			// 문자의 길이만큼 반복
			// while(i< n)
			// 일단 나의 기준은 i, 그래서 j를 i부터 탐색
			// j = 1
			// j~ 다른 알파벳 나올때까지 반복
			//j~n의 길이까지 charAt(j) == chartAt(i)
			
			//while(j<n && charAt(j)==chartAt(i))
				//j를 하나씩 올려주기
			
			
			//  ans에 한 알파벳을 몇번 카운팅 했는지 적립
			// .append를 활용해서 
			// 알파벳 써주고
			// 그 알파벳 몇번 나왔는지 적립
			   01234567
			// AAAAAAABC
			   i = 0
			   i = j로 적립
			
			System.out.println("#" + tc + " " + ans);
		}
		sc.close();
	}

}
