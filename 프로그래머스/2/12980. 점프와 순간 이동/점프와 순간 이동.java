import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;

        String tmp = Integer.toBinaryString(n);
        
        for(int i=0;i<tmp.length();i++){
            char c = tmp.charAt(i);
            if(c == '1'){
                ans++;
            }
        }

        return ans;
    }
}