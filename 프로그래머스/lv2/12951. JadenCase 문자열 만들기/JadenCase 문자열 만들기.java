class Solution {
    public String solution(String s) {
        String answer = "";
        //싹다 소문자처리를 하고
        //공백을 기준으로 첫 글자가 알파벳이라면 그 글자만 대문자로 바꿔주기
        for(int i = 0; i < s.length(); i++){
            if(i == 0 || (s.charAt(i-1) == ' ' && s.charAt(i) != ' ')){
                if(s.charAt(i)-'0' >= 17 && s.charAt(i)-'0' <= 74){
                    answer += Character.toUpperCase(s.charAt(i));
                }else
                    answer += Character.toLowerCase(s.charAt(i));
            }else
                answer += Character.toLowerCase(s.charAt(i));
        }
        
        
        
        return answer;
    }
}