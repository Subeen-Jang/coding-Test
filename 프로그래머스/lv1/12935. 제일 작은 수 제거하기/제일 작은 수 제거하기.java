import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        
        int[] temp = arr.clone();
        Arrays.sort(temp);
        
        if (arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[arr.length - 1];
            int min = temp[0];
            
            int k = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == min) {
                    continue;
                } else {
                    answer[k] = arr[i];
                    k++;
                }
            }
        }
        
        return answer;
    }
}
