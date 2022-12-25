import java.io.*;
import java.util.*;

public class Main  {

	static int N;
	static int cnt5;
	static int answer;
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		
			for(int i = 1; i <= N; i++) {
				if(i % 5 == 0)
					count(i);
			}
			answer = cnt5;
		
		bw.write(String.valueOf(answer));
		bw.close();
		
	}

	private static void count(int i) {
		
		while(true) {
			if(i % 5 != 0) break;
			i /= 5;
			cnt5++;
		}
	}

}
