class Solution {
    public String solution(String s) {
        StringBuffer answer = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) && (i == 0 || s.charAt(i-1) == ' ')) {
                answer.append(Character.toUpperCase(s.charAt(i)));
            } else {
                answer.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        return answer.toString();
    }
}
