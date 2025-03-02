import java.io.*;
import java.util.*;


public class Main  {

	static int N;
	static char map[][];
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		map = new char [N][N];
		
		go(N, 0, 0, false);
		// 크기, 시작 r, c, 빈칸여부
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				sb.append(map[i][j]);
			}
			sb.append('\n');
		}
		
		System.out.println(sb);
		
		
	}

	private static void go(int size, int r, int c, boolean check) {

		if(check) {
			for(int i = r; i < r+size; i++) {
				for(int j = c; j < c+size; j++)
					map[i][j] = ' ';
			}
			return;
		}
		

		if(size == 1) {
			map[r][c] = '*';
			return;
		}
		int ss = size/3;
		
		int count = 1;
		for(int i = r; i < r+size; i+= ss) {
			for(int j = c; j < c+size; j+= ss) {
				if(count == 5) 
					go(ss, i, j, true);
				else
					go(ss, i, j, false);
				count++;
			}
		}
		
		
	}

}
