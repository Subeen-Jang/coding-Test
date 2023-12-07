class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(String str : dic){
            int count = 0;
            for(String tmp : spell){
                if(str.contains(tmp)){
                    count++;
                }
            }
            
            if(count == spell.length){
                answer = 1;
                break;
            }
        }
      
        return answer;
    }
}