import java.util.Arrays;

public class Test2_2 {

	public static void main(String[] args) {
	
		int [] arr = {10, 1, 3, 5, 4, 6, 8, 9, 2, 7};
		
		int cnt = 1;
		int max = 1;
		
		for(int i =0; i<arr.length-1; i++) {
			if(arr[i+1] - arr[i] > 0) {
				cnt++;
			} else {
				cnt = 1;
			}
			if(cnt>max) {
				max = cnt;
			}		
	}
		System.out.println(max);
}
}
