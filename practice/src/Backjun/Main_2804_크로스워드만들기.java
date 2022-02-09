package Backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2804_크로스워드만들기 {

	static int N;
	static int M;
	static char[][] map;
	static int start, ss;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer token = new StringTokenizer(br.readLine());
		char[] str1 = token.nextToken().toCharArray();// BANANA
		char[] str2 = token.nextToken().toCharArray();// PIDZAMA
		map = new char[str2.length][str1.length];
		for (int i = 0; i < str2.length; i++) {
			Arrays.fill(map[i], '.');			
		}

		start = Integer.MAX_VALUE;
		for (int i = 0; i < str2.length; i++) {
			for (int j = 0; j < str1.length; j++) {
				if (str2[i] == str1[j]) {
					start = Math.min(start, j);
				}
			}
		}
		for (int i = 0; i < str2.length; i++) {
			map[i][start] = str2[i];
		}
		ss = Integer.MAX_VALUE;
		for (int i = 0; i < str2.length; i++) {
			for (int j = 0; j < str1.length; j++) {
				if (map[i][start] == str1[j]) {
					ss = Math.min(ss, i);
				}
			}
		}
		for (int i = 0; i < str1.length; i++) {
			map[ss][i] = str1[i];
		}
		for (int i = 0; i < str2.length; i++) {
			for (int j = 0; j < str1.length; j++) {
				System.out.print(map[i][j]);
			}System.out.println();
		}
		
		
	}

}
