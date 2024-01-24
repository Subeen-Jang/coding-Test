class Solution{
    public int solution(int n, int a, int b){
        int answer = 0;
        
        int tmp = (int)(Math.log(n) / Math.log(2));
        int round = 1;
        
        while(round <= tmp){
            if((a % 2 == 0 && b == a - 1) || (a % 2 == 1 && b == a+1)){
                answer = round;
                break;
            }
            
            a = a%2 == 0? a/2 : a/2 + 1;
            b = b%2 == 0? b/2 : b/2 + 1;
            round++;
        }

        return answer;
    }
}