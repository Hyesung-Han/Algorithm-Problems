package PermCombiSubset;

import java.util.Arrays;

public class Permutation {

	static int[] p = {1,2,3,4,5};
	static int N = p.length;
	static int count;
	static int R;
	public static void main(String[] args) {
		
		R = 3;
		perm(0,new boolean[N], new int[R]);
		System.out.println(count);
		

	}
	public static void perm(int cnt, boolean[] v, int[] nums) {
		if(cnt == R) {
			count++;
			System.out.println(Arrays.toString(nums));
			return;
		}
		
		for (int i = 0; i < N; i++) {
			if(v[i]) continue;
			
			v[i] = true;
			nums[cnt] = p[i];
			perm(cnt+1, v, nums);
			v[i] = false;
			
		}
	}

}





