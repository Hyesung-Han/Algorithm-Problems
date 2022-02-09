package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_ladder1 {

	static int T;//testcase 10개
	static int[][] map; // 사다리 맵
	static boolean[][] visited; // 방문여부
	static int[] dx = {0,0,-1}; //x방향
	static int[] dy = {-1,1,0}; //y방향
	static int ans = -1;
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int t = 1; t <= 10; t++) {
			T =Integer.parseInt(br.readLine());
			map = new int[100][100];
			visited = new boolean[100][100];

			for (int i = 0; i < 100; i++) {
				String str = br.readLine();
				String[] ss = str.split(" ");
				for (int j = 0; j < 100; j++) {
					map[i][j] = Integer.parseInt(ss[j]);
				}
			}
			
			int ex = -1;
			int ey = -1;
			
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map.length; j++) {
					if(map[i][j] == 2) {//end
						ex = i;
						ey = j;
					}
					if(i ==0 && map[i][j]==1 ) {//start
						map[i][j] = 3;
					}
				}
			}
		
			go(ex, ey);
			
			System.out.println("#" + t + " "+ ans);
			
		}

	}

	public static void go(int x, int y) {
		if(map[x][y] == 3) {
			ans = y;
			return;
		}
		visited[x][y] = true;
		
		for (int d = 0; d < dx.length; d++) {
			int nx = x + dx[d];
			int ny = y + dy[d];
			
			if(nx<0 || ny<0 || nx >= 100 || ny >= 100||visited[nx][ny]||map[nx][ny] ==0) 
				continue;
			
			go(nx,ny);
			break;	
		}
	}
}
