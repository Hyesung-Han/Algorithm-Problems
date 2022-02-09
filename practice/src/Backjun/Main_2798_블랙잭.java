package Backjun;
/*
 * 카드는 모두 양수
 * N장의 카드
 * M을 외침
 * N장 중 3장 고르기
 * 이때 M이하이면서 M과 가장 가까워야함
 * 이때의 총 합은?
 */
//N 장중 3장을 고르고 그의 합이 M이상이며 M과의 차이가 가장 적은 값을 출력 -> 콤비 사용
import java.io.*;
import java.util.*;

public class Main_2798_블랙잭 {

	static int N,M;
	static int[] p;
	static int sum;
	static int result;
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer token = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(token.nextToken());
		M = Integer.parseInt(token.nextToken());
		
		p = new int[N];
		token = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < N; i++) {
			p[i] = Integer.parseInt(token.nextToken());
		}
		result = Integer.MIN_VALUE;
		combi(0,0,new boolean[N], new int[3]);
		System.out.println(result);
		
	}

	public static void combi(int start, int cnt, boolean[] v, int[] nums) {
		sum = 0;
		if(cnt == 3) {
			for (int i = 0; i < nums.length; i++) {
				sum += nums[i];
			}
			if(sum<=M) {
				result =  Math.max(sum, result);
			}
			
			
			return;
		}
		
		for (int i = start; i < N; i++) {
			if(v[i]) continue;
			
			v[i] = true;
			nums[cnt] = p[i];
			combi(i+1, cnt+1, v, nums);
			v[i] = false;
		}
		
		
	}

}
