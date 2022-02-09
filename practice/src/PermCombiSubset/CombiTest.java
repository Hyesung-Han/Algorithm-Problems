package PermCombiSubset;

import java.util.Scanner;

public class CombiTest {

	static int [] p = {1,2,3,4,5};
	static int N =p.length;
	static int count;
	static int R;
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		R = scann.nextInt();
		
		Comb(0,0, new int[R]);
		System.out.println(count);
		
	}
	private static void Comb(int start, int cnt, int[] nums) {

		if(cnt == R) {
			count++;
			return;
		}
		for (int i = start; i < N; i++) {
			nums[cnt] = p[i];
			Comb(i+1, cnt+1, nums);
		}
		
		
		
	}

}
