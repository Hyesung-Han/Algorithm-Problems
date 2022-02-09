package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_flatten1 {

	static int N;// dump count
	static int[] map;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int t = 1; t <= 10; t++) {

			N = Integer.parseInt(br.readLine());
			map = new int[100];
			StringTokenizer token = new StringTokenizer(br.readLine());
			for (int i = 0; i < map.length; i++) {
				map[i] = Integer.parseInt(token.nextToken());
			}
			
			Arrays.sort(map);// map 오름차순 정렬 후 가장 마지막에 있는 수에서 1을 빼고 0이 아닌 가장 앞에 있는 수중에서 1을 더하며 계속 정렬한다.
			while (N > 0 ) {
				if(map[99] - map[0] >1) {
					map[99] --;
					map[0]++;
					Arrays.sort(map);
					N--;
				}
				if(N == 0 || map[99] - map[0] <2) {
					System.out.println("#"+t+" " + (map[99]- map[0]));
				}
			}
			
		}

	}

}
