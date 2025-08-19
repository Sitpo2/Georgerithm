package Array;

public class 순차검색 {

	public static void main(String[] args) {
		int[] arr = new int[] {93, 13, 45, 3, 2, 7, 4, 5, 8, 14, 22};
		int N = arr.length;
		System.out.println(searchWhileNosort(arr, 2));

	}
	
	//반환타입: 찾으면 해당 위치 반환/ 없으면 -1 반환
	public static int searchWhileNosort(int[] arr, int key) {
		
		int i = 0;
		while(i<arr.length) {
			//찾았으면 true 할거야!
			if(arr[i]==key) {
				return i;
			}
			
			i++;
		}
		return -1;
	}
	
	public static int searchForSort(int[] arr, int key) {
		for(int i = 0; i<arr.length; i++) {
			
		//이렇게 마무리를 지으면... 정렬 안되어 있는 것보다 차이가 없다.
			if(arr[i] == key) { 
				return i;
		} 
		else if(arr[i] > key) return -1;
	}
		return -1;
	}

}
