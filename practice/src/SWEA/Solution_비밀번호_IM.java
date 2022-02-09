package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution_비밀번호_IM {

	static int T;
	static int N;

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token;
		Stack<Character> stack = new Stack<>();
		T = 10;
		for (int t = 1; t <= T; t++) {
			token = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(token.nextToken()); 
			char[] str = token.nextToken().toCharArray();
			for (int i = 0; i < N; i++) {
				if(stack.isEmpty()) {
					stack.push(str[i]);
				}else {
					if(stack.peek()==str[i]) {
						stack.pop();
					}else stack.push(str[i]);
				}
			}
			int A = stack.size();
			char[] ans = new char[A];
			for (int i = A-1; i >=0; i--) {
				ans[i] = stack.peek();
				stack.pop();
			}
			System.out.print("#"+t+" ");
			for (int i = 0; i < ans.length; i++) {
				System.out.print(ans[i]);
			}System.out.println();
		}
	
	
	
	
	}

	

}
