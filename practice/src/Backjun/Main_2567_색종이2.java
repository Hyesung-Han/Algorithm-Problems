package Backjun;

import java.util.Scanner;

public class Main_2567_색종이2 {
	
	
	static int T;
	static int[][] map;
	static int X,Y;
	static int count;
	static int[] dx = {-1, 1, 0 ,0};
	static int[] dy = {0, 0, -1 ,1};

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		
		T = scann.nextInt();
		map = new int[100][100];
		
		for (int t = 0; t < T; t++) {
			X = scann.nextInt();
			Y = scann.nextInt();
			
			go(X,Y);
		}
		count = 0;
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				result(i,j);
			}
		}
		System.out.println(count);
		
	}

	public static void result(int x, int y) {
		for (int d = 0; d < 4; d++) {
			int nx = x + dx[d];
			int ny = y + dy[d];
			
			if(!check(nx,ny)) continue;
			if(map[nx][ny] == 0 && map[x][y] == 1) {
				count++;
			}
		}
		if(map[x][y] == 1) {
			if( x==0 || x== map.length-1) count++;
			if( y == 0 || y == map.length-1)  count++;	
		}
	}

	public static boolean check(int x, int y) {
		return x>=0 && y >=0 && x< map.length && y < map.length;
	}

	public static void go(int x, int y) {

		for (int i = x; i < x+10; i++) {
			for (int j = y; j < y+10; j++) {
				map[i][j] = 1;
			}
		}
	}

}