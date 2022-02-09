package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_규영이와인영이의카드게임 {

	
	static int T;
	static int[] p;
	static int[] gyu;
	static int[] in;
	static int win;
	static int lose;
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
		
			//규영이의 카드 경우와 종류를 배열에 저장
			//1~18까지중 규영이 배열에 없는 숫자만 골라 인영이의 배열에 넣기
			//인영이의 배열로 순열계산
			//규영이와 인영이의 배열을 비교하여 이긴 사람의 점수 올려주기-> 규영이와 인영이의 점수 저장할 변수 필요
			//한 순열에 대한 게임이 끝나면 점수비교하여 이긴 횟수에 추가 또는 진 횟수에 추가카운트 올리기
			boolean[] total = new boolean[18];
			gyu = new int[9];
			in = new int[9];
			
			String str = br.readLine();
			StringTokenizer tok = new StringTokenizer(str, " ");
			for (int i = 0; i < 9; i++) {
				gyu[i] = Integer.parseInt(tok.nextToken());
				total[gyu[i]-1] = true;
			}//규영이의 카드 경우와 종류를 배열에 저장 완료
			for (int i = 0, j=0; i < total.length; i++) {
				if(!total[i]) {
					in[j++] = i+1;
				}
			}//인영이의 배열 저장
			win = 0;
			lose = 0;
			perm(0,new boolean[9], new int[9]);
			System.out.println("#"+t+" "+ win + " " + lose);
		}
	
		
		
	}
	public static void perm(int cnt, boolean[] v, int[] nums) {
		
		if(cnt == 9) {
			int gsum = 0;
			int isum = 0;
			for (int i = 0; i < 9; i++) {
				if(nums[i]>gyu[i]) {
					isum+= (nums[i]+gyu[i]);
				}else {
					gsum+= (nums[i]+gyu[i]);
				}
			}
			if(gsum>isum) {
				win++;
			}else lose++;
			
			return;
		}
		
		for (int i = 0; i < 9; i++) {
			if(v[i]) continue;
			
			v[i] = true;
			nums[cnt] = in[i];
			perm(cnt+1, v, nums);
			v[i] = false;
			
		}
		
		
	}

	
	
	
}




