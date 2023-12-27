class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int count = 1;
        int person = 1;
        
        while(count < k){
            count++;
        
            person += 2;
            
            if(person > numbers.length){
                person = numbers.length % 2 == 0? 1: person % 2 +1 ;
            }
        }
        
       answer = person;
       
        return answer;
    }
}