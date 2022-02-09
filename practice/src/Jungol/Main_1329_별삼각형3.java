package Jungol;

import java.util.Scanner;

public class Main_1329_별삼각형3 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int N = scann.nextInt();
		
		if(N%2==0 || N > 100) {
			System.out.println("INPUT ERROR!");
		}else {
		
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N/2-Math.abs(N/2-i); j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < N-Math.abs(N/2-i)*2; j++) {
					System.out.print("*");
				}System.out.println();
			}
		}
		
	}

}
