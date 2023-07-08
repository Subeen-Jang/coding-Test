class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if((s.length()==4||s.length()==6)&&s.chars().allMatch(Character::isDigit)){
        answer = true;
    }else{
            answer = false;
        }
        return answer;
    }
}
