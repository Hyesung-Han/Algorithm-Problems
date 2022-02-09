package Backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2941_크로아티아알파벳 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int count = str.length();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(c == 'c') {
				if(i< str.length()-1 && (str.charAt(i+1) == '=' || str.charAt(i+1) == '-')) {
					i++;
					count--;
				}
			}else if(c == 'd') {
				if(i<str.length()-2 && str.charAt(i+1) == 'z' && str.charAt(i+2) == '=') {
					i= i+2;
					count = count-2;
				}else if(i<str.length()-1 && str.charAt(i+1) == '-') {
					i++;
					count--;
				}
			}else if(c == 'j') {
				if(i>0 && (str.charAt(i-1) == 'l' || str.charAt(i-1) == 'n')) {
					count--;
				}
			}else if(c == '=') {
				if(i>0 && (str.charAt(i-1) == 's' || str.charAt(i-1) == 'z')) {
					count--;
				}
			}
		}
		System.out.println(count);
		
	}

}
