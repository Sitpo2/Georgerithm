package Queue;

import java.util.Arrays;

public class Queue03_원형큐 {
	
	//배열처럼 보이지만 사실은 원형큐 (자기암시)
	// 한칸은 비워서 구분을한다(포화/공백)
	public static String[] cQ = new String[5];
	public static int front = 0, rear = 0;
	
	public static void main(String[] args) {
		
		enQueue("이서현");
		enQueue("유재신");
		deQueue();
		enQueue("양동근");
		enQueue("헤일리");
		deQueue();
		enQueue("안태리");
		enQueue("예성");

		
		
		//데이터가 있는 것처럼 보이지만... 사실은 없는 것.
		System.out.println(Arrays.toString(cQ));
		
//		while(!isEmpty()) {
//			System.out.println(deQueue());
//		}

	}

	
	
	//공백(선형큐와 동일)
	public static boolean isEmpty() {
		return front == rear;
	}
	
	//포화(rear 들어갈 다음위치와 front가 동일하다면 포화 상태)
	public static boolean isFull() {
		return front == (rear+1)%cQ.length;
	}
	
	//삽입
	public static void enQueue(String item) {
		//포화검사
		if(isFull()) {
			System.out.println("가득 차있다!");
			//배열의 크기를 2배로 키우고 안에 내용을 복사해서 넣어두어도 괜찮겠다! 
			return;
		}
		//rear 증가시킬건데 -> 순환하는 것도 고려해야 함!
		rear = (rear+1)% cQ.length;
		cQ[rear] = item;
	}
	
	//삭제
	public static String deQueue() {
		//공백검사
		if(isEmpty()) {
			System.out.println("공백 상태라서 꺼낼 것이 없다.");
			//배열의 크기를 좀 줄일까?
			return null;
		}
		front = (front+1)%cQ.length;
		//실제로 데이터를 지우는가? 지우고 있지는 않음. 덮어쓰기 되고 있는거임
		return cQ[front];
	}
	
}
