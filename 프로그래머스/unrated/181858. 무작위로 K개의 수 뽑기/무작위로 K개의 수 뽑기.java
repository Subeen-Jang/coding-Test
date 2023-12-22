import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer,-1);
        
       Set<Integer> hash = new LinkedHashSet<Integer>();
        
        for(int i: arr){
            hash.add(i);
        }
        
      
        Iterator<Integer> iter = hash.iterator();
        
          for (int i = 0; i < k && iter.hasNext(); i++) {
            answer[i] = iter.next();
        }
        
        return answer;
    }
}