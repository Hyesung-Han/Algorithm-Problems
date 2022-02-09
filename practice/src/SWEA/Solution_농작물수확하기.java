package SWEA;

import java.util.Scanner;

public class Solution_농작물수확하기 {

	static int T;
	static int N;
	static int[][] map;
	
	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		T = scann.nextInt();
		for (int t = 1; t <= T; t++) {
			N = scann.nextInt();
			map = new int [N][N];
			
			for (int i = 0; i < map.length; i++) {
				String str = scann.next();
				String[] ss =  str.split("");
				for (int j = 0; j < map.length; j++) {
					map[i][j] = Integer.parseInt(ss[j]);
				}
			}
			int sum = 0;
			for (int i = 0; i < N ; i++) { //위 삼각형
				for (int j = Math.abs(N/2 - i); j <= N-1-Math.abs(N/2-i); j++) {
					sum += map[i][j];
				}
			}
			
			
			System.out.println("#" + t + " " + sum );
		}

	}

}
