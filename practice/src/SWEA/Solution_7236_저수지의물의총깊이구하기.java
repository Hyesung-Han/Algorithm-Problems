package SWEA;

/*
 * 	[N+1][N+1] 크기의 맵을 만들고 테두리를 다 G로 만든다
 * 	개수세는건 0~N까지만 하기 팔방탐색
 * 	모두 G이면 1
 * 	최대값은 8임
 * */
import java.io.*;
import java.util.*;

public class Solution_7236_저수지의물의총깊이구하기 {

	static int T;//test case
	static int N;
	static char [][] map;
	static int result;
	static int MM; //MAX값
	static int [] dx = {-1,-1,-1,0,1,1, 1, 0};
	static int [] dy = {-1, 0, 1,1,1,0,-1,-1};
	
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			N = Integer.parseInt(br.readLine());
			map = new char[N+2][N+2];//죄다 G로 채우기
			for (int i = 0; i < N+2; i++) {
				for (int j = 0; j < N+2; j++) {
					map[i][j] = 'G';//나중에 들어오는 값 다시 넣어줄것임 0~N까지 
				}
			}//일단 맵 채우기 G
			
			for (int i = 1; i < N+1; i++) {
				StringTokenizer token = new StringTokenizer(br.readLine()," ");
				for (int j = 1; j < N+1; j++) {
					map[i][j] = token.nextToken().charAt(0);
				}
			}
			
			MM=0;
			for (int i = 1; i < N+1; i++) {
				for (int j = 1; j < N+1; j++) {
					int cnt = 0;
					for (int d = 0; d < 8; d++) {
						//W이면 개수 카운트하고 만약 카운트가 0이면 1로 하고 맥스랑 비교하기
						if(map[i+dx[d]][j+dy[d]] == 'W') {
							cnt++;
						}
					}
					if(cnt == 0) {
						cnt = 1;
					}
					MM = Math.max(MM, cnt);
				}
			}
			System.out.println("#" + t+ " " + MM);
			
		}
		
		
	}

	
	
	
}
