package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_안경이없어 {

	static int T; //testcase
	static String[] str1;
	static String[] str2;	
	static boolean result;
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringTokenizer token = new StringTokenizer(br.readLine(), " ");
			
			String s1 = token.nextToken();
			String s2 = token.nextToken();
			
			str1 = s1.split("");
			str2 = s2.split("");
			result = false;
			
			if(str1.length != str2.length) {
				result = false;
			}else {
				for (int i = 0; i < str1.length; i++) {
					if(check(str1[i])!=check(str2[i])) {
						result = false;
						break;
					}else result = true;
					
				}
			}
			if(result) {
				System.out.println("#" + t + " SAME");
			}else System.out.println("#" + t + " DIFF");
		
		}
		
	}

	public static int check(String str12) {
		String A = "ADOPQR";
		String B = "B";
		String C = "CEFGHIJKLMNSTUVWXYZ";
		int result = 0;
		if(A.contains(str12)) {
			result = 1;
		} else if(B.contains(str12)) {
			result = 2;
		} else if(C.contains(str12)) {
			result = 3;
		}
		return result;
		
	}

}
