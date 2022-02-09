package Backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
 * < > 사이에 있는 문자(공백포함) 모두 그대로 나온다
 * 띄어쓰기를 기준으로 각 단어들이 형성되며 이 들이 <>안에 있지 않다면 거꾸로 뒤집힌다 스택 사용해야할 듯
 * <가 들어오면 바로 스트링 빌더에 추가하고 >나올때까지 계속 추가,
 * >가 끝나고 <가 나오기 전까지 띄어쓰기를 기준으로 스트링을 잘라서 반대로 뒤집는다 이때 스택을 사용하여 넣고 다음 띄어쓰기가 오기전까지 출력
 */


/*
 * '<' 들어오면 그 전까지 스택에 들어있는 것 싹다 출력해놓기 
 * '>' 들어오면 그 전까지 있던 거 일반적으로 출력
 */
public class Main_17413_단어뒤집기_다시생각해봐야함실패 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		char[] cc = str.toCharArray();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < cc.length; i++) {
			here:if (cc[i] == '<') {
				 while (true) {
					if (cc[i] == '>') {
						sb.append(cc[i]);
						break here;
					} else {
						sb.append(cc[i]);
						i++;
					}
				}
			} else if (cc[i] != '<' && cc[i] != '>') {
				int ss = stack.size();
				if (i == cc.length - 1) {
					sb.append(cc[i]);
					for (int j = 0; j < ss; j++) {
						sb.append(stack.peek());
						stack.pop();
					}
				} else if (cc[i] == ' ') {
					for (int j = 0; j < ss; j++) {
						sb.append(stack.peek());
						stack.pop();
					}
					sb.append(cc[i]);

				} else {
					stack.push(cc[i]);

				}

			}else if(cc[i-1] == '>' && (cc[i]!=' ' && cc[i]!='<' && i != cc.length-1)) {
				int ss = stack.size();
				 if (cc[i] == ' ') {
					for (int j = 0; j < ss; j++) {
						sb.append(stack.peek());
						stack.pop();
					}
					sb.append(cc[i]);

				} else {
					stack.push(cc[i]);

				}
			}
		}
		System.out.println(sb.toString());

	}
}
