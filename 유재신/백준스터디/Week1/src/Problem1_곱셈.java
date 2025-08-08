import java.util.Scanner;

public class Problem1_곱셈 {

	public static void main(String[] args) {
		//세자리수 x 세자리수
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		
		int a = x/100;
		int b = x/10 - a*10;
		int c = x - a*100 - b*10;
		int d = y/100;
		int e = y/10 - d*10;
		int f = y - d*100 - e*10;
		
		System.out.println((a*100+b*10+c)*f);
		System.out.println((a*100+b*10+c)*e);
		System.out.println((a*100+b*10+c)*d);
		System.out.println((a*100+b*10+c)*f +((a*100+b*10+c)*e)*10+((a*100+b*10+c)*d)*100 );
	}

}
