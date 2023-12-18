class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0],sides[1]);
        int min = Math.min(sides[0],sides[1]);

        int count = 0;
        int i = max - min + 1; 
        
        while(i <= max){
            count++;
            i++;
        }
        
        i = max+1;
        
        while(i< max + min){
            count++;
            i++;
        } 
        
        return count;
    }
}