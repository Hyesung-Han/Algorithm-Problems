package Jungol;
/*
 * 일단 값 들어오면 소트해서(0은 제외하고 넣을 것임, 중복되는 값들도 안넣을 것임) 가장 앞에 있는 값과 마지막에 잇는 값의 차를 구한 후
 * 3 5 6 10 11      2
 * 3 0 5 6 0 10 11 -> 1차이 안나면 안에 넣어주기 조커개수 감소시킴
 * 
 * 3 0 5 6 9 10 11 12          // 1차이가 안나면 i 다음값으로 +1해서 넣어주는데 그 자리들을 바꿔가면서 확인해야하는데 어떻게 하는거지음
 * 
 * 97 99 100 103          1씩차이나면 MM하기
 * 
 * 1 2 6 8 1000       3         1 2 0 0 0 6 8 1000
 * */
//배열을 그냥 1000칸만들어서 그 자리에 조합으로 넣어보고 해볼까

import java.io.*;
import java.util.*;
public class Main_1205_조커 {

	static int N;
	static int[] card;
	static int joker;
	public static void main(String[] args) throws Exception{

		Scanner scann = new Scanner(System.in);
		N = scann.nextInt();
		card = new int[N];
		joker = 0;
		for (int i = 0; i < N; i++) {
			int a = scann.nextInt();
			if(a == 0) {
				joker++;
			}else {
				card[i] = a;
			}
		}
		Arrays.sort(card);
		System.out.println(Arrays.toString(card));
		
		
	}

	
	
	
}
