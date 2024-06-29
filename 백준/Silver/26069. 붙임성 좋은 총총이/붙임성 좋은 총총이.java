import java.io.*;
import java.util.*;

public class Main{

	static int N;
	static HashSet<String> dance;
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		dance = new HashSet<>();
		
		StringTokenizer token;
		String p1 = null, p2 = null;
		dance.add("ChongChong");
		
		for(int i = 0; i < N; i++) {
			token = new StringTokenizer(br.readLine());
			p1 = token.nextToken();
			p2 = token.nextToken();
			
			if(dance.contains(p1) || dance.contains(p2)) {
				dance.add(p1);
				dance.add(p2);
			}
		}
		
		bw.write(String.valueOf(dance.size()));
		bw.flush();
		bw.close();
		
	}

}
