import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;

        PriorityQueue<Integer> que = new PriorityQueue<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1,Integer o2){
                return o2-o1;
            }
        });
        
        for(int i = 0; i < works.length; i++)
            que.offer(works[i]);
        
        while(!que.isEmpty()){
            if(n == 0) break;
            int a = que.poll();
            if(a-1 > 0)
                que.offer(a-1);
            n--;
        }
        
        while(!que.isEmpty())
            answer += Math.pow(que.poll(), 2);
        
        return answer;
    }
}