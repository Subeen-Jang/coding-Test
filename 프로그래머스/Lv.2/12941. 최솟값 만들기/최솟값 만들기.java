import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
       
        int aIdx = 0;
        int bIdx = B.length - 1;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        while(aIdx < A.length){
            answer += A[aIdx] * B[bIdx];
            aIdx++;
            bIdx--;
        }
        return answer;
    }
}