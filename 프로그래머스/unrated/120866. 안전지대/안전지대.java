class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[] dh = {-1,-1,-1,0,0,+1,+1,+1};
        int[] dw = {-1,0,+1,-1,+1,-1,0,+1};
        int count = 0; 
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                
                if(board[i][j] == 1){
                    count++;
                    int h = i;
                    int w = j;
                    
                    for(int k=0;k<8;k++){
                       int noSafeH = h + dh[k]; 
                        int noSafeW = w + dw[k];
                        
                        if(noSafeH >=0 && noSafeH < board.length && 
                           noSafeW >=0 && noSafeW < board[0].length && 
                           board[noSafeH][noSafeW] != 2 && board[noSafeH][noSafeW]!=1){
                            board[noSafeH][noSafeW] = 2;
                            count++;
                        }
                    }
                    
                }
                
            }
        }
        
        answer = board.length*board.length - count;
        return answer;
    
    }
}