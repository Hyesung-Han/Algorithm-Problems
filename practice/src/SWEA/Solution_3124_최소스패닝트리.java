package SWEA;

import java.io.*;
import java.util.*;

public class Solution_3124_최소스패닝트리 {

	static int T;//test case
	static int V, E ;//정점의 개수, 간선의 개수
	static int A, B, C;//각 간선과의 내용 A-> B, 가중치 C
	static PriorityQueue<Edge> que;
	static ArrayList<Edge> mst;
	static int[] p;
	
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			StringTokenizer token = new StringTokenizer(br.readLine(), " ");
			
			V = Integer.parseInt(token.nextToken());
			E = Integer.parseInt(token.nextToken());
			
			p = new int[V+1];
			
			que = new PriorityQueue<>(new Edgecomp());
			mst = new ArrayList<>();
			
			for (int i = 0; i < E; i++) {
				token = new StringTokenizer(br.readLine(), " ");
				A = Integer.parseInt(token.nextToken());
				B = Integer.parseInt(token.nextToken());
				C = Integer.parseInt(token.nextToken());
				que.add(new Edge(A,B,C));
			}
			
			for (int i = 1; i < V+1; i++) {
				p[i] = i;
			} //자기 자신을 일단 짱으로 만들고 유니온이랑 파인드 해결하기
			
			for (int i = 0; i < E; i++) {
				Edge e = que.poll();
				if(find(e.start) == find(e.end)) continue;
				//짱 같으면 나가고 그게 아니면 합쳐
				union(e.start, e.end);
				mst.add(e);
			}

			long result = 0;
			for (int i = 0; i < mst.size(); i++) {
				result = result + mst.get(i).value;
			}
			System.out.println("#"+t+" "+result);
		}
		
	}
	
	private static void union(int x, int y) {
		int px = find(x);
		int py = find(y);
		
		if(px != py) {
			p[px] = py;
		}else
			return;
	}

	private static int find(int x) {
		if(p[x] == x) return x;
		
		p[x] = find(p[x]);
		return p[x];
		
		
	}

	static class Edge{
		int start;
		int end;
		int value;
		public Edge(int start, int end, int value) {
			super();
			this.start = start;
			this.end = end;
			this.value = value;
		}
		
	}
	static class Edgecomp implements Comparator<Edge>{
		
		@Override
		public int compare(Edge o1, Edge o2) {
			return o1.value-o2.value;
		}
	}

}