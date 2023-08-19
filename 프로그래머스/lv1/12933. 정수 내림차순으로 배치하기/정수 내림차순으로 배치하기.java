import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        ArrayList<Long> list = new ArrayList<>();
        
        int len = (int)(Math.log10(n)+1);
        
        while(n>0){
            list.add(n%10);
            n = n/10;
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        for(int i=0;i<len;i++){
            double num = Math.pow(10,len-1-i);
            answer += list.get(i)*num;
        }
        
        return answer;
    }
}