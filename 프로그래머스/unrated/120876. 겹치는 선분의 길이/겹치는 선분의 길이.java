import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int count = 0;
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0;i<lines.length;i++){
            for(int j=lines[i][0]+1;j<=lines[i][1];j++){
                hm.put(j,hm.getOrDefault(j,0)+1);
            }
        }
        
        for(Integer i:hm.keySet()){
            if(hm.get(i) >= 2){
                count++;
            }
        }
        answer = count;
        return answer;
    }
}