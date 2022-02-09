package Backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

/*
 *	입력 받은 값을 스택에 넣고  < 가 들어오면 거꾸로 출력한다
 *	< 가 들어오게 되면 스택에 넣고  >가 들어오면 이를 그대로 출력한다   
 */

public class Main_17413_단어뒤집기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String ss = br.readLine();

		// 한 개씩 잘라서 봤을 때
		// 1. 일단 < 들어오고 empty가 아니라면 그 전에 있는거 flush
		// 1-1. > 가 들어오면 그대로 flush
		// 2. 맨 마지막에 string 갯수만큼 다 들어왔다면 맨 마지막이 >가 아니라면 거꾸로 플러쉬

		char[] cc = ss.toCharArray();
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		boolean check = false;
		int i = 0;
		here: while (true) {
			if (cc[i] == '<') {
				int a = stack.size();
				if (!stack.isEmpty()) {
					for (int j = 0; j < a; j++) {
						sb.append(stack.peek());
						stack.pop();
					}
				}
				check = true;
				stack.push(cc[i]);
				i++;
			} else if (cc[i] == '>') {// 거꾸로 출력
				stack.push(cc[i]);
				int a = stack.size();
				char[] aa = new char[a];
				for (int j = 0; j < a; j++) {
					aa[j] = stack.peek();
					stack.pop();
				}
				for (int k = aa.length - 1; k >= 0; k--) {
					sb.append(aa[k]);
				}
				check = false;
				i++;
			} else {
				if (cc[i] == ' ') {// stack에 < 가 없으면 실시 있으면 그냥 넣기만 하기
					if (!check) {
						int a = stack.size();
						for (int j = 0; j < a; j++) {
							sb.append(stack.peek());
							stack.pop();
						}
						sb.append(cc[i]);
						i++;
					} else {
						stack.push(cc[i]);
						i++;
					}
				} else {
					stack.push(cc[i]);
					i++;
				}
			}
			if (i == cc.length - 1) {
				if (cc[i] != '>') {

					stack.push(cc[i]);
					int ab = stack.size();
					for (int j = 0; j < ab; j++) {
						sb.append(stack.peek());
						stack.pop();
					}
				}
				else {
					stack.push(cc[i]);
					int a = stack.size();
					char[] aa = new char[a];
					for (int j = 0; j < a; j++) {
						aa[j] = stack.peek();
						stack.pop();
					}
					for (int k = aa.length - 1; k >= 0; k--) {
						sb.append(aa[k]);
					}	
				}
				break here;
			}

		}

		System.out.println(sb.toString());
	}

}
