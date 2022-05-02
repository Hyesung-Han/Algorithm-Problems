import java.io.*;

public class Main{

	static int result;
	static boolean palin_check;
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String palindrome = br.readLine();

		int last = palindrome.length();
		
		//i부터 끝까지 팰린드롬인지 검사
		//맞으면  총 길이 + i 
		for (int i = 0; i < last; i++) {
			String palin = palindrome.substring(i);
			if(check(palin)) {
				result = last+i;
//				palin_check = true;
				break;
			}
		}
//		if(!palin_check) result = last;
		
		System.out.println(result);
		
	}

	private static boolean check(String palin) {
		char [] sub_palin = palin.toCharArray();
		
		for(int i = 0; i < palin.length()/2; i++) {
			if(sub_palin[i] != sub_palin[palin.length()-1-i]) 
				return false;
		}
		
		return true;
	}
}
