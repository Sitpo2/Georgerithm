package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue02_API {

	public static void main(String[] args) {
		//Queue는 인터페이스!
	//안됨! Queue <String> q = new Queue<>();
		//띠ㅏ라서 구현체로 자주 사용하는거 2가지
		//1. LinkedList
		//2. ArrayDeque
		
		Queue <String> q = new LinkedList<>();
		
		q.add("김태희");
		q.offer("유재신");
		
		//삭제
		q.remove();
		q.poll();
		
		//조회
		q.element();
		
		//add, remove, element: 예외를 발생시키는 조합
		//offer, poll, peek : 값을 반환하는 조합
		//하지만 편한거 쓰자!
	}

}
