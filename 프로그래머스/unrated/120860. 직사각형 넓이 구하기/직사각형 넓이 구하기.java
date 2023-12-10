class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int w = 0;
        int h = 0;
        
        for(int i=0;i<dots.length-1;i++){
           int wTmp = Math.abs(Math.max(dots[i][0],dots[i+1][0]) - Math.min(dots[i][0],dots[i+1][0])) ;
            int hTmp = Math.abs(Math.max(dots[i][1],dots[i+1][1]) - Math.min(dots[i][1],dots[i+1][1])) ;
            
            if(w < wTmp){
                w = wTmp;
            }
            
            if(h < hTmp){
                h = hTmp;
            }
        }

       
        
        return w * h;
    }
}