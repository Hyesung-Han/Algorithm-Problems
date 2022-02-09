package SWEA;

import java.util.Scanner;
import java.util.Stack;

public class Solution_1859_백만장자프로젝트 {

	static int T; // test case
	static int N;
	static int[] cost;

	static long sum;
	static long result;

	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);
		T = scann.nextInt();
		for (int t = 1; t <=T; t++) {
			
		sum = 0;
		N = scann.nextInt();
		cost = new int[N];
		for (int i = 0; i < N; i++) {
			cost[i] = scann.nextInt();
		}
		//뒤부터 조사 자기보다 작으면 자신에서 작은 아이들 다 빼기
		int M = cost[N-1];
		for (int i = N-2; i >=0; i--) {
			if(M > cost[i]) {
				sum+= M-cost[i];
			}else {
				M = cost[i];
			}
		}
		System.out.println("#" + t + " " + sum);
		}
		
		
		
	}

}
