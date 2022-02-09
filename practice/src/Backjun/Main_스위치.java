package Backjun;

import java.util.Scanner;

public class Main_스위치 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] sw = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			sw[i] = in.nextInt();
		}
		
		int student = in.nextInt();
		
		for (int i = 1; i <= student; i++) {
			int gender = in.nextInt();
			int num = in.nextInt();
			// 성별 비교
			if (gender == 1) {
				// 남자면 배수 바꾸기
				for (int j = num; j <= N; j += num) {
					sw[j] ^= 1;
				}
				
			} else if (gender == 2) {
				// 일단 자기 바꿔
				sw[num] ^= 1;
				// 여자면 대칭 비교하고 바꾸기
				int left = num - 1;
				int right = num + 1;
//            //범위 밖으로 나가면 break
				if (left < 1 || right > N)
					break;// 범위.. 헷갈림..
				// 좌우 다르면 break
				if (sw[left] != sw[right])
					break;
				// 대칭이면~바꾼다
				// 위에 다 아닌 경우는 대칭이니깐~
				while (true) {
					if(sw[left] == sw[right]) {

						sw[left] ^= 1;
						left--;
						sw[right] ^= 1;
						right++;
						
//               //범위 밖으로 나가면 break
						if (left < 1 || right > N)
							break;// 범위.. 헷갈림..
						// 좌우 다르면 break
						if (sw[left] != sw[right])
							break;
					}

				}

			}
		}
		for (int i = 1; i <= N; i++) {
			System.out.print(sw[i] + " ");
			if (i % 20 == 0)
				System.out.println();
		}

		in.close();
	}
}
