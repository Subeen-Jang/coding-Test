class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            int result = -1;
            
            for(int j=0;j<i;j++){
                if(s.charAt(j) == c){
                    result = i-j;
                }
            }   
             answer[i] = result;
        }
        return answer;
    }
}

