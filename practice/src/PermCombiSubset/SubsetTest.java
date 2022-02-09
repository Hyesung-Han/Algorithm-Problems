package PermCombiSubset;

public class SubsetTest {

	static int [] p = {1,2,3,4,5};
	static int N = p.length;
	static int count;
	
	public static void main(String[] args) {

		sub(0,0, new boolean[N]);
		System.out.println(count);
		
		
	}

	private static void sub(int cnt, int tot, boolean[] v) {

		if(cnt == N) {
			count++;
			return;
		}
		
		v[cnt] = true;
		sub(cnt+1, tot+p[cnt], v);
		v[cnt] = false;
		sub(cnt+1, tot, v);
		
		
	}

}
