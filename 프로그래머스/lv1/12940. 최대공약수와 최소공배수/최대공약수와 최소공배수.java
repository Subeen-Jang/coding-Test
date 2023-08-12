class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcm = 0; //최대공약수
        int lcm = 0;  //최소공약수
        
        for(int i=1; i<=m;i++){
            if(n%i==0&&m%i==0){
                gcm = i;
            }               
        }
        
        lcm = (n*m)/gcm;
        
        answer[0] = gcm;
        answer[1] = lcm;
        
        return answer;
    }
}