package Array;

public class ArrayTest1 {

	public static void main(String[] args) {
		
		//1부터 N까지 합 구하는 식 1
		long sum = 0;
		for(int i = 1; i<100000001; i++) {
			sum += i;

		}
		System.out.println(sum);
		
		//1부터 N까지 합 구하는 식 2
		
		int N = 100000000;
		long result = (long) N*(N+1) / 2;
				System.out.println(result);
			
		int [] arr = {0, 1, 2, 3, 4, 5, 6}; //길이는 7
		int n = arr.length;
		System.out.println("정방향순회");
		for(int i =0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println("역방향순회");
		
		//2-1. 반복문의 조건을 건드리는 방법
		for(int i=n-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//2-2. 인덱스를 건드리는 방법
		for(int i =0; i<n; i++) {
			System.out.print(arr[n-1-i] + " ");
		}
		
		
		//특정인덱스를 기준으로 양쪽으로 퍼지게 순회
		// 이거는 직접 생각해서 작성해보자!!(마음의 숙제))
		
		//0 1 2 [3] 4 5 6
		//0 1 [2] 3 4 5 6
		
		}
		
	}


