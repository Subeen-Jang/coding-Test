import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> hm = new HashMap<>();
        
        for(int i=0;i<clothes.length;i++){
            String type = clothes[i][1];
            
            hm.put(type,(hm.getOrDefault(type,0)+1));
        }
        
          for (Map.Entry<String,Integer> entry:hm.entrySet()) {
            answer *= entry.getValue() + 1;
        }
        
        return answer - 1;
    }
}