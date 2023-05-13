import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};
        int count = 0;
        int j=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                count++;
            } 
        }
        
        if(count !=0){
            answer = new int[count];
            for(int i=0;i<arr.length;i++){
                if(arr[i]%divisor==0){
                    answer[j] = arr[i];
                    j++;
                }
            }   
        }
        Arrays.sort(answer);
       
        return answer;
    }
}
  