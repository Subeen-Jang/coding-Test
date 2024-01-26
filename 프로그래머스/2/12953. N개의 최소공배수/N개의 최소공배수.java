import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 1;

        Arrays.sort(arr);
        
        for(int i=1;i<arr.length;i++){
            int gcd = GCD(answer, arr[i]);
            answer *= arr[i] / gcd;
        }
     
        return answer;
    }
    
    public int GCD(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
