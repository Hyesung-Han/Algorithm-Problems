import java.util.*;
import java.io.*;

public class Main{

	static int [][]map;
	static int MaxNum = -1;
	static int r,c;
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		map = new int [9][9];
		StringTokenizer token;
		r =-1;
		c= -1;
		
		for(int i = 0; i < 9; i++) {
			token = new StringTokenizer(br.readLine());
			for(int j = 0; j < 9; j++) {
				map[i][j] = Integer.parseInt(token.nextToken());
				if(MaxNum < map[i][j]) {
					MaxNum = map[i][j];
					r = i+1;
					c = j+1;
				}
			}
		}
		
		bw.write(String.valueOf(MaxNum)+"\n"+String.valueOf(r) + " "+String.valueOf(c));
		bw.flush();
	}

}
