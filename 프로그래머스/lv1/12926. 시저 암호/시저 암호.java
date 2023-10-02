class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0;i<s.length();i++){
          char c = s.charAt(i);
            if(c==' '){
                c = ' ';
            }else{
                if(c <= 'Z') {
                    c += n;
                    if(c > 'Z') {
                        c -= 26;
                    }
                } else {
                    c += n;
                    if(c > 'z') {
                        c -= 26;
                    }
                }  
            }
         answer += c;
        }
        return answer;
    }
}