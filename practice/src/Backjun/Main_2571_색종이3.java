package Backjun;

import java.util.Scanner;

public class Main_2571_색종이3 {
	static int T;
	static int[][] map;
	static int X, Y;
	static int count;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);

		T = scann.nextInt();
		map = new int[100][100];

		for (int t = 0; t < T; t++) {
			X = scann.nextInt();
			Y = scann.nextInt();

			for (int i = X; i < X + 10; i++) {
				for (int j = Y; j < Y + 10; j++) {
					map[i][j] = 1;
				}
			}
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map.length; j++) {
					go(i,j);
				}
			}
		}

	}

	public static void go(int x, int y) {
		if(map[x][y] == 1) {//오른쪽으로 가면서 가로 길이 구하기
			int nx = x+dx[3];
			int ny = y+dy[3];
			int width = 0;
			int height = 0;
			while(map[nx][ny]==0) {
				width++;
			}
		}
	}

}
