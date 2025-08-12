package 연결스택;

public class LinkedStack {
	Node top; // 포인터 변수(1개, 스텍이기 때문)
	
	//공백상태
	public boolean isEmpty() {
		return top == null;
	}
	
	//포화상태 (연결스택에서는 작성하지 않음)
	
	//조회(확인)
	public Integer peek() {
		if(top == null) return null; //값이 없는 상태
		
		//그게 아니면
		return top.data;
	}
	
	///////////////////////////////////
	
	//push(삽입)
	public void push(int data) {
		//1. 노드 생성
		Node node = new Node(data);
		//2. 생성한 노드의 링크는 top으로 넣는다.
		node.link = top;
		//3. top을 옮긴다.
		top = node;
	}
	
	//pop(삭제)
	public Integer pop() {
//		if(top==null) return null;
		if(isEmpty()) return null;
		
		int data = top.data;
		top = top.link;
		return data;
	}
}
