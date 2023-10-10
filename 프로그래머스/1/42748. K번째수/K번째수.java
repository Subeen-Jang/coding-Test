import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];
  
        for(int i=0;i<commands.length;i++){
            int start = commands[i][0]-1;
            int end = commands[i][1];
            int k = commands[i][2];
            
            int[] temp = new int[end - start]; 
            
            for(int j = start;j < end;j++){
                temp[j - start] = array[j];
            }
            
            Arrays.sort(temp);        
            answer [i] = temp[k-1];
        }
        
        return answer;
    }
}