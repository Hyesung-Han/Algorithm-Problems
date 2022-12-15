import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        int Max = 0;
        int Min = 0;
        
        //우선순위큐를 이용하여 queue 적용
        PriorityQueue<Integer> que = new PriorityQueue<>();
        StringTokenizer token = null;
        for(int i = 0; i < operations.length; i++){
            
            token = new StringTokenizer(operations[i]);
            String ID = token.nextToken();
            int num = Integer.parseInt(token.nextToken());
            
            if(ID.equals("I")){
                que.add(num);
            }else if(ID.equals("D") && !que.isEmpty()){
                if(num == -1)
                    que.poll();
                
                else{
                    Queue<Integer> newQue = new LinkedList<>();
                    int size = que.size()-1;
                    for(int j = 0; j < size; j++){
                        newQue.add(que.poll());
                    }
                    
                    que.clear();
                    for(int no : newQue){
                        que.add(no);
                    }
                }
                    
            }
        }
        
        if(que.size() > 1){
            
            Min = que.poll();
            int size = que.size()-1;
            for(int i = 0; i < size; i++){
                que.poll();
            }
            Max = que.poll();
        }else if(que.size() == 1){
            Min = que.poll();
            Max = Min;
            
        }
        answer[0] = Max;
        answer[1] = Min;
        
        return answer;
    }
}