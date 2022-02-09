package Backjun;

import java.io.*;
import java.util.*;

public class Main_요세푸스_fail {

	static int N;
	static int K;
	static int[] arr;
	static StringBuilder sb;

	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);

		N = scann.nextInt();
		K = scann.nextInt();
		arr = new int[N + 1];
		arr[0] = -1;

		go();
		System.out.println(sb);
	}

	public static void go() {
		Queue<Integer> que = new LinkedList<>();
		sb = new StringBuilder();

		que.add(K);

		while (!que.isEmpty()) {
			int x = que.poll();
			sb.append(x + " ");
			arr[x] = 1;
			int cnt = 0;
			int nx = 0;
			here : while (true) {				
				if(cnt == K ) {
					que.add(x);
					break here;
				}
				
				if(arr[x+1] == 0) {
					cnt++;

				}
				nx = (x+1) % N;
			}
			

		}

	}

}
