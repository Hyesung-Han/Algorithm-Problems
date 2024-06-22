import java.io.*;
import java.util.*;

public class Main{

	static char[][] map ;
	static int MAX_NUM = 0;
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = null;
		map = new char[5][15];
		for(int i = 0; i < 5; i++)
			Arrays.fill(map[i], '-');
			
			
		for(int i = 0; i < 5; i++) {
			str = br.readLine();
			MAX_NUM = Math.max(MAX_NUM, str.length());
			for(int j = 0; j < str.length(); j++) {
				map[i][j] = str.charAt(j);
			}		
			
		}
		
		for(int j = 0; j < MAX_NUM; j++) {
			for (int i = 0; i < 5; i++) {
				if(map[i][j] != '-')
				  bw.write(map[i][j]);
			}
		}
		bw.flush();
		
		
	}

}
