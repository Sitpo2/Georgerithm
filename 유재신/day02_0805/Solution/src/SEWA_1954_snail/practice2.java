package SEWA_1954_snail;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    static int[] dr = {0, 1, 0, -1}; // right, down, left, up
    static int[] dc = {1, 0, -1, 0};

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./src/SEWA_1954_snail/snail.txt");
        Scanner sc = new Scanner(file);

        int T = sc.nextInt();

        int[][] arr = new int[T][T];

        int nowR = 0, nowC = 0;  // 현재 위치
        int dir = 0;             // 방향 인덱스
        for (int num = 1; num <= T * T; num++) {
            arr[nowR][nowC] = num;

            int nextR = nowR + dr[dir];
            int nextC = nowC + dc[dir];

            // 범위 벗어나거나 이미 채워진 칸이면 방향 전환
            if (nextR < 0 || nextR >= T || nextC < 0 || nextC >= T || arr[nextR][nextC] != 0) {
                dir = (dir + 1) % 4;
                nextR = nowR + dr[dir];
                nextC = nowC + dc[dir];
            }

            nowR = nextR;
            nowC = nextC;
        }

        // 출력
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < T; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}