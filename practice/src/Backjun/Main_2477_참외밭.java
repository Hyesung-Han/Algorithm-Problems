package Backjun;

import java.util.Scanner;

public class Main_2477_참외밭 {

	static int K;
	static int MW;
	static int MH;
	static int SH;
	static int SW;
	static int[] len;
	
	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);
		
		K = scann.nextInt();
		len = new int[6];
		for (int i = 0; i < 6; i++) {
			scann.nextInt();
			len[i] = scann.nextInt();
		}
		MH = Integer.MIN_VALUE;
		MW = Integer.MIN_VALUE;
		for (int i = 0; i < 6; i++) {
			if(i%2==0) {
				MH = Math.max(MH, len[i]);
				if(MH==len[i])
				SH = i+3;
			}else {
				MW = Math.max(MW, len[i]);
				if(MW==len[i])
				SW = i+3;
			}
		}
		if(SH >= 6) {
			SH = SH -6;
		}
		
		if(SW >= 6) {
			SW = SW -6;
		}
		System.out.println((MH*MW-(len[SH]*len[SW]))*K);
	}

	
	
}



