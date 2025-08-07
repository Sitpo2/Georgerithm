import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MM14 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		
		//행우선, 열우선, 지그재크 순회
		
		int T = sc.nextInt();
		
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			//입력을 다 받아야 함!!!!!
			int [][] arr = new int [N][N];
			for(int r = 0; r<N; r++) {
				for(int c =0; c<N; c++) {
					//위까지 하면 (0,0) ~ (4,4)까지 나옴
					arr[r][c] = sc.nextInt();			
				}
				System.out.println(Arrays.toString(arr[r]));				}	
			
		}
		
		
}
}

// 가로, 세로, 지그재그로 읽을 수 있어야 함
// 감싸고 있는 숫자는 8개, 그러나 바닥,벽에 있는 것은 8개가 아님!!
//바닥과 벽을 만났을 때 어떻게 해야 에러가 안 날까?
// (4, 0)에 있는 숫자가 있으면 (r, c)
// if((r>=0) && (r<N)) 

//3번문제. String 으로?