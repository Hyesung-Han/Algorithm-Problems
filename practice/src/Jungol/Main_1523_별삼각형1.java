package Jungol;

import java.util.Scanner;

public class Main_1523_별삼각형1 {

	static int N, M;

	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);
		N = scann.nextInt();
		M = scann.nextInt();

		if (N > 100 || N < 1 || M < 1 || M > 3) {
			System.out.println("INPUT ERROR!");
		} else {
			
			switch (M) {
			case 1:
				for (int i = 0; i < N; i++) {
					for (int j = 0; j <= i; j++) {
						System.out.print("*");
					}System.out.println();
				}
				break;
			case 2:
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < N - i; j++) {
						System.out.print("*");
					}System.out.println();
				}
				break;
			case 3:
				for (int i = 0; i < N; i++) {
					for (int j = N - i - 2; j >= 0; j--) {
						System.out.print(" ");
					}
					for (int j = N - i - 1; j < N + i; j++) {
						System.out.print("*");
					}System.out.println();
				}
				break;
			}
			
		}
	}
}
/*
 * ----*---- ---***--- --*****-- -*******- *********
 */