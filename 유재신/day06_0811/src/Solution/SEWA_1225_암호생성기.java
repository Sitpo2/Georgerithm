package Solution;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SEWA_1225_암호생성기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 개수 10
		int Tc = 10;
		
		
		for (int t = 1; t<=10; t++) {
			t = sc.nextInt();
			
			Queue<Integer> q = new LinkedList<>();
			
			for(int i =1 ; i<8; i++) {
				q.add(sc.nextInt()); 
			}
			
			int n =1;
			while(true) {
				int tmp = q.remove() - n++;
				if(n>5) {
					n=1;
					
				}
			}
		
	}
}
}
