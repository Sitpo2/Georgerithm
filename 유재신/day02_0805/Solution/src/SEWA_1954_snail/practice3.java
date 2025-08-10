package SEWA_1954_snail;

import java.util.Scanner;

public class practice3 {
	
	static int [] dr = {0, 1, 0, -1}; //우, 하, 좌, 상
	static int [] dc = {1, 0, -1, 0}; //우, 하, 좌, 상
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for(int t = 1; t<=tc; t++) {
			int N = sc.nextInt();
			
			int nowr = 0;
			int nowc = 0;
			int d = 0;
			
			int [][] arr = new int [N][N];
			
			for(int n = 1; n<=N*N; n++) {
				arr[nowr][nowc] = n;	
				
				int nextr = nowr + dr[d];
				int nextc = nowc + dc[d];
				
				if(nextr<0 || nextc<0 || nextr>=N || nextc>=N || arr[nextr][nextc] !=0) {
					d = (d+1) % 4;
					nextr = nowr + dr[d];
					nextc = nowc + dc[d];
				}
				nowr = nextr;
				nowc = nextc;
				}
			
				for(int r = 0; r<N; r++) {
					if((r+1)%2==1) {
						for(int c = 0; c<arr[0].length; c++) {
							System.out.print(arr[r][c] + " ");
						}
					} else {
						for(int c = arr[0].length-1; c>=0; c--) {
							System.out.print(arr[r][c] + " ");
						}
						
					}
					System.out.println();
				}
			}
			
		}
	}