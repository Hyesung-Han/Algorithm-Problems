import java.io.*;
import java.util.*;

class Solution {
    
    public int[] solution(int[] array, int[][] commands) throws IOException{
       int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++){
            int start = commands[i][0]-1;
            int end = commands[i][1]-1;
            int k = commands[i][2]-1;
            
            int[] nums = new int[end-start+1];

            for(int j = start, a = 0; j <= end; j++, a++){
                nums[a] = array[j];            
            }
            Arrays.sort(nums);
            answer[i] = nums[k];
        }
        
        
        return answer;
        
    }
}