import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2_3 {

	public static void main(String[] args) {
	
		int [] arr = {1, 2, 3, 4, 5};
//		System.out.println(Arrays.toString(arr));
		
		String str = "1423";
//		str.charAt(0);
//		System.out.println(str.charAt(0));
//		
//		StringBuilder sb = new StringBuilder();
//		System.out.println(sb.append(str.charAt(1)));
		
		List<Character> list = new ArrayList<>();
		for(char c : str.toCharArray()) {
			list.add(c);
		}
		
		
		System.out.println(list);
}
}
