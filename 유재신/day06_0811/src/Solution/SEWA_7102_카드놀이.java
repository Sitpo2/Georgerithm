package Solution;

import java.util.Arrays;
import java.util.Scanner;

public class SEWA_7102_카드놀이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Tc = sc.nextInt();
		
		for (int t = 1; t<=Tc; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int [] arr1 = new int [N];
			int [] arr2 = new int [M];
			
			//N = 6 배열생성
			for(int i = 0; i<N; i++) {
					arr1[i] = i+1;
				}
			//M = 6 배열생성
			for(int i = 0; i<M; i++) {
					arr2[i] = i+1;
				}
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0; i<N; i++) {
				for(int j = 0; j<M; j++) {
					sb.append(arr1[i]+ arr2[j]).append(" ");
				}
			}
			
			
			//sb를 배열로 변환
			String[] nums = sb.toString().trim().split("\\s+");
			
			int [] arr3 = new int[N*M];
			for(int i = 0; i<N*M; i++) {
				arr3[i] = Integer.parseInt(nums[i]);
			}
			Arrays.sort(arr3);
			
			int a = 0;
			int sum = 0;
			int cnt = 1;
			for(int i =0; i<N*M-1; i++) {
				if(arr3[i] == arr3[i+1]) {
					cnt++;
					a = arr3[i];
				} else {
					if(sum < cnt) {
						sum = cnt;
						a = arr3[i];
					}
					cnt = 1;				
				}
			}
			System.out.println(a);

			}
			
			
			}

	}