package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution_괄호짝짓기 {

	static int N;// 텍스트의 길이
	static boolean result;
	static char[] opencc = { '{', '[', '<', '(' };
	static char[] closecc = { '}', ']', '>', ')' };

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int t = 1; t <= 10; t++) {
			N = Integer.parseInt(br.readLine());
			char[] cc = br.readLine().toCharArray();
			Stack<Character> stack = new Stack<>();
			result = false;
			here : for (int i = 0; i < cc.length; i++) {
				for (int j = 0; j < opencc.length; j++) {
					if (cc[i] == opencc[j]) {// 여는 괄호이면 푸쉬
						stack.push(opencc[j]);
					} else if (cc[i] == closecc[j]) {
						if (stack.peek() == opencc[j]) {
							stack.pop();
							result = true;
						} else {
							result = false;
							break here;
						}
					}
				}
			}
			System.out.println("#" + t + " " + (result?1:0));

		}

	}

}
