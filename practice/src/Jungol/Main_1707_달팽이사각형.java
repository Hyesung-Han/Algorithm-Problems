package Jungol;

import java.util.Scanner;

public class Main_1707_달팽이사각형 {

	static int N;
	static int[][] map;
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };
	static boolean[][] cc;
	static int d = 0;

	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);

		N = scann.nextInt();
		map = new int[N][N];
		cc = new boolean[N][N];
		int x = 0, y = 0, d=0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {

				map[x][y] = N * i + j + 1;
				
				int nx = x + dx[d];
				int ny = y + dy[d];

				if (!check(nx, ny) || map[nx][ny] != 0) {
					d = (d + 1) % 4;
				}
				x = x + dx[d];
				y = y + dy[d];

			}
		}


		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void go(int x, int y) {
			}

	public static boolean check(int x, int y) {
		return x >= 0 && y >= 0 && x < N && y < N;
	}

}
