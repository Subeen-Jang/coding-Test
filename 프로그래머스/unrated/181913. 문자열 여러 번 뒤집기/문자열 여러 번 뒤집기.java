class Solution {
    public String solution(String my_string, int[][] queries) {

        for (int i = 0; i < queries.length; i++) {
            
            int start = queries[i][0];
            int end = queries[i][1];

            StringBuilder sb = new StringBuilder(my_string.substring(start, end + 1));
            
            sb.reverse();
            
            String answer = "";

            answer += my_string.substring(0, start) + sb + my_string.substring(end + 1);
            
            my_string = answer;

        }

        return my_string;
    }
}
