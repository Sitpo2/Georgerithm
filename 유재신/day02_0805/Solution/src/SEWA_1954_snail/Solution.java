package SEWA_1954_snail;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/SEWA_1954_snail/snail.txt");
		Scanner sc = new Scanner(file);
		
		//Test case 출력
		int T;
		T = sc.nextInt();
		
		//2차 배열 정의 - T
		int [][] arr = new int [T][T];	
		int N = arr.length;
		
		
		//델타 탐색 위한 것(오른쪽0, 아래1, 왼쪽2, 위3)
		int [] dr = {0, 1, 0, -1}; //행변화 
		int [] dc = {1, 0, -1, 0}; //열변화
		
		//방향 인덱스 값 및 현재 값 설정(0,0)
		int dir = 0;
		int r = 0; 
		int c = 0;
		
		
		
			
		}
		
	}


