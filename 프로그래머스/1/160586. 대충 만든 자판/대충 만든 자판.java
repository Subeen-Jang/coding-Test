import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<keymap.length;i++){
            for(int j=0;j<keymap[i].length();j++){
                char c  = keymap[i].charAt(j);
                if(map.containsKey(c)){
                    int index = map.get(c);
                    map.put(c, Math.min(index, j + 1));
                }else{
                    map.put(c, j + 1);
                }
            }
        }
        
        for(int i=0;i<targets.length;i++){
            for(int j=0;j<targets[i].length();j++){
                char t = targets[i].charAt(j);
                if(map.containsKey(t)){
                    answer[i] += map.get(t);
                }else{
                    answer[i] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}