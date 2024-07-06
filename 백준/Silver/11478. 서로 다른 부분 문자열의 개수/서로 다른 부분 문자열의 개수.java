import java.io.*;
import java.util.*;

public class Main{

	static String S;
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		S = br.readLine();
		HashSet<String> word = new HashSet<>();
		
		//ababc
		
		for(int i = 0; i < S.length(); i++) {
			//한자리씩 옮겨가며 이동
			//각 자리에서 1~최대사이즈까지 늘리면서 해쉬셋에 넣을 예정
			for(int j = 1; j <= S.length()-i; j++) {
				word.add(S.substring(i, i+j));
				
			}
		}
		
		System.out.println(word.size());
		
	}

}
