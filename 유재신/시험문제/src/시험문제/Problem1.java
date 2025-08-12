package 시험문제;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Tc = sc.nextInt();
		
		for (int t = 1; t<=Tc; t++) {
			String str = sc.next().toUpperCase(); // 대문자 만들기
			
			StringBuilder sb = new StringBuilder();
			int cnt = 1;
			
			for(int i = 0; i<str.length()-1; i++) {							
				if(str.charAt(i)==str.charAt(i+1)) {
					cnt++;
				} else if (str.charAt(i)!=str.charAt(i+1)) {
					sb.append(str.charAt(i)).append(cnt);
					cnt = 1;
				}
				
			}
			sb.append(str.charAt(str.length()-1)).append(cnt);
			System.out.println("#" + t + " " + sb);
		}

	}

}
