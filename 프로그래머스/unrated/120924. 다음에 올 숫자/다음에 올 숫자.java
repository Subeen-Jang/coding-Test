class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int a = common[0];
        int b = common[1];
        int c = common[2];
        
        if(c - b == b - a){
            answer = common[common.length-1] + (c-b);
        }else if(c % b ==  0 && b % a == 0){
            answer = common[common.length-1] * (c / b);
        }
        
        return answer;
    }
}