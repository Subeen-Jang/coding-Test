class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ",-1);
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str[i].length();j++){
                if(j%2==0){
                    answer += Character.toUpperCase(str[i].charAt(j));
                }else{
                   answer +=  Character.toLowerCase(str[i].charAt(j));
                }
            }
            if(i<str.length-1){
                answer += " ";
            }
        }
        return answer;
    }
}