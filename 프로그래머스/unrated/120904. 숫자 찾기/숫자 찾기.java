class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String nStr = Integer.toString(num);
        String kStr = Integer.toString(k);
        
        answer = nStr.indexOf(kStr);
        
        if(answer!=-1){
            answer++;
        }
        
        return answer;
    }
}