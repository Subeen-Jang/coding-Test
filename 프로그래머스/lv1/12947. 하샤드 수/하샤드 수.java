class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0; 
        int t = x;
        while(t>=1){
            sum += t%10;
            t = t/10;
        }
        answer = x%sum==0?true:false; 
            
        return answer;
    }
}