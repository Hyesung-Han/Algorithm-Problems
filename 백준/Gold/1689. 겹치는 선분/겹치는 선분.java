import java.io.*;
import java.util.*;

public class Main {

	static int N;
	static ArrayList<LineNum> line;
	static int answer = Integer.MIN_VALUE;
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		StringTokenizer token;
		line = new ArrayList<>();
//		int Max = Integer.MIN_VALUE;
//		int Min = Integer.MAX_VALUE;
		for(int i = 0; i < N; i++) {
			token = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(token.nextToken());
			int e = Integer.parseInt(token.nextToken());
			
			line.add(new LineNum(s,1));
			line.add(new LineNum(e,-1));
//			Min = Math.min(Min, s);
//			Max = Math.max(Max, e);
		}
		Collections.sort(line);
		int count = 0;
		for(int i = 0; i < line.size(); i++) {
			count += line.get(i).value;
//			if(line.get(i).value == 1) {
//				count++;
			answer = Math.max(answer, count);
//			}else
//				count--;
		}
		
		bw.write(String.valueOf(answer));
		bw.close();
		
	}

}
class LineNum implements Comparable<LineNum>{
	int num;
	int value;
	public LineNum(int num, int value) {
		super();
		this.num = num;
		this.value = value;
	}
	@Override
	public int compareTo(LineNum o) {
		int first = this.num - o.num;
		if(first == 0) return this.value - o.value;
		return first;
	}
}
