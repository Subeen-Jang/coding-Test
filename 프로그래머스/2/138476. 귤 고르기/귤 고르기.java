import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i:tangerine){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());
        
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        
        for(Map.Entry<Integer,Integer> entry : list){
            
            if(k > 0){
                k -= entry.getValue();
                answer++;
            }else{
                break;
            }
        }
        
        return answer;
    }
}