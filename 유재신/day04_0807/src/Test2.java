import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		
		//String 기존 3번문제
		// 2차배열 할 필요 없음.
		// toCharArrayList
		//출력할 때
		
		int [] arr = {1, 2, 3, 4, 5, 6};
		// System.out.println(arr); 
		//System.out.println(Arrays.toString(arr));
		Arrays.toString(arr);
		System.out.println(Arrays.toString(arr));
		
		String str = "abcde";
		str.charAt(0);
		//반환하는 타입이 무엇인지 제대로 파악
		
		
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		System.out.println(sb);
		
	}

}
