package Backjun;

import java.io.*;
import java.util.*;

public class Main_1992_쿼드트리 {

	static int N;
	static int[][] map;
	static StringBuilder sb;
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			String[] str = br.readLine().split("");
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(str[j]);
			}
		} // 맵 구성 완료
		go(0, 0, N);
		System.out.println(sb.toString());
	}

	public static void go(int r, int c, int width) {
		if (width == 1|| check(r, c, width)) {// 각 값이 다 다르면 그냥 그 값들 다 출력
			sb.append(map[r][c]);
		} else {
			sb.append("(");
			go(r, c, width/2);
			go(r, c + width/2, width/2);
			go(r + width/2, c, width/2);
			go(r + width/2, c + width/2, width/2);
			sb.append(")");
		}
	}

	public static boolean check(int r, int c, int w) {
		int temp = map[r][c];
		for (int i = r; i < r + w; i++) {
			for (int j = c; j < c + w; j++) {
				if (temp != map[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

}
