import java.io.*;
import java.util.*;

public class Main {

	static String str;
	static int ans = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		str = br.readLine();
		// 첫 문자에서 바뀌는 경우 찾기
		char s = str.charAt(0);
		char b = str.charAt(0);
		
		for(int i = 1; i < str.length(); i++) {
			if(b == s && str.charAt(i) != s)
				ans++;
			b = str.charAt(i);
		}
		
		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
	}

}