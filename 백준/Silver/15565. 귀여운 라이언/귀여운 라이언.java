import java.io.*;
import java.util.*;

public class Main{

	static int N, K;
	static int [] dolls;
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = null;
		token = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(token.nextToken());
		K = Integer.parseInt(token.nextToken());
		
		dolls = new int[N];
		ArrayList<Lion> lion = new ArrayList<>();
		token = new StringTokenizer(br.readLine());
		int count = 0;
		for(int i = 0; i < N; i++) {
			dolls[i] = Integer.parseInt(token.nextToken());
			if(dolls[i] == 1)
				lion.add(new Lion(i, ++count));
		}
		int answer = Integer.MAX_VALUE;
		
		for(int i = 0; i <= lion.size()-K; i++) {
			int start = lion.get(i).idx;
			int end = lion.get(i+K-1).idx;
			answer = Math.min(answer, end-start);
		}
		if(answer == Integer.MAX_VALUE)
			System.out.println(-1);
		else
			System.out.println(answer+1);
		
	}

	static class Lion{
		int idx;
		int count;
		public Lion(int idx, int count) {
			this.idx = idx;
			this.count = count;
		}
	}
}

//투포인터 활용해서
//첫번째 인덱스부터 start, end 같이 움직이고
//1나오면 count 올리고
//count랑 라이언 개수랑 같을 때까지 end 옮기고
//같을 때 인덱스의 차이 계산해서 일단 answer로 넣고
//이젠 start 움직여서 라이언 나오면 count 하나 내리고 end 다음으로 또 움직여서 count랑 라이언 개수 같을 때까지 또 보고 
//그때의 인덱스 차이와 answer 중 작은거 또 answer로 만들고

//또다른 방법
//PrioirityQueue로 라이언 값을 정렬한 후 
// i번째부터 돌면서 +라이언 개수만큼의 인덱스 값 뽑아서
//answer 계산해보기 -> 투포인터 활용 없는데 어떤게 더 빠르고 효율적일지는 모르겠음