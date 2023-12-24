class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        
        for(int i =0; i<code.length();i++){
            char c = code.charAt(i);
            
            if(mode == 0){
                if(c =='1'){
                    mode = 1;
                    continue;
                }else if(i % 2 == 0){
                    answer += c;  
                }
            }else{
                if(c == '1'){
                    mode = 0;
                    continue;
                }else if(i % 2 == 1){
                    answer += c;
                }
            }
        }
        
        if(answer.isEmpty()){
                return "EMPTY";
        }else{
            return answer;
        }
        
    }
}