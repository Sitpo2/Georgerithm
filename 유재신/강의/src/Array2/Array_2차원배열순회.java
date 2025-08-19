package Array2;

public class Array_2차원배열순회 {

	public static void main(String[] args) {
		// 문제 행, 열 크기가 주여지고 다음 줄부터 입력이 주어진다.
		//2, 4
		//1 2 3 4
		//5 6 7 8

		int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,1,2,3}};
		
		//행 우선 순회 방식
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) { //arr[i] 중요	
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		//역방향
		//1. for문 조건 건드리는 방식
		//2. index를 건드리는 방식
		
		
		//열 우선 순회 방식 -> NxM일 때... arr[0]으로 고정 가능
		for(int j =0; j<arr[0].length; j++) {
			for(int i =0; i<arr.length; i++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		//역방향 가능
		
		
		
		
	}


}
