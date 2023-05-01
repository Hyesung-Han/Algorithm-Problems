import java.io.*;
import java.util.*;

public class Main {
	
	static int [] nums;
	static int N;
	static long sum;
	static int maxCnt;
	static HashMap<Integer, Integer> cntMap;
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		cntMap = new HashMap<>();
		N = Integer.parseInt(br.readLine());
		
		nums = new int[N];
		
		for(int i = 0; i < N; i++) {
			int temp = Integer.parseInt(br.readLine());
			sum += temp;
			nums[i] = temp;
			cntMap.put(temp, cntMap.getOrDefault(temp, 0)+1);
			maxCnt = Math.max(maxCnt, cntMap.get(temp));
		}
		
		bw.write(String.valueOf(Math.round((double) sum/N))+"\n");
		Arrays.sort(nums);
		bw.write(String.valueOf(nums[N/2])+"\n");
		
		ArrayList<Integer> keyList = new ArrayList<>();
		for(Integer key : cntMap.keySet()) {
			if(cntMap.get(key) == maxCnt) 
				keyList.add(key);
		}
		
		Collections.sort(keyList);
		int thirdAnswer = 0;
		if(keyList.size() > 1)
			thirdAnswer = keyList.get(1);
		else thirdAnswer = keyList.get(0);
		
		bw.write(String.valueOf(thirdAnswer)+"\n");
		bw.write(String.valueOf(nums[N-1]-nums[0]));
		bw.close();
	}

}

/*
 * 1. 산술평균 : N개의 수들의 합을 N으로 나눈 값 : 소수점 이하 첫째자리에서 반올림
 * 2. 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
 * 3. 최빈값 : N개의 수들 중 가장 많이 나타나는 값 : 여러개면 두번째로 작은 값
 * 4. 범위 : N개의 수들 중 최댓값과 최솟값의 차이
 * 
 * 
 * 1 3 8 -2 2
 * 배열에 넣어서 정렬 -> 2, 4 해결
 * 들어오자마자 계산 -> 1 해결
 * HashMap -> 3 해결 or 배열 정렬 후 돌아다니면서 횟수 세어보면 됨
 * */
 