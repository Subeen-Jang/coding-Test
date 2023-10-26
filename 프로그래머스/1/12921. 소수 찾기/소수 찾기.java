class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] result = new int[1000000];
        
        for(int i=2;i<=n;i++){
            result[i] = i; 
        }
        
        for(int i=2;i<=n;i++){
            for(int j=i*2;j<=n;j+=i){
                if(result[i] == 0){
                    continue;
                }else{
                    result[j] = 0;
                }
            }
        }
        
        for(int i=2;i<=n;i++){
            if(result[i]!=0){
                answer++;
            }
        }
        return answer;
    }
}