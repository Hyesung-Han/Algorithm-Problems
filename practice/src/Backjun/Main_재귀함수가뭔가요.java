package Backjun;

import java.util.Scanner;

public class Main_재귀함수가뭔가요 {

	
	static int N;
	
	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		
		N = scann.nextInt();
		
		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		go(0);
	}

	public static void go(int count) {
		if(count == N) {
			System.out.println(dash(count)+"\"재귀가 뭔가요\"");
			System.out.println(dash(count)+"\"자기 자신을 호출하는 함수\"");
			System.out.println(dash(count)+"\"라고 답변하였지\"");
		}else {
			System.out.println(dash(count)+'"'+"재귀가 뭔가요"+'"');
			System.out.println(dash(count)+'"'+"나도 몰라 이씨 왜 나한테 물어 콱씨"+'"');
		}
		if(count<N) {
		go(count+1);
				System.out.println(dash(count)+'"'+"라고 답변하였지"+'"');
				
			
		}
	}

	public static String dash(int count) {
		String str = "----";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < count; i++) {
			sb.append(str);
		}
		return sb.toString();
	}

}
