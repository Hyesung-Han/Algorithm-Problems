import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        // Stack<Character> stack = new Stack<>();
        // for(int i = 0; i < s.length(); i++)
        //     stack.push(s.charAt(i));
        if(s.charAt(0) == ')')
            answer = false;
        else{
            int cnt = 0;
            for(int i = s.length()-1; i >= 0; i--){
                if(s.charAt(i) == ')')
                    cnt++;
                else if(s.charAt(i) == '(' && cnt > 0)
                    cnt--;
                else {
                    answer = false;
                    break;
                }
            }
                
        }
        return answer;
    }
}