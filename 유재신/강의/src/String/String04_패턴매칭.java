package String;

public class String04_패턴매칭 {

	public static void main(String[] args) {
		String text = "This iss a book";
		String patter = "iss";

	}
	
	//찾는 순간 해당 위치의 인덱스를 반환하기 위해 int 사용 (없으면 -1을 반환)
	public static int matchingFor(String t, String p) {
		
		//길이를 뽑아내기
		int N = t.length();
		int M = p.length();
		
		//전체길이에서 찾는것의 길이를 빼서 (i=0; i<N-M+1; i++)
		for(int i =0; i<N-M+1; i++) {
			boolean isOk = true;
			for(int j =0; j<M; j++) {
				if(t.charAt(i+j) != p.charAt(j)) {
					isOk = false;
					break; //i를 시작점으로 하면 안돼!
			} //패턴검사
		}
		if(isOk) {
			return i;
		}
		
	}
		return -1;
}
}