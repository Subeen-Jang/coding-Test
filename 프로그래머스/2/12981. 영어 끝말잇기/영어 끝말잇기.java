import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        
        HashSet<String> check = new HashSet<>();
        check.add(words[0]);

        for(int i=1;i<words.length;i++){
            char c1 = words[i].charAt(0);
            char c2 = words[i-1].charAt(words[i-1].length()-1);
            
            if(c1 !=c2 || check.contains(words[i])){
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }else{
                check.add(words[i]);
            }
        }
    
        return answer;
    }
}