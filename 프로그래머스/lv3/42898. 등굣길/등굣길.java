import java.util.*;
class Solution {
    static int [][] map;
    
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        
        map = new int[n][m];
        for(int i = 0; i < puddles.length; i++){
            int r = puddles[i][1]-1;
            int c = puddles[i][0]-1;
            map[r][c] = -1;
        }
        
        for(int i = 0; i < m; i++){
            if(map[0][i] == 0) 
                map[0][i] = 1;
            else break;
        }
        for(int i = 1; i < n; i++){
            if(map[i][0] == 0)
                map[i][0] = 1;
            else break;
        }
        
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                
                if(map[i][j] == -1) continue;
                
                if(map[i-1][j] > 0)
                    map[i][j] += map[i-1][j];
                map[i][j] %= 1000000007;
                
                if(map[i][j-1] > 0)
                    map[i][j] += map[i][j-1];
                
                map[i][j] %= 1000000007;
            }
        }
        return map[n-1][m-1];
    }
}