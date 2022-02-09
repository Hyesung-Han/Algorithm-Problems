package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_농작물수확 {

	static int T;
	static int N;
	static int [][] map;

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			N = Integer.parseInt(br.readLine());
			map = new int[N][N];
			
			for (int i = 0; i < N; i++) {
				String[] str = br.readLine().split("");
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(str[j]);
				}
			}//map구성 완료
			int sum = 0;
			for (int i = 0; i < N; i++) {
				for (int j = Math.abs(i-N/2); j <= N-1-Math.abs(i-N/2); j++) {
					sum+= map[i][j];
				}
			}
			System.out.println("#" + t+ " " + sum);
		}
	}

}
