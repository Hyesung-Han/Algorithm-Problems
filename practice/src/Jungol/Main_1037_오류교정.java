package Jungol;

import java.util.Arrays;
import java.util.Scanner;

public class Main_1037_오류교정 {

	static int N;
	static int map[][];
	static int xlen[];
	static int ylen[];
	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);
		N = scann.nextInt();
		
		map = new int[N][N];
		xlen = new int[N];
		ylen = new int[N];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = scann.nextInt();
			}
		}
		int a = 0;
		int b = 0;
		int count = 0;
		for (int i = 0; i < N; i++) {
			count = 0;
			for (int j = 0; j < N; j++) {
				if(map[i][j] == 1) {
					count++;
				}
			}
			if(count%2 == 1) {
				xlen[a] = i;
				a++;
			}
		}
		for (int j = 0; j < N; j++) {
			count = 0;
			for (int i = 0; i < N; i++) {
				if(map[i][j] == 1) {
					count++;
				}
			}
			if(count%2 == 1) {
				ylen[b] = j;
				b++;
			}
		}

		if(a!=b) {
			System.out.println("Corrupt");
		}
		if(a == 0 && b == 0) {
			System.out.println("OK");
		}
		if(a==b && a != 0 && b != 0) {
			for (int i = 0; i < a; i++) {
				System.out.println("Change bit("+ (xlen[i]+1)+","+(ylen[i]+1) +")");
			}
		}
		
	}

	
	
}
