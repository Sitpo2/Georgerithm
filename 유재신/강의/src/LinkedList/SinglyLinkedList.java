package LinkedList;

public class SinglyLinkedList {
	
	Node head; //연결리스트 시작점 (더미  x)
	int size =0; // 사이즈 알고 있으면 쓸데가 있음.
	
	
	//아래철머 쓸거면 필요 없어도 될듯
//	public SinglyLinkedList() {
//		this.head = null;
//		this.size = 0;
//	}
	
	
	//조회
	public Node get(int idx) {
		if(idx < 0|| idx>=size ) {
			return null;
		}
		Node curr = head;
		for(int i = 0; i<idx; i++) {
			curr = curr.link;
		}
		return curr;
	}
	
	
	
	
	//노드 삽입(첫번째 위치, 마지막 위치, 중간 위치)
	//Node의 데이터가 String이라 data도 해당 문자열을 넘기게 만듬.
	//Node 자체를 파라미터로 넘겨도 될 것 같다.
	public void addFirst(String data) {
		//1. Node생성
		Node node = new Node(data); //아래 (b, null)기 node
		
		//원래 head / (a, null) 이었는데 그 사이에 (b, null)을 넣을거임
		//2. Node의 링크는 head를 저장한다.
		node.link = head;
		//3. head를 새로 만든 node로 바꾼다.
		head = node; //head가 b를 가리키게 한다. 원래는 a였음
		size++;
	}
	//가장 마지막 위치에 넣을거야
	public void addLast(String data) {
		if(size == 0) { //첫번째 위치에 넣는 것과 같은
			addFirst(data);
			return;
		}
		//1. Node 생성
		Node node = new Node(data);
		//2. 마지막 노드를 찾아 가지고 있어야 한다. (size만큼 이동하면 된다)
		Node curr = head; //curr (첫번째 노드)
		
		while(curr.link != null) { //null이면 멈춰.
			curr = curr.link;
		}
		//curr: 마지목 노드에 위치하게 되어있음.
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
			//커스텀의 묘미
			//음수면... 가장 앞에 넣어야지 라고 할수도 있다.
			// 사이즈를 벗어나는 수라면 그냥 마지막에 넣야야지라고 할수도
		} else {
			//idx 위치에 넣고 싶다.
			// idx-1 위치에 있는 노드가 필요하다.
		Node pre =  get(idx-1);
			
			//새로운 노드 생성
			Node node = new Node(data);
			
			//순서가 중요하다!
			node.link = pre.link;
			pre.link = node;
			
			size++;
			
		}
	}
	
	//출력 메서드
	public void printList() {
		Node curr = head;
		
		if(head == null) {
			System.out.println("공백리스트...");
			return;
		}
		while(curr != null) {
			System.out.println(curr.data + " ->");
			curr = curr.link;
		}
		System.out.println();
	}
	
	//삭제(첫번째 위치, 마지막 위치, 중간 위치)
	public String removeFirst() {
		//예외 상황 발생도 가능!
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
		//범위를 벗어나면..
		if(idx<0 || idx>=size)
			return null;
		
		Node pre = get(idx-1);
//		Node rm = get(idx);
		Node rm = pre.link;//O(1)
		
		//지우고 싶은 데이터
		String data = rm.data;
		
		pre.link = rm.link;
		size--;
		return data;
	}
	
	//마지막 위치 삭제 -> 저기 중간위치 삭제 마지막 인덱스를 넣으면 되는 부분
	
}
