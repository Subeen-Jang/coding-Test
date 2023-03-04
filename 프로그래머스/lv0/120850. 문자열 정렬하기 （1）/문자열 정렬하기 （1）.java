import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        int count=0;
        int i=0;
        String str ="";
        
        for(char x : my_string.toCharArray()){
            if(Character.isDigit(x)){
                count++;
            }
        }
        
         answer = new int[count];
        
            for(char x : my_string.toCharArray()){
                if(Character.isDigit(x)){
                    answer[i] = x-48;
                    i++;
                }
            }
        Arrays.sort(answer);
        
        return answer;
    }
}