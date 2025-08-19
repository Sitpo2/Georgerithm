package String;

public class String03_정수변호나 {

	public static void main(String[] args) {
		String strNum = "123456";
		
		//문자열->정수
		int num = Integer.parseInt(strNum);
		System.out.println(num);
		
		System.out.println(atoi(strNum));
		
		System.out.println((int)'0');
	}
	
	//str은 앚주 깔끔한 형태의 숫자만 들어온다. ex) "12345"
	public static int atoi(String str) {
		int N = str.length();
		int num = 0; //반환
		
		//인덱스 아님
		for(int i = 0; i<N; i++) {
			char c = str.charAt(i); // '1', '2, '3', ...
			
			
			num = (num*10) + (c-48);
		}
		
		
		return num;

	}
}