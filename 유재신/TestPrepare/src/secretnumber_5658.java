import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class secretnumber_5658 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt(); //100 받기
		
		
		List<Integer> list   = new ArrayList<>(); 
		
		for(int i = 1; i<n; i++) {
			
			list.add(n); //첫번째 값 받기
			list.add(i); //두번째 수 넣기
			
			while(true) {
				
				for(int j = 1; ; j++) {
					
					if(list.get(i)<0) {
						list.remove(i);
						break;
					}
				}
				
			}
			
		
		
		
	
		
		
		
		}
		

	}
}


