package Backjun;

import java.io.*;
import java.util.*;

public class Main_1592_영식이와친구들 {

	static int N, M, L;

	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);

		N = scann.nextInt();
		M = scann.nextInt();
		L = scann.nextInt();
		int[] result = new int[N + 1];
		int cnt = 0;
		
		// result에 카운트 값 올리기
		int start = 1;
		result[1] = 1;
		here : while (true) {
			for (int i = 1; i < N + 1; i++) {// N명이 누군가가 M번 공받았다면 공을 총 던진 횟수 출력
				if (result[i] == M) {
					System.out.println(cnt);
					break here;
				}
			}
			if (result[start] % 2 != 0) {// 홀수이면 플러스
				if (start + L > N) {
					result[start + L - N] ++;
					cnt++;
					start = start + L - N;
				} else {
					result[start + L]++;
					cnt++;
					start = start + L;
				}
			} else {
				if (start - L <= 0) {
					result[start - L + N] ++;
					cnt++;
					start = start - L + N;
				} else {
					result[start - L]++;
					cnt++;
					start = start - L;
				}
			}
		}
	}

}
