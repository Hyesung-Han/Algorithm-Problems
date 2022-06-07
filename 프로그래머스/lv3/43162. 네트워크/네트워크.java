import java.util.*;
//백준 상근이의 여행과 비슷한 문제

class Solution {
    
    static int answer;
    static boolean [] visited;
    static int N;
    
    public int solution(int n, int[][] computers) {
        N = n;
        visited = new boolean[n];

        for(int i = 0; i < n; i++){
            if(!visited[i]){
                answer++;
                dfs(i, answer, computers);
            }
        }
        //dfs돌려서 1번 컴퓨터부터 가보고 다른 곳 연결되어 있으면 큐에 넣기
        // dfs();
        
        return answer;
    }
    private void dfs(int s, int ans, int [][] map){
        
        for(int i = 0; i < N; i++){
            
            if(map[i][s] == 1 && !visited[i]){
                visited[i] = true;
                dfs(i, ans, map);            
            }
        }
        
    }
}