package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution_비밀번호 {

	static int T;// test case = 10;
	static int N;// 문자열의 길이

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = 10;
		for (int t = 1; t <= T; t++) {
			StringTokenizer token = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(token.nextToken());
			String temp = token.nextToken();
			int[] pw = new int[N];
			for (int i = 0; i < N; i++) {
				pw[i] = temp.charAt(i) - '0';
			} // 배열에 넣기 완성

			Stack<Integer> stack = new Stack<>();
			// 1. 비었으면 넣기
			// 2. peek한 값과 같지 않으면 넣기
			// 3. peek한 값과 같으면 pop하기

			for (int i = 0; i < N; i++) {
				if (stack.isEmpty()) {// stack비었으면 넣기
					stack.push(pw[i]);
				} else {
					if (stack.peek() != pw[i]) {
						stack.push(pw[i]);
					} else if (stack.peek() == pw[i]) {
						stack.pop();
					}
				}

			}
			System.out.print("#" + t + " ");
			String result = "";
			int ss = stack.size();
			for (int i = 0; i < ss; i++) {
				result = stack.peek()+result;
				stack.pop();
			} 
			System.out.println(result);
		}

	}

}
