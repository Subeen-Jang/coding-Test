class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for(String str:order){
            answer = str.contains("cafelatte")  ? answer + 5000 : answer + 4500;
        }
        return answer;
    }
}