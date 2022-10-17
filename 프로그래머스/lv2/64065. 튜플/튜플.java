import java.util.*;

class Solution {
    public int[] solution(String s) {
        int count = -1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '{') count++;
        }
        int[] answer = new int[count];
        HashMap<Integer, Integer> map = new HashMap<>();
        StringTokenizer token = new StringTokenizer(s, "{},");
        while(token.hasMoreTokens()){
            int num = Integer.parseInt(token.nextToken());
            if(map.containsKey(num))
                map.put(num, map.get(num)+1);
            else
                map.put(num, 1);
        }
        for(int i = 0; i < count; i++){
            for(int key : map.keySet()){
                int val = map.get(key);
                if(val == count-i){                    
                    answer[i] = key;
                    break;
                }
            }
        }
        return answer;
    }
}