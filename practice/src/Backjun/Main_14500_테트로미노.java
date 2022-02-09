package Backjun;

import java.io.*;
import java.util.*;

public class Main_14500_테트로미노 {
	
	static int N, M; //사각형의 크기
	static int [][] map; //크기는 N x M
	static int [] dr = {0,1,0,-1}; //우 하 좌 상
	static int [] dc = {1,0,-1,0};
	static int result = Integer.MIN_VALUE; //결과값
	
	
	public static void main(String[] args) throws Exception{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token;
		
		token = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(token.nextToken());
		M = Integer.parseInt(token.nextToken());
		
		map = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			token = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(token.nextToken());
			}
		}//맵 넣기 완료
		
		// 사방탐색 (맵을 벗어나지 않고, 방문하지 않은 곳)-> 움직이고 카운트 올리기 => 4가 되면 바로 sum 계산 끝
		// ㅓ, ㅓ, ㅜ, ㅏ   는 한번에 갈 수 없어서 따로 해줘야함
		
		Boolean visited[][] = new Boolean[N][M]; //false로 초기화, 방문하면 true될 예정
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				visited[i][j] = false;
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				visited[i][j] = true; //방문한 경우
				dfs(i, j, 1, map[i][j], visited);				
				visited[i][j] = false; //다시 방문 안한척
				go(i,j);
			}
		}
		
		System.out.println(result);
	}


	private static void go(int r, int c) {
		//ㅜ
		if(r+1 < N && c+2 <M)
			result = Math.max(result, map[r][c]+map[r][c+1]+map[r][c+2]+map[r+1][c+1]);

		//ㅏ
		if(r+2 < N && c+1 <M)
			result = Math.max(result, map[r][c]+map[r+1][c]+map[r+2][c]+map[r+1][c+1]);
		
		//ㅓ
		if(r-1 >= 0 && r+1 < N && c+1 <M)
			result = Math.max(result, map[r][c]+map[r-1][c+1]+map[r][c+1]+map[r+1][c+1]);
		
		//ㅗ		
		if(r+1 < N && c+1 <M && c-1 >= 0)
			result = Math.max(result, map[r][c]+map[r+1][c-1]+map[r+1][c]+map[r+1][c+1]);
		
	}


	public static void dfs(int r, int c, int count, int sum, Boolean[][] visited) {
		if(count ==  4) {
			result = Math.max(result, sum);
			return;
		}
		for (int d = 0; d < 4; d++) {
			int nr = r + dr[d];
			int nc = c + dc[d];
			
			if(!check(nr, nc)) continue; //범위 넘어가면 그냥 나가
			if(visited[nr][nc]) continue;//방문 했으면 나가
			
			//맵 안에 있고 방문도 안했으면 움직이고 카운트 올리고 값 더하고 dfs 다시 돌려
			visited[nr][nc] = true;
			dfs(nr,nc, count+1, sum+map[nr][nc], visited);
			visited[nr][nc] = false;
		}
		
		
	}


	private static boolean check(int r, int c) {
		return r >= 0 && r < N && c >= 0 && c < M ;
	}


	
}
