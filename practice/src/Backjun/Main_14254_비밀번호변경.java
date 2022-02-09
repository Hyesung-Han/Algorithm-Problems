package Backjun;

import java.io.*;
import java.util.*;

public class Main_14254_비밀번호변경 {

	static int K;
	static char [] prepw;
	static int result;
	
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		prepw = new char[50]; //최대 길이 50
		prepw = br.readLine().toCharArray();

		K = Integer.parseInt(br.readLine());

		if(K ==  prepw.length) //패스워드 길이와 K값 같으면 비교할 필요 없음
			result = 0;
		else {
			int i = 0;
			while(i < K) {
				if(prepw[i] != prepw[prepw.length-K+i] ) {//비교했을 때 다르면
					System.out.println(i + " " + (prepw.length-K+i));
					System.out.println(prepw[i] + " "+ prepw[prepw.length-K+i]);
					System.out.println(Arrays.toString(prepw));
					prepw[prepw.length-K+i] = prepw[i];
							result++;
				}
				i++;
			}
		}
			
		System.out.println(result);
			
			
	}

}
