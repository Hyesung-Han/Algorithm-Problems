package Backjun;

import java.io.*;
import java.util.*;

public class Main_17298_오큰수 {

	static int N; //수열의 크기
	static int [] arr; //각 수열의 값 넣을 배열
	static StringBuilder sb;
	
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		sb = new StringBuilder();
		arr = new int[N];
		
		StringTokenizer token =  new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(token.nextToken());
		}
		// 배열들을 입력 받은 후 
		// 각 인덱스에 따라 그 뒤부터 탐색하며 자신보다 크면 바로 출력

		for (int i = 0; i < N; i++) {
			find(i);
		}
		System.out.println(sb.toString());
		
	}

	private static void find(int i) {
		int result = -1;
		for (int j = i; j < N; j++) {
			if(arr[i] < arr[j]) {
				result = arr[j];
				break;
			}
		}
		sb.append(result);
		sb.append(" ");
	}

}
