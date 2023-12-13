class Solution {
    public int solution(String A, String B) {
        int answer = 0; 
        int n = A.length();

        if (!(A.equals(B))) {
            for (int i = 1; i < n; i++) {
                String tmp = A.substring(n - i) + A.substring(0, n - i);
                if (tmp.equals(B)) {
                    answer = i;
                    break;
                }else{
                    answer = -1;
                }
            }
        }

        return answer;
    }
}
