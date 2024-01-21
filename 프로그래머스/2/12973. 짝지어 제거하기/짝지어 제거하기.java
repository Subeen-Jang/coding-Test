import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 1;
        
        Stack<Character> stack = new Stack<>();

         for (int i = 0; i < s.length(); i++) {
             char c = s.charAt(i);
             
             if (!stack.isEmpty() && c == stack.peek()) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        
        if(!stack.isEmpty()){
            answer = 0;
        }
        return answer;
    }
}