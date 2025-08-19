package Stack1;

public class Stack02_Array구현 {
	//배열을 이용한 구현 -> 고민포인트(배열의 크기) -> 10만 ~ 100만 
	static String[] stack = new String[10]; //크기 결정을 고민해야 함
	static int top = -1; //-1은 인덱스 밖! 공백상태!
	
	public static void main(String[] args) {
		
		
	}
	
	//push
	static boolean push(String item) {
		//배열이므로... 가득 차 있는지 체크 필요!
		//if(top == stack.length-1) {
		if(isFull() ) {
			//가득차있으므로... 작업이 진행할 수 없음...
			//stack의 크기를 2배로 늘려 복사하던가..
			//못한다고 쳐내기!
			System.out.println("가득 참...");
			return false;
		}
		
		//top을 하나 증가시키고 -> item을 삽입
		top += 1;
		stack[top] = item;
		//위의 두줄을 한줄로 바꾼것!
		stack[++top] = item;
		
		//냅다 집어넣기...
		
		return true;
	}
	
	//pop
	static String pop() {
		//배열이 아니더라도... 이 연산은 해봐야 한다.
		if(isEmpty()) {
			System.out.println("뺄 거 없다..");
			return null;
		}
		//꺼내자
//		String result = stack[top];
//		top = -1;
//		return result;
		
		return stack[top--];
	}
	
	
	
	static boolean isEmpty() {
		
		return top == -1;
	}

	//isFull() 만들거임
//	static boolean isFull() {
//		if(top == stack.length-1)
//			return true;
//		//else 생략가능																																																																																																																																																																																																																																																											
//		return false;
//	}
	//궁극적으로 아래로 가게 됨.
	static boolean isFull() {
		return top == stack.length-1;
	}

}
