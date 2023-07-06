class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int i = left;
        int count = 0;
        
        while(i<=right){
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            
            if(count%2==0){
                answer += i;
            }else{
                answer -= i;
            }
            i++;
            count=0;
            
        }
        return answer;
    }
}