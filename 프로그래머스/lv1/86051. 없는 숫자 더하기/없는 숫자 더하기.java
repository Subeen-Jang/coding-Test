class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
       
        for(int n : numbers){
            answer += n;
        }
        
        return 44-answer;
    }
}