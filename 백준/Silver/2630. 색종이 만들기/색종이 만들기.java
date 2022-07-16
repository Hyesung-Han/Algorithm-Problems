import java.util.Scanner;

public class Main {

	static int N;
	static int [][] map;
	static int W, B;
	
	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		
		N = scann.nextInt();
		map = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = scann.nextInt();
			}
		}
		W = 0;
		B = 0;
		color(0,0,N);

		System.out.println(W);
		System.out.println(B);
	}

	public static void color(int r, int c, int width) {
		if(width ==1 || sameColor(r,c,width)) {
			//로직
			if(map[r][c] == 0) {
				W++;
			}else if(map[r][c] == 1) {
				B++;
			}
			return;
		}
		int w = width/2;
		color(r,c,w);		//1
		color(r,c+w,w);		//3
		color(r+w,c,w);		//7
		color(r+w,c+w,w);	//5
		
	}

	public static boolean sameColor(int r, int c, int width) {
		// r,c,부터 포문돌려서 width까지 했을때 같은 색인지 로직짜기
		int temp = map[r][c];
		for (int i = r; i < r+width; i++) {
			for (int j = c; j < c+width; j++) {
				if(temp != map[i][j]) {
					return false;
				}
			}
		}
		
		return true;
	}

}
