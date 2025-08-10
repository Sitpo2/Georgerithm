import java.util.Scanner;

public class Problem3_숫자의개수 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		//현재 숫자상태
		int result = A*B*C;
		
		//문자열로 바꿔야지 각자리별 숫자 카운트 가능 
		String result2 = String.valueOf(result);
		
		//각각의 자릿수 카운트
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;
		int count8 = 0;
		int count9 = 0;
		
		
		for(int i = 0; i<result2.length(); i++) {
			
			//num이라는 거에 각 자리별 숫자 입력
			char num = result2.charAt(i);
			
			//하 자꾸 실수하는데, String으로 바꾸면 문자로 인식되어서 꼭 '숫자'해야 비교됨.
			if (num == '0') {
				count0 ++;
			} else if(num == '1') {
					count1 ++;
				} else if(num =='2') {
					count2 ++;
				} else if (num=='3'){
					count3 ++;
				} else if (num == '4') {
					count4 ++;
				} else if (num =='5') {
					count5 ++;
				} else if (num =='6') {
					count6 ++;
				} else if (num == '7') {
					count7 ++;
				} else if (num =='8') {
					count8 ++;
				} else {
					count9 ++;
			}
			
		}	
		System.out.println(count0);
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(count3);
		System.out.println(count4);
		System.out.println(count5);
		System.out.println(count6);
		System.out.println(count7);
		System.out.println(count8);
		System.out.println(count9);
	}

}
