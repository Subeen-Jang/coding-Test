class Solution {
    public int solution(int chicken) {
        int answer = -1;
        int coupon = chicken;
        
        while(coupon >= 10){
            int service = coupon/10; 
            
            answer += service; 
            
            coupon = service + (coupon % 10); 
        }
        
        return answer+1;
    }
}
