package Backjun;
import java.io.*;
import java.util.*;

public class Main_2156_포도주시식 {

	static int N; //총 포도주 갯수
	static int [] wine;
	static int WineMax;
	
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		wine = new int[N];
		
		for (int i = 0; i < N; i++) {
			wine[i] = Integer.parseInt(br.readLine());
		}
		WineMax = Integer.MIN_VALUE;
		//subset을 통해서 모든 경우의 수 가져오고 count로 연속 3이면 땡치기
		Sub(0,0,new boolean[N],0);
		System.out.println(WineMax);
		
	}

	private static void Sub(int cnt, int tot, boolean[] v, int count) {
		if(cnt == N) {
			if(count<3)
			go(v);
			return;
		}

		for (int i = 0; i < cnt; i++) {
			if(v[i]) {
				count++;
				if(count==4) return;
			}
			else count=0;
		}
		v[cnt] = true;
		Sub(cnt+1, tot+wine[cnt], v,count);
		
		v[cnt] = false;
		Sub(cnt+1, tot, v,count);					
		
	}

	private static void go(boolean[] v) {
		int sum = 0;
		for (int i = 0; i < N; i++) {
			if(v[i]) {
				sum += wine[i];
			}
		}
		
//		System.out.println(Arrays.toString(v));
		
		WineMax = Math.max(WineMax, sum);
		
	}

}
