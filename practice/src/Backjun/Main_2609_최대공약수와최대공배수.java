package Backjun;

import java.util.Scanner;

public class Main_2609_최대공약수와최대공배수 {

	static int A, B;

	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);

		A = scann.nextInt();
		B = scann.nextInt();

		int mul = A * B;

		int nanugi = Math.abs(A - B);
		int yaksu = 1;
		if (A != B) {
			for (int i = 1; i <= nanugi; i++) {
				if (A % i == 0 && B % i == 0) {
					yaksu = Math.max(i, yaksu);
				}
			}
		}else {
			yaksu = A;
		}
		System.out.println(yaksu);
		System.out.println(mul / yaksu);

	}

}
