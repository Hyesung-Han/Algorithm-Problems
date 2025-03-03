
import java.io.*;
import java.util.*;

public class Main {

	static int N; //입력될 숫자의 개수
	static int [] num;

	static ArrayList<Integer> modNum; // 
	static ArrayList<Integer> ans;
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		
		num = new int[N];
		
		modNum = new ArrayList<>();
		ans = new ArrayList<>();
		
		for(int i = 0; i < N; i++) 
			num[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(num);
		
		int K = num[N-1]-num[0];
		
//		find(K);
		
		for(int i = 2; i <= Math.sqrt(K); i++) {
			if(K%i == 0) {
				modNum.add(i);
				if(K/i != i) modNum.add(K/i);
			}
		}
		
		modNum.add(K);
		
		for(int i = 0; i < modNum.size(); i++) {
			int mod = num[0] % modNum.get(i);
			for(int j = 1; j < N; j++) {
				if(mod != num[j]%modNum.get(i)) {
					mod = num[j]%modNum.get(i);
					break;
				}
			}
			if(mod == num[0] % modNum.get(i))
				ans.add(modNum.get(i));
		}
		
		Collections.sort(ans);
		
		for(int i = 0; i < ans.size(); i++)
			bw.write(ans.get(i)+" ");
		
		bw.flush();
		bw.close();
	}
	
//	private static void find(int K) {
//		
//		//굳이 여기서 정렬을 할 이유가 있을까
//		//맨 마지막에 답 나왔을 때 그때 정렬하기
//		
//		
//	}

}
