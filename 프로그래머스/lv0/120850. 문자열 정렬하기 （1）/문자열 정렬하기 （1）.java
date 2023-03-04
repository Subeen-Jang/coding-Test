import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        int count=0;
        int i=0;
        String str ="";
        
        
        /* 아래 코드 이렇게도 변경 가능!(다른 사람 풀이 참고)
        my_string = my_string.replacAll("[a-z]","");
        answer = new int[my_string.length()];
        
        for(int i=0; i<my_string.length();i++)){
            answer[i] = my_string.charAt(i)-'0';
         }
        */
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
