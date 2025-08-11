import java.util.Scanner;

public class Problem6_알람시계 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M >= 45) {
			H = H;
			M = M-45;
			
		} else {
			H = H-1;
			M = M + 15;
		}
		
		if(H == -1) {
			H = 23;
		}
		System.out.println(H + " " + M);
	
		}
}