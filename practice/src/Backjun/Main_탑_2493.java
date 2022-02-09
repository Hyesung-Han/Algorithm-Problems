package Backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_탑_2493 {
	static int N;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer token = new StringTokenizer(br.readLine());

		Stack<int []> st = new Stack<>();

		for (int i = 1; i <= N; i++) {
			int num = Integer.parseInt(token.nextToken());

			while (!st.isEmpty()) {// 스택이 안비었을 때
				if (st.peek()[0] >= num) { // 원래 있는애가 나보다 크면 출력, 작으면 팝
					System.out.print(st.peek()[1] + " ");
					break;
				} else {
					st.pop();
				}
			}
			if (st.isEmpty()) {// 스택 비었으면 결과값 0
				System.out.print("0 ");
			}
			st.push(new int[] {num, i});
		}
	}
}
