	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Arrays;
	import java.util.Scanner;
	
	public class baseball2 {
	
		public static void main(String[] args) throws FileNotFoundException {
			File file = new File("./src/input.txt");
			Scanner sc = new Scanner(file);
			
			//테스트 케이스 3
			int tc = sc.nextInt();
			
			for(int t = 1; t<=tc; t++) {
				int N = sc.nextInt(); //사람 수 4
				int K = sc.nextInt(); //실력 차 2
				
				int [] arr = new int[N]; //배열 만들기
				
				for(int i = 0; i<N; i++) {
					arr[i] = sc.nextInt(); //배열 안에 숫자 집어넣기
				}	
					Arrays.sort(arr); //오름차순으로 정렬하기 2 3 4 6
				
					int max = 0; //최대값 확인하기 위해
					int left = 0; //왼쪽에서 올라올 거임
					
						
					for(int right = 0; right<N; right++) {
						
						while(arr[right] - arr[left] > K) {
							left++;
						}
						max = Math.max(max, right - left + 1);
					}
					System.out.println("#" + t + " "  + max);
				}
			
		
			
			
			
		}
	}