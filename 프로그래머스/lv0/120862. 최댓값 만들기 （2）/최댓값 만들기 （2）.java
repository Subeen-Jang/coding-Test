import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int len = numbers.length;
        
        Arrays.sort(numbers);
        
        int num1 = numbers[0]*numbers[1];
        int num2 = numbers[len-2]*numbers[len-1];
        
        int answer = Math.max(num1,num2);
          
        return answer;
    }
}