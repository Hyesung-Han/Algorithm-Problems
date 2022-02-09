package Jungol;

import java.util.*;

public class Main_1719_별삼각형2 {

	static int N, M;

	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);
		N = scann.nextInt();
		M = scann.nextInt();
		if (N % 2 == 1 && M > 0 && M < 5) {

			switch (M) {
			case 1:
				for (int i = 0; i < N; i++) {
					for (int j = 0; j <= N / 2 - Math.abs(N / 2 - i); j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				break;
			case 2:
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < Math.abs(N / 2 - i); j++) {
						System.out.print(" ");
					}
					for (int j = N / 2 - Math.abs(N / 2 - i); j >= 0; j--) {
						System.out.print("*");
					}
					System.out.println();
				}
				break;
			case 3:
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < N / 2 - Math.abs(N / 2 - i); j++) {
						System.out.print(" ");
					}
					for (int j = 0; j <= 2 * Math.abs(N / 2 - i); j++) {
						System.out.print("*");
					}
					System.out.println();
				}

				break;
			case 4:
				for (int i = 0; i < N; i++) {
					if (i <= N / 2) {
						for (int j = 0; j <= i - 1; j++) {
							System.out.print(" ");
						}
						for (int j = i; j <= N / 2; j++) {
							System.out.print("*");
						}
					} else {
						for (int j = 0; j < N / 2; j++) {
							System.out.print(" ");
						}
						for (int j = 0; j <= i - N / 2; j++) {
							System.out.print("*");
						}
					}
					System.out.println();
				}
				break;

			default:
				break;
			}
		} else {
			System.out.println("INPUT ERROR!");
		}
	}

}
