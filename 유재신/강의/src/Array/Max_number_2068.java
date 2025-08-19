package Array;

public class Max_number_2068 {

	public static void main(String[] args) {
		int [] arr1 = {3, 17, 1, 39, 8, 41, 2, 32, 99, 2};
		int N1 = arr1.length;
		
		//최대값 구할때(앞의수와 뒤의수 반복적으로 해서 가장 큰 수 나오게 하기)
		for(int i = N1-1; i>0; i--) {
			for(int j=0; j<N1; j++) {
				if(arr1[j]>arr1[j+1]) {
					return;
				}
			}
		}

	}

}
