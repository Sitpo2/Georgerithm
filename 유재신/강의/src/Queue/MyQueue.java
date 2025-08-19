package Queue;

public class MyQueue {
	
	//배열 x -> 큐임. (크기 결정은 문제를 보고 판단)
	public static int[] queue = new int[10];
	public static int front = -1; //데이터 삭제 위치
	public static int rear = -1; //데이터 삽입 위치
	
	
	public static void main(String[] args) {
		enQueue(10);
		enQueue(20);
		enQueue(30);
		
		while(!isEmpty()) {
			System.out.println(deQueue());
		}
	}
	
	
	//포화 첵(배열이라서...)
	public static boolean isFull() {
		return rear == queue.length-1;
	}
	
	
	//공백 첵
	public static boolean isEmpty() {
		return front == rear;
	}
	
	//삽입
	public static void enQueue(int item) {
		//포화첵
		if(isFull()) {
			System.out.println("가득 차 있어서... 넣지 못함.");
		} else {
			//넣자!
			rear++;
			queue[rear] = item;
	//		queue[++rear] = item; //0으로 만들고 넣겠다.
		}
	}
	
	//삭제(반환 타입은 큐에 넣고 빼는 타입과 동일하다!)
	public static int deQueue() {
		//공백검사!
		if(isEmpty()) {
			System.out.println("꺼낼 값이 없어요.");
			return -1; //-1을 사용하면 내가 사용할 수 있는 값일 수 있어서 조심. 문제 범위에서 벗어나는 값 넣기.
		}
		return queue[++front]; //실제로 데이터를 지운것은 아님.
	}
	
	
	
	
	
	
	

	
	//큐를 초기화 하는 매서드(잘 안만드는 것 같다..)
	public void createQueue(int size) {
		queue = new int[size];
		front = -1;
		rear = -1;
	}
	
}
