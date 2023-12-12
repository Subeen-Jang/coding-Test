class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int midNum = total / num;
        
        if(num % 2 == 0){
            answer[0] = midNum - (num / 2) + 1;
            for(int i = 1;i<answer.length;i++){
                answer[i] = answer[i-1] + 1;
            }
        }else{
            answer[0] = midNum - (num / 2);
            for(int i = 1;i<answer.length;i++){
                answer[i] = answer[i-1] + 1;
            }
                
        }
        
        return answer;
    }
}