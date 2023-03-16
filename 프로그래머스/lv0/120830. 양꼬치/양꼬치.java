class Solution {
    public int solution(int n, int k) {
        int total = 0;
        int meat=12000;
        int bev=2000;
        
        if(n>=10){
        total=(meat*n)+(bev*k)-((n/10)*bev);
         }else{total=(meat*n)+(bev*k);}
        return total;
    }
}