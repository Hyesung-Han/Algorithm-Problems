package SWEA;

import java.util.Scanner;

public class Solution_달팽이숫자 {

	static int T;// test case
	static int N;
	static int[][] map;
	static int[] dx = {0,1, 0,-1}; //우 하 좌 상
	static int[] dy = {1, 0,-1,0}; //우 하 좌 상
	
	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		T = scann.nextInt();
		
		for (int t = 1; t <=T; t++) {
			N = scann.nextInt();
			map = new int[N][N];
			int x = 0;
			int y = 0;
			int d = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[x][y] = i*N +j+1;//2차원->1차원으로 바꾸기
	                    if((x + dx[d]) < 0 || (x + dx[d]) >= N
	                            || (y + dy[d]) < 0 || (y + dy[d]) >= N || map[x+dx[d]][y+dy[d]] !=0) {
	                         
	                        d = (d+1) %4; //방향 바꾸기
	                    }
	                    x = x+ dx[d];
	                    y = y+ dy[d];
				}
			}
			System.out.println("#" + t);
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map.length; j++) {
					System.out.print(map[i][j] + " ");
				}System.out.println();
			}
			
		} 
		
	}
}