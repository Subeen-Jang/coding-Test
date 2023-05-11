class Solution {
    public long solution(long n) {
        long answer = 0;
        double t = Math.sqrt(n);
        
        answer = t%1==0?(long)(Math.pow(t+1,2)):-1;
        
        
        return answer;
    }
}