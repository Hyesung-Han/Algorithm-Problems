package Backjun;

import java.util.*;
import java.io.*;

public class Main_14889_스타트와링크 {

	static int N;//people
	static int [][] team;
	static int result = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//comb로 두 팀을 가르고 그때의 값들을 합산해서 그때의 차이가 작을 때 그것이 답
		N = Integer.parseInt(br.readLine());
		
		team = new int[N][N];
		for (int i = 0; i < N; i++) {
			StringTokenizer token  = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < N; j++) {
				team[i][j] = Integer.parseInt(token.nextToken());
			}
		}
		
		//Combination 으로 N/2개씩 고르고 선택된 팀과 아닌 팀을 나눠서 각 합을 구한 뒤 그 차이를 비교한다.
		Combi(0,0,new boolean[N],new int[N/2]);
		System.out.println(result);
	}

	private static void Combi(int start, int cnt, boolean[] visited,int[] nums) {

		if(cnt == N/2) {
			go(visited,nums);
			return;
		}
		
		for (int i = start; i < N; i++) {
			nums[cnt] = i;
			visited[i] = true;
			Combi(i+1, cnt+1, visited,nums);
			visited[i] = false;
		}
	}

	private static void go(boolean[] visited,int[] nums) {
		int sum = 0;
		int nsum = 0;
		for (int i = 0; i < N-1; i++) {
			for (int j = i+1; j < N; j++) {
				if(visited[i] == true && visited[j]== true) {
					sum += team[i][j];
					sum += team[j][i];
				}
				if(visited[i] == false && visited[j] == false) {
					nsum += team[i][j];
					nsum += team[j][i];
				}
			}
		}
		result = Math.min(Math.abs(nsum-sum), result);
		
		if(result == 0) {
			return;
		}
		
	}

}
