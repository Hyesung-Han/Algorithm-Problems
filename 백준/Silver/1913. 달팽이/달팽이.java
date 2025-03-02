import java.io.*;
import java.util.*;

public class Main {

	static int [][] map; //총 맵 출력
	static int N; // 주어진 맵의 한 변 길이
	static int K; // 찾으려는 숫자
	static int ansR, ansC; // k의 맵 상에서의 위치
	static int dr[] = {-1, 0, 1, 0};
	static int dc[] = {0, 1, 0, -1};
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		K = Integer.parseInt(br.readLine());
		
		
		map = new int [N][N];
		
		int cr = N/2 ; //시작위치
		int cc = N/2 ; //시작위치

		int k = 2; //시작 값
		int d = 0; //첫 방향

		map[cr][cc] = 1;
		
		if(K == 1) {
			ansR = cr+1;
			ansC = cc+1;
		}
			
		while(true) {
			
			
			for(int i = 0; i < 4; i++) {
				int nr = cr + dr[d%4];
				int nc = cc + dc[d%4];
				if(check(nr, nc) && map[nr][nc] == 0) {
					map[nr][nc] = k;
					cr = nr;
					cc = nc;
					d++;
					if( k == K) {
						ansR = cr+1;
						ansC = cc+1;
					}
					break;
					
				} else d = (d+3)%4;
				
			}

			k++;
			if (k > N*N) break;
			
		}
			for(int i = 0; i < N; i ++) {
				for(int j = 0; j < N; j++) {
				bw.write(String.valueOf(map[i][j]+" "));
				}
			bw.write("\n");
			}
		bw.write(String.valueOf(ansR + " "+ ansC));
		
		bw.flush();
		bw.close();
	}

	private static boolean check(int nr, int nc) {
		return (nr >= 0 && nc >= 0 && nr < N && nc < N);
	}

}
