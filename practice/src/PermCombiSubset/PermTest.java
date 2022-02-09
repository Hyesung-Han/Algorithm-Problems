package PermCombiSubset;

import java.util.Scanner;

public class PermTest {

	 static int [] p = {1,2,3,4,5};
	 static int N = p.length;
	 static int R;
	 static int count;
	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);
		
		R = scann.nextInt();
		
		Perm(0,new boolean[N], new int[R]);
		System.out.println(count);
	}

	private static void Perm(int cnt, boolean[] v, int[] nums) {

		if(cnt == R) {
			count++;
			return;
		}
		for (int i = 0; i < N; i++) {
			if(v[i]) continue;
			
			v[i] = true;
			nums[cnt] = p[i];
			Perm(cnt+1, v,nums);
			v[i] = false;
			
		}
		
	}

}
