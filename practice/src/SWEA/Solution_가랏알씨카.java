package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_가랏알씨카 {

	static int T;
	static int N;
	static int[][] car;
	static int result; // 결과값 거리

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			N = Integer.parseInt(br.readLine());
			car = new int[N][2];
			for (int i = 0; i < N; i++) {
				StringTokenizer token = new StringTokenizer(br.readLine(), " ");
				car[i][0] = Integer.parseInt(token.nextToken()); // 0:유지 1:가속 2:감속
				if (car[i][0] == 1 || car[i][0] == 2) {
					car[i][1] = Integer.parseInt(token.nextToken()); // 속도 변화
				}
			} // 배열 채움

		//	go(0,0,0);//현재 인덱스,이전의 속력, 이전의 거리

			System.out.println("#" + t +" "+ go(0,0,0));
		}

	}

	public static int go(int x, int prespeed, int premeter) {
		
		for(x=0; x<N; x++) {
		
			int sp = 0;
			switch (car[x][0]) {
			case 0:
				sp = 0;
				break;
			case 1:
				sp = car[x][1];
				break;
			case 2:
				sp = (-1)*car[x][1];
				break;
			}
			prespeed += sp;
			if (prespeed < 0) {
				prespeed = 0;
			}
			premeter += prespeed;
		}
		
		return premeter;
		
	}

}
