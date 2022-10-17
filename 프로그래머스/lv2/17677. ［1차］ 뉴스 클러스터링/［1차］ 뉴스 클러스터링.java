import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        
        HashMap<String, Integer> map1 = new HashMap<>();
        int count = 0;  
        
        HashMap<String, Integer> map2 = new HashMap<>();
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        for(int i = 0; i < str1.length()-1; i++){
            String s = str1.substring(i, i+2);
            if(!(s.charAt(0)-'A' >= 0 && s.charAt(0)-'Z'<=0 
               && s.charAt(1)-'A' >= 0 && s.charAt(1)-'Z'<=0)) continue;
            count++;
            if(map1.containsKey(s))
                map1.put(s, map1.get(s)+1);
            else map1.put(s, 1);
        }
        
        for(int i = 0; i < str2.length()-1; i++){
            String s = str2.substring(i, i+2);
            if(!(s.charAt(0)-'A' >= 0 && s.charAt(0)-'Z'<=0 
               && s.charAt(1)-'A' >= 0 && s.charAt(1)-'Z'<=0)) continue;
            count++;
            if(!map1.containsKey(s)) continue;
            if(map2.containsKey(s)) map2.put(s, map2.get(s)+1);
            else map2.put(s, 1);
            
        }
        int res = 0;
        for(String s2 : map2.keySet()){
            int m = Math.min(map2.get(s2), map1.get(s2));
            res += m;
            count -= m;
        }
        if(count == 0) return 65536;    
        int answer = res*65536/count;
        return answer;
    }
}