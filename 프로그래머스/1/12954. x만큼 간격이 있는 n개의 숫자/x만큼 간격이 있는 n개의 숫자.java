class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long sum = 0;
        for(int i=0;i<n;i++){
                sum = (long) sum + x;
                answer[i] = (long)sum;
        }        
        return answer;
    }
}