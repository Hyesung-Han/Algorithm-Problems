
import java.util.*;
import java.io.*;

public class Main{
	static int [] map;
	static int MAX_COUNT = 0;
	static int MAX_NUM = 0;
	static int answer;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		map = new int [7];
		
		StringTokenizer token = new StringTokenizer(br.readLine());
		int num ;
		
		for(int i = 0; i < 3; i++) {
			num = Integer.parseInt(token.nextToken());
			map[num]++;
			if(MAX_COUNT < map[num]) {
				MAX_NUM = num;
				MAX_COUNT = map[num];
			}else if (MAX_COUNT == map[num])
				MAX_NUM = Math.max(MAX_NUM, num);
			
		}
		
		if(MAX_COUNT == 3) 
			answer = 10000+(MAX_NUM*1000);
		else if(MAX_COUNT == 2)
			answer  = 1000+(MAX_NUM*100);
		else answer = MAX_NUM*100;
		
		System.out.println(answer);
	}

}
