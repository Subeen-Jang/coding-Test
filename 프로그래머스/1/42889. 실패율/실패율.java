import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];                                                                                 
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i =1;i<=N;i++){
            hm.put(i,0);
        }
        
        for(int i:stages){
            if(i>N){
                continue;
            }
             hm.put(i, hm.getOrDefault(i,0)+1);
        }
        
        int person = stages.length;
        HashMap<Integer,Double> hash = new HashMap<>();
        
        for(int i:hm.keySet()){
            double result;
            
            if (person != 0) {
                result = (double) hm.get(i) / person;
            } else {
                result = 0.0;
            }
            hash.put(i,result);    
            person -= hm.get(i); 
        }
        
        List<Map.Entry<Integer, Double>> list = new ArrayList<>(hash.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        int idx = 0;
        for (Map.Entry<Integer, Double> entry : list) {
            answer[idx++] = entry.getKey();
        }
        
        return answer;
    }
}