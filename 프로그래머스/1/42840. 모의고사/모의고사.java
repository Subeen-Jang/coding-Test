import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] result = new int[3];

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for(int i=0;i<answers.length;i++){
            if (answers[i] == a[i % a.length]) result[0]++;
            if (answers[i] == b[i % b.length]) result[1]++;
            if (answers[i] == c[i % c.length]) result[2]++;
        }
        
        int max = result[0]; 

        for (int i = 1; i < result.length; i++) {
            if (result[i] > max) {
                max = result[i];
            }
        }
        
        int count = 0;
        
        for(int i=0;i<result.length;i++){
            if(result[i] == max){
                count++;
            }
        }
        
        int[] answer = new int[count];
        
        int idx = 0;
        
         for (int i = 0; i < result.length; i++) {
            if (result[i] == max) {
                answer[idx++] = i + 1; 
            }
        }
    
        return answer;
    }
}