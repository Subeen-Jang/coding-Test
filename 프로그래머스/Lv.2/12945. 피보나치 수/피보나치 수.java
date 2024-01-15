class Solution {
    public int solution(int n) {
        int answer = 0;

        if(n==2){
            return 1;
        }
        
        int prv = 1 % 1234567;
        int cur = 1 % 1234567;
        
        for(int i=3;i<=n;i++){
            int tmp = prv % 1234567;
            prv = cur % 1234567;
            cur = (tmp + cur)% 1234567;
        }
             
        return cur % 1234567;
    }
}