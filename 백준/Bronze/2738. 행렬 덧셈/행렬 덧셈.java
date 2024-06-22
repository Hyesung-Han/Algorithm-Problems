import java.io.*;
import java.util.*;

public class Main{

	static int map[][];
	static int N, M;
	
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine());
		N = Integer.parseInt(token.nextToken());
		M = Integer.parseInt(token.nextToken());
		
		map = new int[N][M];
		for(int t = 0; t < 2; t++) {
			
			for(int i = 0; i < N; i++) {
				token = new StringTokenizer(br.readLine());
				for(int j = 0; j < M; j++) {
					map[i][j] += Integer.parseInt(token.nextToken());
				}
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				System.out.print(map[i][j]+" ");
			}System.out.println();
		}
		
	}

}
