package 시험문제;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem1_3 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/시험문제/input.txt");
		Scanner sc = new Scanner(file);
		
		int tc = sc.nextInt();
		
		for(int t = 1; t<=tc; t++) {
			String str = sc.next().toUpperCase(); //대문자
						
			StringBuilder sb = new StringBuilder();
			int cnt = 1;
			int sum = 0;
			
			System.out.println("#" + t + " ");
			
			for(int i = 0; i<str.length()-1; i++) {
				if (str.charAt(i) == str.charAt(i+1)) {
					cnt++;
			} else if (str.charAt(i) != str.charAt(i+1)) {
				sb.append(str.charAt(i));
				sum = cnt;
				sb.append(sum);
				cnt = 1;
			}
			}
			sb.append(str.charAt(str.length()-1));
			sb.append(cnt);
			System.out.println(sb);
			
		}

	}
}
