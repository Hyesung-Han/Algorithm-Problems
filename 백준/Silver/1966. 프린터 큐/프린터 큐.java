import java.io.*;
import java.util.*;

public class Main {

	static int T;
	static int N, M;
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		T = Integer.parseInt(br.readLine());
		StringTokenizer token = null;
		
		for(int t = 1; t <= T; t++) {
			token = new StringTokenizer(br.readLine());
			N = Integer.parseInt(token.nextToken());
			M = Integer.parseInt(token.nextToken());
			
			token = new StringTokenizer(br.readLine());

			Queue<int[]> que = new LinkedList<>();
			int [] wichtig = new int [N];
			
			for(int i = 0; i < N; i++) {
				int nums = Integer.parseInt(token.nextToken());
				wichtig[i] = nums;
				que.offer(new int[] {i, nums});
			}
			
			Arrays.sort(wichtig);
			int answer = 0;
			while(!que.isEmpty()) {
				int [] temp = que.peek();
				if(temp[1] == wichtig[N-1-answer]) {
					answer++;
					if(temp[0] == M)
						break;
				}else {
					que.offer(new int[] {temp[0], temp[1]});
				}

				que.poll();
			
			
			}
			
			bw.write(String.valueOf(answer)+"\n");
			
			
			
		}
		bw.close();
		
	}

}
