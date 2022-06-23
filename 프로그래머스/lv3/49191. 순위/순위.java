import java.util.*;

class Solution {

    static int [][] map;
    
    public int solution(int n, int[][] results) {
        int answer = 0;
    
        map = new int [n][n];
        
        for(int i = 0; i < results.length; i++){
            int s = results[i][0] -1;
            int e = results[i][1] -1;

            map[s][e] = 1; //이기면 1
            map[e][s] = -1;//지면 -1
            
        }
        
        //map에 넣은 후 돌아가며, 0이 아닐 경우(승부를 봤을 경우), 다른 순위들 관련지어보기
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(map[i][j] == 1){
                    for(int k = 0; k < n; k++){
                        if(map[j][k] == 1)
                            map[i][k] = 1;
                    }
                }else if(map[i][j] == -1){
                    for(int k = 0; k < n; k++){
                        if(map[j][k] == -1)
                            map[i][k] = -1;
                    }
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(map[i][j] == 1){
                    for(int k = 0; k < n; k++){
                        if(map[j][k] == 1)
                            map[i][k] = 1;
                    }
                }else if(map[i][j] == -1){
                    for(int k = 0; k < n; k++){
                        if(map[j][k] == -1)
                            map[i][k] = -1;
                    }
                }
            }
        }
        
        
        
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(map[i][j] != 0)
                    count++;
            }
            if(count == n-1)
                answer++;
        }
        
        return answer;
    }
}