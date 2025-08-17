import java.util.Arrays;
import java.util.Scanner;

public class SEWA_5356_세로 {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int tc = sc.nextInt(); //2
		
		for(int t = 1; t<=tc; t++) {
			
		char [][] arr = new char [5][15];
		
		for(int i =0; i<5; i++) {
			String str = sc.next(); //1줄씩 받기
			for(int j = 0; j<str.length(); j++) {
				arr[i][j] = str.charAt(j);
			}			
		}
		
		
		System.out.print("#" + t + " ");
		
		for(int j = 0; j<arr[0].length; j++) {
			for(int i = 0; i<arr.length; i++) {
			if(arr[i][j] != '\u0000') { 
					System.out.print(arr[i][j]);
				}
		
				}
			}
		System.out.println("");
		}
		
		
			
		}
	
		}
		
		
		
		
		
 
		




