package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_원재의메모리복구하기 {

	static int T;
	static int[] arr;
	static int count;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			String str = br.readLine();
			String[] ss = str.split("");
			arr = new int[ss.length];
			for (int i = 0; i < ss.length; i++) {
				arr[i] = Integer.parseInt(ss[i]);
			}
			count = 0;
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == 1) {//1이면 바꾸고 그 뒤 있는 애들도 다 바꾸기
					count++;
					for (int j = i; j < ss.length; j++) {
						if(arr[j] == 0) arr[j] =1;
						else arr[j] =0;
					}
				}
			}
			System.out.println("#"+t+" "+count);
		}
		
	}

}
