import java.util.*;

class Solution {
    static HashMap<String, Integer> city;
    static int count;
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        city = new HashMap<>();
        count = 0;
        if(cacheSize == 0) return cities.length * 5;
        
        for(int i = 0; i < cities.length; i++){
            cities[i] = cities[i].toUpperCase();
            boolean check = false;
            if(city.containsKey(cities[i])){
                answer += 1;
                check = true;
                city.put(cities[i], i);                
            } 
            else answer+= 5;
            if(city.size() == cacheSize && !check){
                del(cities);
            }
            city.put(cities[i], i);
        }
        
        return answer;
    }
    private static void del(String []cities){
        while(true){
            String c = cities[count];
            if(city.get(c) == count){
                city.remove(c);
                count++;
                break;
            }
            else count++;
        }
    }
}