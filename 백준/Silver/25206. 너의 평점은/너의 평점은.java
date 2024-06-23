
import java.io.*;
import java.util.*;


public class Main{

	static double answer; //최종 학점((학점*등급)/과목학점의 총합) 소수점 6자리까지 반올림
	static String score; //등급(A+, A, B+, B...)
	static double num; //과목학점(1.0, 2.0, 3.0, 4.0)
	static double numSum;//과목학점의 총합(단, P 제외)
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer token = null;
		
		for(int i = 0; i < 20; i++) {
			token = new StringTokenizer(br.readLine());
			token.nextToken();//과목명 필요없으므로 버림
			num = Double.parseDouble(token.nextToken());
			
			score = token.nextToken();
			if(score != "P") {
				if(score.equals("A+")) {
					numSum += num;
					answer += num*4.5;
				}
				else if(score.equals("A0")) {
					numSum += num;
					answer += num*4.0;
				}
				else if(score.equals("B+")) {
					numSum += num;
					answer += num*3.5;
				}
				else if(score.equals("B0")) {
					numSum += num;
					answer += num*3.0;
				}
				else if(score.equals("C+")) {
					numSum += num;
					answer += num*2.5;
				}
				else if(score.equals("C0")) {
					numSum += num;
					answer += num*2.0;
				}
				else if(score.equals("D+")) {
					numSum += num;
					answer += num*1.5;
				}
				else if(score.equals("D0")) {
					numSum += num;
					answer += num*1.0;
				}
				else if(score.equals("F")) {
					numSum += num;
				}
			} 
			
		}
		
		answer = Math.round((answer/numSum)*1000000)/1000000.0;
		System.out.println(answer);
		
		
	}

}
