class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
            
        answer[1] = denom1 * denom2;
        answer[0] = (answer[1]/denom1)*numer1 + (answer[1] /denom2)*numer2;
        
        int max = 1;
        int end = Math.min(answer[0],answer[1]);
        
        for(int i =2 ;i<=end;i++){
            if(answer[0]%i==0 && answer[1]%i==0){
                if(i>max){
                    max = i;
                }
            } 
        }
        
        answer[0] = answer[0] /max;
        answer[1] = answer[1] /max;
        
        return answer;
    }
}