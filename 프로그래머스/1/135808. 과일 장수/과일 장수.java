import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
       
        Integer[] nScore = Arrays.stream(score).boxed().toArray(Integer[]::new);

        Arrays.sort(nScore, Collections.reverseOrder());
       
        for(int i=0;i<=nScore.length-m;i+=m){
            int min = nScore[i+m-1];
            answer += min*m;
        }
        return answer;
    }
}

