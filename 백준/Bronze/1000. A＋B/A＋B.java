import java.io.*;

public class Main{

	static int A, B;
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        String [] str = br.readLine().split(" ");
        A = Integer.parseInt(str[0]);
        B = Integer.parseInt(str[1]);
		System.out.println(A+B);
	}

}