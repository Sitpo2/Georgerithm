package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue04_마이쮸시뮬 {
	static class Person {
		int num; //사람의 번호
		int cnt; // 가져갈 수 있는 마이쮸의 개수
		public Person(int num, int cnt) {
		this.num = num;
		this.cnt = cnt;
	}
		@Override
		public String toString() {
			return "Person [num=" + num + ", cnt=" + cnt + "]";
		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			int ans = 0;
			int N = sc.nextInt(); //이번에 나누어줄 마이쮸의 양
			int pNum =1;
			
			//Q를 통해서 관리를 하겠다.
			//1. 사람의 번호 -> 
			//2. 가져올 수 있는 마이쮸의 개수
			//두개의 정보는 정수(int형)
			Queue<int[]> q = new LinkedList<>();
			
			q.offer(new Person(pNum++, 1));
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
	}
}
