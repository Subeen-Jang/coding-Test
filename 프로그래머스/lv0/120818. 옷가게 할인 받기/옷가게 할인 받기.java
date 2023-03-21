class Solution {
    public int solution(int price) {
        
        int answer=0;
        double rate=0.0;
        
        if(price<100000){
            rate=0;
        }else if(100000<=price&&price<300000){
            rate=0.05;
        }else if(300000<=price&&price<500000){
           rate=0.1;
        }else if(500000<=price&&price<=1000000){
            rate=0.2;
        }
        return (int)(price-(price*rate));
    }
}


