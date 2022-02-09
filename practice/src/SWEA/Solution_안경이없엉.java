package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_안경이없엉 {

	static int T;
	static String one = "ADOPQR";
	static String two = "B";
	static String zero = "CEFGHIJKLMNSTUVWXYZ";
	static boolean ans;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			StringTokenizer token = new StringTokenizer(br.readLine());
			String str1 = token.nextToken();
			String str2 = token.nextToken();
			ans = true;
			if (str1.length() != str2.length()) {
				System.out.println("#" + t + " DIFF");
				continue;
			} else {
				for (int i = 0; i < str1.length(); i++) {

					if (one.contains(str1.charAt(i) + "")) {
						if (!one.contains(str2.charAt(i) + "")) {
							System.out.println("#" + t + " DIFF");
							ans = false;
							break;
						}
					}
					if (two.contains(str1.charAt(i) + "")) {
						if (!two.contains(str2.charAt(i) + "")) {
							System.out.println("#" + t + " DIFF");
							ans = false;
							break;
						}
					}
					if (zero.contains(str1.charAt(i) + "")) {
						if (!zero.contains(str2.charAt(i) + "")) {
							System.out.println("#" + t + " DIFF");
							ans = false;
							break;
						}
					}
				}
				if (ans)
					System.out.println("#" + t + " SAME");
			}
		}
	}

}
