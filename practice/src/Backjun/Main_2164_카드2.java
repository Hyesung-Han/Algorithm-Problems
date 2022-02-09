package Backjun;
import java.io.*;
import java.util.*;

public class Main_2164_카드2 {

	static int N;
	
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		//카드 번호를 순서대로 넣은 후 que를 통해 나가고 들어가기를 반복할 예정
		
		Queue<Integer> que = new LinkedList<Integer>();
		
		for (int i = 1; i <= N; i++) {
			que.offer(i);			
		}
		
		while(que.size() != 1) {
			que.poll();
			que.offer(que.poll());
		}
		
		System.out.println(que.poll());
	}

}
