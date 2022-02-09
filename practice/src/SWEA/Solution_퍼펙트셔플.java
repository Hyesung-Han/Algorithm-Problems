package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_퍼펙트셔플 {

	static int T;
	static int N;
	static String[] str1;
	static String[] str2;	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <=T; t++) {
			N = Integer.parseInt(br.readLine());
			StringTokenizer token = new StringTokenizer(br.readLine()," ");
			int M =0;
			if(N%2 == 0) M = N/2;
			else M = N/2 +1;
			str1 = new String[M];
			str2 = new String[N/2];
			
			for (int i = 0; i < M; i++) {
				str1[i] = token.nextToken();
			}
			for (int i = 0; i < N/2; i++) {
				str2[i] = token.nextToken();
			}
			
			Queue<String> que = new LinkedList<>();
			for (int i = 0; i < N/2; i++) {
				que.offer(str1[i]);
				que.offer(str2[i]);				
			}
			if(que.size()!=N) {
				que.offer(str1[M-1]);
			}
			
			System.out.print("#" + t + " ");
			while(!que.isEmpty()) {
				System.out.print(que.peek()+" ");
				que.poll();
			}System.out.println();
		}
		
		
	}

}
