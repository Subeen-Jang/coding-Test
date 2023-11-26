import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        
        if (before.length() != after.length()) {
            return 0;
        }
        
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for(int i=0;i<before.length();i++){
            char c = before.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        
         for(int i=0;i<after.length();i++){
            char c = after.charAt(i);
             if (!hm.containsKey(c) || hm.get(c) <= 0) {
                return 0;
            }
            hm.put(c, hm.get(c) - 1);
        }
        
        for(char c : hm.keySet()){
            if(hm.get(c)==-1){
                answer = 0;
                break;
            }
        }
        
        return answer;
    }
}