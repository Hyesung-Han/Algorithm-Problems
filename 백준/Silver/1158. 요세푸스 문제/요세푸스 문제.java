import java.io.*;
import java.util.*;

public class Main{

	static int N, K;
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer token = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(token.nextToken());
		K = Integer.parseInt(token.nextToken());
		
		Queue<Integer> que = new LinkedList<>();
		for(int i = 1; i <= N; i++) {
			que.offer(i);
		}
		bw.write("<");
		while(que.size() > 1) {
			for(int cnt = 1; cnt < K; cnt++) {
				int num = que.poll();
				que.offer(num);
			}
			int n = que.poll();
			bw.write(n+", ");
		}
		bw.write(que.poll()+">");
		bw.close();
	}

}
