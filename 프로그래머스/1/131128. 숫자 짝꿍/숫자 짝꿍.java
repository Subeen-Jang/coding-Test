import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        
        char[] xChar = X.toCharArray();
        char[] yChar = Y.toCharArray();
        List<Character> list = new ArrayList<>();
        
        Arrays.sort(xChar);
        Arrays.sort(yChar);
        
        int x = 0;
        int y = 0;
        
        while(x < xChar.length && y < yChar.length){
            if(xChar[x]>yChar[y]){
                y++;
            }else if(xChar[x]==yChar[y]){
                 list.add(xChar[x]);
                x++;
                y++;
            }else{
                x++;
            }
            
        }
      
        if (list.isEmpty()) {
            return "-1";
        } 
        
          
        boolean zeros = true;
        for (char ch : list) {
            if (ch != '0') {
                zeros = false;
                break;
            }
        }
        
        
        if (zeros) {
            return "0";
        } 
                
        for (int i = list.size() - 1; i > -1; i--) {
                     answer.append(list.get(i));
        }
            
        return answer.toString();
    }
}