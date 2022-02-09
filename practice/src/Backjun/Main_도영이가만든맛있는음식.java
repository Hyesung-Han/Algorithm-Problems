package Backjun;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_도영이가만든맛있는음식 {

	static int N;//재료의 개수
	
	
	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		ArrayList<int[]> food = new ArrayList<>();
		
		N = scann.nextInt();
		
		for (int i = 0; i < N; i++) {
			food.add(i, new int[] {scann.nextInt(), scann.nextInt()});
		}//배열 입력 완료
		
		subset(0,0,new boolean[N]);
		
	
	}


	public static void subset(int cnt, int tot, boolean[] v) {
		if(cnt ==N ) {
			for (int i = 0; i < N; i++) {
				if(v[i]) {
					//선택한 경우
				} 
			}
		return;
		}
		v[cnt] = true;
		
		v[cnt] = false;
	}

}
