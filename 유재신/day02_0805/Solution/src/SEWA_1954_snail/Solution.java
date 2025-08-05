package SEWA_1954_snail;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	
	//변화값 주기
	static int [] dr = {0, 1, 0, -1}; //right, down, left, up
	static int [] dc = {1, 0, -1, 0}; //right, down, left, up
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/SEWA_1954_snail/snail.txt");
		Scanner sc = new Scanner(file);
		
		int T = sc.nextInt();
		
		//현재 위치, 미래 위치 기록
		int nowR = 0; //초기값 설정(0,0)
		int nowC = 0;
		int dir = 0; //방향 설정
		
		//배열 생성
		int [][] arr = new int[T][T];
		int N = arr.length;
		
		//각 칸마다 1씩 증가하도록 설정(1부터)
		for(int n = 1; n<T*T; n++) {
			arr[nowR][nowC] = n;
			
			int nextR = nowR + dr[dir];
			int nextC = nowC + dc[dir];
		}
			nowR = nextR;
			
		
			}

		}
		
	}

	}
