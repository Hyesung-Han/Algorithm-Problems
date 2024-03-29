import java.io.*;
import java.util.*;

public class Main{

	static int T;
	static int M, N, K;
	static int[][] map;
	static int[][] group;
	static int result;
	static int[] dr = {-1, 0, 1, 0};//북 동 남 서
	static int[] dc = { 0, 1, 0,-1};
	
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			
			StringTokenizer token = new StringTokenizer(br.readLine(), " ");
			M = Integer.parseInt(token.nextToken());
			N = Integer.parseInt(token.nextToken());
			K = Integer.parseInt(token.nextToken());
			
			map = new int[M][N];
			group = new int[M][N];
			
			for (int i = 0; i < K; i++) {
				token = new StringTokenizer(br.readLine(), " ");
				map[Integer.parseInt(token.nextToken())][Integer.parseInt(token.nextToken())] = 1;
			}//map이 돌아가긴 했지만 상관 없을 듯
			result = 1;
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					if(map[i][j] == 1 && group[i][j] == 0) {
						dfs(i,j,result++); 
					}
				}
			}
			
			System.out.println(result-1);
			
		}
			
	}

	private static void dfs(int r, int c, int count) {
		group[r][c] = count;
		for (int d = 0; d < 4; d++) {
			int nr = r+dr[d];
			int nc = c+dc[d];
			
			if(!check(nr,nc)) continue;//map을 벗어나면 나가기
			if(group[nr][nc] != 0) continue;//방문했던 곳이면 나가기
			if(map[nr][nc] == 1) {
				dfs(nr,nc,count);
			}	
		}
	}

	private static boolean check(int r, int c) {
		return r >= 0 && r < M && c >=0 && c < N;
	}

}
