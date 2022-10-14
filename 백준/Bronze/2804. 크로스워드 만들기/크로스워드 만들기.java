import java.io.*;
import java.util.*;

public class Main{

	static String A;
	static String B;
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer token = new StringTokenizer(br.readLine());
		A = token.nextToken();
		B = token.nextToken();
		
		StringBuilder sb = new StringBuilder();

		int bIdx = -1;
		int aIdx = -1;
		for(int i = 0; i < A.length(); i++) {
			char b = A.charAt(i);
			for(int j = 0; j < B.length(); j++) {
				if(b == B.charAt(j)) {
					aIdx = i;
					bIdx = j;
					break;							
				}
			}
			if(bIdx != -1 && aIdx != -1)
				break;
		}
		for(int i = 0; i < B.length(); i++) {
			for(int j = 0; j < A.length(); j++) {
				if(i == bIdx) 
					sb.append(A.charAt(j));
				else if(j == aIdx)
					sb.append(B.charAt(i));
				else
					sb.append(".");
			}
			sb.append("\n");
		}
		
		bw.write(sb.toString());
		bw.close();
	}

}
