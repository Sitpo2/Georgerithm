import java.util.Scanner;

public class Problem4_나머지 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();
		int F = sc.nextInt();
		int G = sc.nextInt();
		int H = sc.nextInt();
		int I = sc.nextInt();
		int J = sc.nextInt();
		
		int result1 = A%42; 
		int result2 = B%42; 
		int result3 = C%42;
		int result4 = D%42;
		int result5 = E%42;
		int result6 = F%42;
		int result7 = G%42;
		int result8 = H%42;
		int result9 = I%42;
		int result10 = J%42;
		
		int [] arr = {result1, result2, result3, result4, result5, result6, result7, result8, result9, result10};		
		//같을 떄 카운트
		int count = 0;
		
			if(arr[0] != arr[1] && arr[0] != arr[2] && arr[0] != arr[3] && arr[0] != arr[4] && arr[0] != arr[5] &&
					arr[0] != arr[6] && arr[0] != arr[7] && arr[0] != arr[8] && arr[0] != arr[9]) {
				count++;
			}
			if(arr[1] != arr[2] && arr[1] != arr[3] && arr[1] != arr[4] && arr[1] != arr[5] &&
					arr[1] != arr[6] && arr[1] != arr[7] && arr[1] != arr[8] && arr[1] != arr[9]) {
				count++;
			}
			if(arr[2] != arr[3] && arr[2] != arr[4] && arr[2] != arr[5] &&
					arr[2] != arr[6] && arr[2] != arr[7] && arr[2] != arr[8] && arr[2] != arr[9]) {
				count++;
			}
			if(arr[3] != arr[4] && arr[3] != arr[5] &&
					arr[3] != arr[6] && arr[3] != arr[7] && arr[3] != arr[8] && arr[3] != arr[9]) {
				count++;
			}
			if(arr[4] != arr[5] && arr[4] != arr[6] && arr[4] != arr[7] && arr[4] != arr[8] && arr[4] != arr[9]) {
				count++;
			}
			if(arr[5] != arr[6] && arr[5] != arr[7] && arr[5] != arr[8] && arr[5] != arr[9]) {
				count++;
			}
			if(arr[6] != arr[7] && arr[6] != arr[8] && arr[6] != arr[9]) {
				count++;
			}
			if(arr[7] != arr[8] && arr[7] != arr[9]) {
				count++;
			}
			if(arr[8] != arr[9]) {
				count++;
			}
			count++;
			System.out.println(count);
		}
}