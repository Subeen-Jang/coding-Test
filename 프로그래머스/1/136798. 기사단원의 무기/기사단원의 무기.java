class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int count = 0;
        int range = 0;
        
        for(int i=1;i<=number;i++){
            count = 1; 
            range = i/2;
            for(int j=1;j<=range;j++){
                if(i%j == 0){
                    count++;
                }
            }
            if(count>limit){
                count = power;
            }
            answer += count;
        }
        
        return answer;
    }
}
