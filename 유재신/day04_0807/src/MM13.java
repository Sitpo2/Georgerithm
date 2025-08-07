import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MM13 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		
		//행우선, 열우선, 지그재크 순회
		
		int T = sc.nextInt();
		int N = sc.nextInt();
		int cnt = 0;
		int [][] arr = new int[N][N]; 
				
//		for(int r = 0; r<N; r++) {
//			for(int c =0; c<N; c++) {
//				//위까지 하면 (0,0) ~ (4,4)까지 나옴
//				arr[r][c] = sc.nextInt();			
//			}
////			System.out.println(Arrays.toString(arr[r]));	
//		}	
		
		
		
		
		for(int c = 0; c<N; c++) {
			for(int r =0; r<N; r++) {
				//위까지 하면 (0,0) ~ (4,4)까지 나옴
				arr[c][r] = sc.nextInt();			
			}
			System.out.println(Arrays.toString(arr[c]));	
		}
				
				
				
				
				
				
				
//				if(r==1) {
//					continue; // r=1일 때 값은 변경하지 않도록 함.
				
//				if(r==1) {
//					break; // 이렇게하면 위의 위 for문으로 넘어감
				
				
				
			
		}

	}


