import java.util.Arrays;
import java.util.Scanner;

public class Problem11_바구니뒤집기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//바구니 개수
		int N = sc.nextInt(); //5
		//M번 순서 바꿀거다
		int M = sc.nextInt(); //4
		
		int [] arr = new int [N];
		
		//바구니 1, 2, 3, 4, 5 입력
		for (int i = 0; i<N; i++) {
			arr[i] = i+1; //arr[0] = 1 ~ arr[4] = 5
		}
		//순서 바꿔줄거야
		for (int m = 0; m<M; m++) {
			//바꿀 시작점
			int i = sc.nextInt()-1;
			//도착점
			int j = sc.nextInt()-1;
			
			//순서바꾸기
			for(int r = i; r<=j-i-1; r++) {
			int tmp = 0;
			tmp = arr[i];
			arr[r] = arr[j-i-r]; 
			arr[j-i-r] = tmp;
			}
			
			
			
		
		
		
		
		
		
		
		
		
		
		
			System.out.println(Arrays.toString(arr));
		
	}
		
}
}
