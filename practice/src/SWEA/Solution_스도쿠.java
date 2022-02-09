package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_스도쿠 {

	static int T;
	static int[][] map;
	static int N = 9;
	static boolean result;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			map = new int[N][N];

			for (int i = 0; i < N; i++) {
				String str = br.readLine();
				StringTokenizer token = new StringTokenizer(str, " ");
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(token.nextToken());
				}
			} // map완성
			result = true;
			int ans = 0;
			case1();// 가로검사
			case2();// 세로검사
			case3();// 3*3 사각형 검사
			if(result == false) ans = 0;
			else ans = 1;
			System.out.println("#" + t + " " + ans);

		}
	}

	public static void case3() {// 에러 다시 손봐야함
		for (int r = 0; r < N; r = r + 3) { // 00 33 66 30 33 36 60 63 66
			int[] check = new int[N];
			for (int i = r; i < r + 3; i++) {
				for (int j = r; j < r + 3; j++) {
					check[(map[i][j]) - 1]++;
				}
			}
			for (int a = 0; a < N; a++) {
				if (check[a] == 0) {
					result = false;
					break;
				}
			}
		}
	}

	public static void case2() {
		for (int j = 0; j < N; j++) {
			int[] check = new int[N];
			for (int i = 0; i < N; i++) {
				check[(map[i][j]) - 1]++;
			}
			for (int a = 0; a < N; a++) {
				if (check[a] == 0) {
					result = false;
					break;
				}
			}
		}
	}

	public static void case1() {
		for (int i = 0; i < N; i++) {
			int[] check = new int[N];
			for (int j = 0; j < N; j++) {
				check[(map[i][j]) - 1]++;
			}
			for (int a = 0; a < N; a++) {
				if (check[a] == 0) {
					result = false;
					break;
				}
			}
		}

	}

}
