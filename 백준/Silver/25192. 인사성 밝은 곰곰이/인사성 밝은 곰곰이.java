
import java.io.*;
import java.util.*;

public class Main {

	static int N; //들어오는 값의 횟수
	static int answer; //총 곰곰이모티콘 사용횟수
	static HashSet<String> user; //대화를 한 사용자들의 이름내역

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String ent = null;
		user = new HashSet<>();
		
		N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			ent = br.readLine();
			//ENTER값이 들어오면 해쉬셋 클리어(값 다 지우기)
			if(ent.equals("ENTER"))
				user.clear();

			//그 외의 값(사용자들의 이름)이 들어오면 해쉬셋에 있는지없는지 판별 후 없는 이름이면 카운트올리고 해쉬셋에 추가
			else {
				if(!user.contains(ent)) {
					user.add(ent);
					answer++;
				}
			}
			
		}
		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
		
		
	}

}
