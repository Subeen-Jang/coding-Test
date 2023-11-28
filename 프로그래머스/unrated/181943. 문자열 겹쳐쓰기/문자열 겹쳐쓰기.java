class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        String tmp = my_string.substring(s,s+overwrite_string.length());
        int end = s+overwrite_string.length()-1;
        int k = 0;
        
        for(int i=0;i<my_string.length();i++){
            if(i>=s&&i<=end){
                    answer += overwrite_string.charAt(k);
                    k++;
            }else{
                answer += my_string.charAt(i);
            }  
        }
        return answer;
    }
}