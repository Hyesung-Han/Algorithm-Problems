import java.util.*;

class Solution {
    static long answer;
    public long solution(int w, int h) {
        answer = (long)w * h;
        long y1 = 0;
        double y2 = 0.0;
        if(w == h)
            return answer-w;
        for(long i = 1; i <= w; i++){
            y1 = (long)y2;
            y2 = (h*i/(double)w);
            // System.out.println("y2 : "+y2);
            long count = (long)(y2-y1);
            // System.out.println("count : " + count);
            // System.out.println(y2-y1);
            if(y2 % 1 != 0)
                count++;
            
            answer -= count;
        }
        
        return answer;
    }
}