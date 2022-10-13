import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        
        Arrays.sort(arr);
        int n = arr.length;
        int ans = arr[n-1];
        while(true){
            boolean check = true;
            for(int i = n-2; i >= 0; i--){
                if(ans % arr[i] != 0){
                    check = false;
                    break;
                }
            }
            if(check){
                answer = ans;
                break;
            }else
                ans += arr[n-1];
        }
        
        
        return answer;
    }
}