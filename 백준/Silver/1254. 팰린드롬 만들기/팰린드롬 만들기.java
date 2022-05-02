import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(solution(input));
    }

    static int solution(String input) {

        int len = input.length();
        for (int i = 0; i < len; i++) {
            if (isPalindrome(input.substring(i))) {
                return len+i;
            }
        }
        return len;
    }

    static boolean isPalindrome(String input) {

        int len = input.length();
        for (int i = 0; i < len/2; i++) {
            if (input.charAt(i) != input.charAt(len-i-1)) {
                return false;
            }
        }
        return true;
    }
}