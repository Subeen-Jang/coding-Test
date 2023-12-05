class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0;i<quiz.length;i++){
            
            String[] str = quiz[i].split(" ");
            
            int  x = Integer.parseInt(str[0]);
            int  y = Integer.parseInt(str[2]);
            
            int  result = str[1].equals("-")? x - y : x + y;
            
            answer[i] = result == Integer.parseInt(str[4])? "O":"X";
        }
        return answer;
    }
}