package Backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main_2667_단지번호붙이기 {

	static int N;
	static int[][] map;
	static int[][] visited;
	static int cnt;
	static StringBuilder sb = new StringBuilder();;
	static int num;// 단지 번호 매길 것임, 단지 갯수 출력 시 사용할 예정
	static int[] dx = { 0, 0, -1, 1 };
	static int[] dy = { -1, 1, 0, 0 };

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		visited = new int[N][N];
		List<Integer> result = new ArrayList<>();
		cnt = 0;
		num = 0;
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		} // map구성 완료
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == 1) {
					result.add(go(i, j));
				}
			}
		}
		Collections.sort(result);
		sb.append(result.size() + "\n");
		for (int i = 0; i < result.size(); i++) {
			sb.append(i + "\n");
		}
		System.out.println(sb);
	}

	public static int go(int x, int y) {
		visited[x][y] = 1;
		for (int d = 0; d < 4; d++) {// 상하좌우 탐색
			int nx = x + dx[d];
			int ny = y + dy[d];

			if (check(nx, ny)) {

				if (map[nx][ny] == 1 && visited[nx][ny] == 0) {
					cnt++;
					go(nx, ny);
				}
			}
			num++;
		}
		return cnt;
	}

	public static boolean check(int x, int y) {

		return x >= 0 && x < N && y >= 0 && y < N;
	}

}
