package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_파리퇴치 {

	static int T;
	static int N;//map
	static int[][] map;//map
	static int M;//파리
	static int max;
	static int sum;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			String str = br.readLine();
			String[] ss = str.split(" ");
			N = Integer.parseInt(ss[0]);
			M = Integer.parseInt(ss[1]);
			map = new int[N][N];
			
			for (int i = 0; i < N; i++) {
				str = br.readLine();
				ss = str.split(" ");
				for (int j = 0; j < ss.length; j++) {
					map[i][j] = Integer.parseInt(ss[j]);
				}
			}
			
			max = Integer.MIN_VALUE;
			for (int i = 0; i < N-M+1; i++) {
				for (int j = 0; j < N-M+1; j++) {
					sum = 0;
					for (int i2 = i; i2 < i+M; i2++) {
						for (int j2 = j; j2 < j+M; j2++) {
							sum += map[i2][j2];
						}
					}
					max = Math.max(max, sum);
				}
			}
			System.out.println("#" + t + " " + max);			
		}
	}
}











