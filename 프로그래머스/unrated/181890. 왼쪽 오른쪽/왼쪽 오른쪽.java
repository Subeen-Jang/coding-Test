import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer;

        int lIdx = Arrays.asList(str_list).indexOf("l");
        int rIdx = Arrays.asList(str_list).indexOf("r");


        if (str_list.length == 1) {
            return new String[0];
        }
        
        if (lIdx == -1 && rIdx == -1) {
            return new String[0];
        }

        if (lIdx < rIdx && lIdx != -1 || rIdx == -1) {
            answer = Arrays.copyOfRange(str_list, 0, lIdx);
        } else {
            answer = Arrays.copyOfRange(str_list, rIdx + 1, str_list.length);
        }
        return answer;
    }
}
