class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int zero = 0;
      
        
        while(!s.equals("1")){
            zero += s.length() - s.replaceAll("0","").length();
            s = s.replaceAll("0","");
            count++;
            s = Integer.toBinaryString(s.length());
        }
        
        answer[0] = count;
        answer[1] = zero;
       
        return answer;
    }
}