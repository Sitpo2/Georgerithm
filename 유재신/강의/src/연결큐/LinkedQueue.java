package 연결큐;

public class LinkedQueue {
	Node front; //첫번째 노드
	Node rear; //마지막 노드
	
	//공백 확인
	public boolean isEmpty() {
		 return front == null && rear == null; 
	}
	
	//peek(조회)
	public Integer peek() {
		if(isEmpty()) return null; //비워져있으면
		return front.data; //비워진게 아니면
	}
	
	//삽입
	//1. 공백 상태에서 삽입
	//2. 이미 원소가 존재하는 상태에서 삽입
	public void enQueue(int data) {
		//노드 생서
		Node node = new Node(data);
		//1. 공백이면
		if(isEmpty()) {
			front = rear = null;
		} else {
			rear.link = node;
			rear = node;
		}		
	}
	
	//삭제
	//1. 공백상태에서 삭제
	//2. 그냥 삭제
	public Integer deQueue() {
		if(isEmpty()) return null;
		
		int data = front.data;
		front = front.link;
		if(front == null) 
			rear = null;
		return data;
	}
}
