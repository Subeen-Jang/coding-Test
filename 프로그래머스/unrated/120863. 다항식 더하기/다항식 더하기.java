class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] str = polynomial.split(" \\+ ");
        int count = 0;
        int num = 0;

        for (String tmp : str) {
            if (tmp.equals("x")) {
                count++;
            } else if (tmp.contains("x")) {
             count += tmp.contains("x") ? Integer.parseInt(tmp.substring(0, tmp.indexOf("x"))) : 1;
            } else if (tmp.matches(".*\\d.*")) {
                num += Integer.parseInt(tmp);
            }
        }

        if (count > 0) {
            answer += (count == 1) ? "x" : count + "x";
        }

        if (num > 0) {
            answer += (count > 0) ? " + " + num : String.valueOf(num);
        }

        return answer;
    }
}
