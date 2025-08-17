import java.util.Scanner;

public class SEWA_1989 {
	
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
		int tc = sc.nextInt(); //테스트케이스 개수
		
		for(int t = 1; t<=tc; t++) {
			
			String str = sc.next(); //level 받기
			int n = str.length(); //level의 길이 받기 5
			
			String answer = "0";
			
			String rev =  new StringBuilder(str).reverse().toString();
			
			if(str.equals(rev)) {
				answer = "1";
			} else {
					answer = "0";
				}
			
			System.out.print("#" + t + " ");
			System.out.println(answer);
			
			}
			
			
			
			
		}
		
 }
		




