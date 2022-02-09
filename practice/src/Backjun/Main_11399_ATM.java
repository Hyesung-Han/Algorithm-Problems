package Backjun;

/*
 * N명중 i번째 사람이 돈 인출하는데 걸리는 시간은 Pi분
 * 배열을 소트하여서 누적값들을 다 넣어주고 총합구하면 끝
 */
import java.io.*;
import java.util.*;

public class Main_11399_ATM {

	static int N;
	static int[] p;// 각 사람들의 걸리는 시간(각자임, 누적 아님)
	static int[] result;// 누적값

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());

		p = new int[N];
		result = new int[N];
		StringTokenizer token = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			p[i] = Integer.parseInt(token.nextToken());
		}
		Arrays.sort(p);
		
		result[0] = p[0];
		for (int i = 1; i < N; i++) {
			result[i] += result[i - 1]+p[i];
		}
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += result[i];
		}
		System.out.println(sum);
	}

}
