package LinkedList;

public class Node {
	
	//데이터 필드는 문자열로 고정! 제네릭하게 만들수도 있다더라
	String data;
	//링크필드
	Node link; 
	
	
	//기본 생성자
	public Node () {
		
	}
	
	public Node(String data) {
		this.data = data;
//		this.link = null; //참고자료형은 null값으로 초기화 된다!
	}
	
	
	
	
}
