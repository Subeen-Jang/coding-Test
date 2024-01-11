import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str  = s.split(" ");
        
        int min = Integer.parseInt(str[0]);
        int max = Integer.parseInt(str[0]);
        
        for(int i = 1;i<str.length;i++){
            int tmp = Integer.parseInt(str[i]);
            
            if(tmp < min){
                min = tmp;
            }
            
            if(tmp > max){
                max = tmp;
            }
        }
        
        answer = String.valueOf(min) +" " + String.valueOf(max);
        return answer;
    }
}