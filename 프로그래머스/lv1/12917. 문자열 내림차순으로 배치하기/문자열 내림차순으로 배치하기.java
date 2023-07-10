import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] crr = s.toCharArray();
        
        Arrays.sort(crr);
        
        StringBuilder sb = new StringBuilder(new String(crr));
        
        sb.reverse();
        
        answer = sb.toString();

        return answer;
    }
}