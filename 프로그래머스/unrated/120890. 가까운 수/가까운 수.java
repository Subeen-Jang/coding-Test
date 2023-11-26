class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 100;
        
        for(int i:array){
            int tmp = Math.abs(n-i);
            if(tmp<min){
                min = tmp;
                answer = i;
            }else if(tmp==min){
                answer = Math.min(answer, i);
            }
        }
        return answer;
    }
}