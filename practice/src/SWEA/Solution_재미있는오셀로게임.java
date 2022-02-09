package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution_재미있는오셀로게임 {

	static int T; // testcase
	static int N; // 보드 한 변의 길이
	static int M; // 플레이어가 돌을 놓는 횟수
	static int[][] map;
	static int[] dx = {-1,-1,-1,0,0,1,1,1};
	static int[] dy = {-1,0,1,-1,1,-1,0,1};
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			StringTokenizer token = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(token.nextToken());
			M = Integer.parseInt(token.nextToken());
			map = new int[N][N];

			map[N / 2 - 1][N / 2 - 1] = 2;
			map[N / 2][N / 2] = 2;
			map[N / 2][N / 2 - 1] = 1;
			map[N / 2 - 1][N / 2] = 1;
			// map 초기 설정 완료 1 = 블랙, 2 = 화이트

			for (int i = 0; i < M; i++) {
				token = new StringTokenizer(br.readLine(), " ");
				int x = Integer.parseInt(token.nextToken());
				int y = Integer.parseInt(token.nextToken());
				int color = Integer.parseInt(token.nextToken());
				
				if(color == 1) {//black
					map[x][y] = 1;
					for (int d = 0; d < 8; d++) {
						int nx = x + dx[d];
						int ny = y + dy[d];
						if(!check(nx,ny)) continue;
						
					}
				}
			}

		}

	}

	public static boolean check(int x, int y) {
		return x >= 0 && x < N && y >= 0 && y <N;
	}

}
