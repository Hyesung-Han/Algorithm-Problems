import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        //어레이 내림차순 정렬하기 위해 생성
        int[] c = new int[citations.length];
        for(int i = c.length-1; i >= 0; i--){
            c[i] = citations[c.length-1-i];
        }
        int a = c[0];
        while(a >= 0){
            int count = 0;
            for(int i = 0; i < c.length; i++){
                if(a <= c[i])
                    count++;
            }
            System.out.println(a+" count : "+count);
            if(count >= a){
                answer = a;
                break;
            }
            a--;
        }
        return answer;
    }
}