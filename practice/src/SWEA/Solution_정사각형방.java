package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_정사각형방 {

	static int T;
	static int N;
	static int[][] map;
	static boolean[][] visited;
	static int[][] result;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static int max;
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			N = Integer.parseInt(br.readLine());
			map = new int[N][N];
			result = new int[N][N];
			visited = new boolean[N][N];			
			
			
			for (int i = 0; i < N; i++) {
				StringTokenizer token = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(token.nextToken());
				}
			}
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map.length; j++) {
					go(i,j);
				}
			}

			System.out.println("#" + t + " "+min + " " + (max+1));
		
		}
		
		
	}

	public static void go(int x, int y) {
		
		visited[x][y] = true;
		int count = 0;
		for (int d = 0; d < 4; d++) {
			int nx = x + dx[d];
			int ny = y + dy[d];
			
			if(!check(nx,ny)) continue;
			if(visited[nx][ny]) continue;
			
			if(map[nx][ny] == (map[x][y]+1)) {
				count ++;
				go(nx, ny);
				
			}
		}
		visited[x][y] = false;
		if(max < count) {
			max = count;
			min = map[x][y];
		}
		else if(max == count) {
			min = Math.min(min, map[x][y]);
		}
	}

	public static boolean check(int x, int y) {
		return x>=0 && y >= 0 && x < N && y < N;
	}

}
