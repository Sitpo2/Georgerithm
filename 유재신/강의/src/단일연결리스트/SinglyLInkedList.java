package 단일연결리스트;

public class SinglyLInkedList {
	Node head; //연결리스트 시작점
	int size; //사이즈 알고 있으면 쓸데가 있음
	
//	public SinglyLInkedList() {
//		this.head = head;
//		this.size = size;
//	}
	
	
	//조회
	public Node get(int idx) {
		if(idx < 0 || idx >=size) {
			return null;
		}
	
	Node curr = head;
	for(int i = 0; i<idx; i++) {
		curr = curr.link;
	}
	return curr;
	}
	
	
	
	//노드 삽입(첫번째 위치, 마지막 위치, 중간 위치)
	
	public void addFirst(String data) {
		//1. Node 생성
		Node node = new Node(data);
		//2. Node의 링크는 head를 저장한다.
		node.link = head;
		//3. head를 새로 만든 node로 바꾼다!
		head = node;
		size++;
	}
	
	public void addLast(String data) {
		if(size == 0) {
			addFirst(data);
			return;
		}
		//1. Node 생성
		Node node = new Node(data);
		//2. 마지막 노드를 찾아 가지고 있어야 한다.
		Node curr = head; //curr는 첫번쨰 노드가 됨
		
		while(curr.link != null) {
			curr = curr.link;
		}
		//curr: 마지막 노드에 위치하고 있음
		curr.link = node;
		size++;
	}
	
	//중간 위치 삽입
	public void add(int idx, String data) {
		if(idx == 0) {
			addFirst(data);
		} else if(idx == size) {
			addLast(data);
		} else if(idx < 0 || idx > size) {
			//커스텀, 알아서 하기
		} else {
			//idx 위치에 넣고 싶다.
			//idx-1위치에 있는 노드가 필요하다.
			//Node pre
			Node pre = get(idx-1);
			
			//새로운 노드 생성
			Node node = new Node(data);
			
			node.link = pre.link; //현재 생성한 노드의 링크는 이전 노드의 링크로 연결
			pre.link = node; // 이전 노드의 링크는 나의 링크로 연결
			
			size++;
		}
	}
	
	//출력
	public void printList() {
		Node curr = head;
		
		if(head == null) {
			System.out.println("공백 리스트...");
			return;
		}
		while(curr != null) {
			System.out.println(curr.data+ " -> ");
			curr = curr.link;
		}
		System.out.println();
	}
	
	//삭제 (첫번쨰 위치, 마지막 위치, 중간 위치)
	public String removeFirst() {
		if(head == null)
			return null;
		
		String data = head.data;
		head = head.link;
		size--;
		return data;
		}
	
	public String remove(int idx) {
		if(idx == 0) {
			return removeFirst();
		}
		//범위를 벗어나면
		if(idx<0 || idx>=size)
			return null;
		
		Node pre = get(idx-1);
	//	Node rm = get(idx);
		Node rm = pre.link;
		
		//지우고 싶은 데이터
		String data = rm.data;
		
		pre.link = rm.link;
		size--;
		return data;
	}
	
	//마지막 위치 삭제 -> 중간위치 삭제에 마지막 인덱스를 넣으면 됨.
}
