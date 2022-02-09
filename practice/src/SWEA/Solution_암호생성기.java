package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_암호생성기 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int t = 1; t <= 10; t++) {
			int T = Integer.parseInt(br.readLine());
			Queue<Integer> que = new LinkedList<>();
			String str = br.readLine();
			String[] ss = str.split(" ");

			for (int i = 0; i < ss.length; i++) {
				que.offer(Integer.parseInt(ss[i]));
			}
			here: while (true) {
				for (int i = 1; i <= 5; i++) {
					int temp = que.poll();
					temp = temp - i;

					if (temp < 1) {
						temp = 0;
					}
					que.offer(temp);
					if (temp == 0) {
						break here;
					}

				}
			}
			System.out.print("#" + t + " ");
			while (!que.isEmpty()) {
				System.out.print(que.poll() + " ");
			}
			System.out.println();
		}

	}

}
