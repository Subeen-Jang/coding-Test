import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0;i<array.length;i++){
            hm.put(array[i], hm.getOrDefault(array[i],0)+1);
        }
        
        for(int i:hm.keySet()){
            if(hm.get(i) > max){
                max = hm.get(i);
                answer = i;
            }else if(hm.get(i) == max){
                answer = -1;
            }
        }
        return answer;
    }
}