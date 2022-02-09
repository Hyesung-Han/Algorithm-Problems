package Backjun;

import java.util.Scanner;

public class Main_8320_직사각형을만드는방법 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int N = scann.nextInt();
		int cnt = 0;
		for (int i = 1; i <= Math.sqrt(N); i++) {
			for (int j = i; j <= N; j++) {
				if(i*j <= N) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		
	}

}
