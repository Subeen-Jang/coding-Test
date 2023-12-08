class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int maxX = board[0] / 2; 
        int maxY = board[1] / 2;
        
        for (String tmp : keyinput) {
            switch (tmp) {
                case "up":
                    answer[1] = Math.min(answer[1] + 1, maxY);
                    break;
                case "down":
                    answer[1] = Math.max(answer[1] - 1, -maxY);
                    break;
                case "right":
                    answer[0] = Math.min(answer[0] + 1, maxX);
                    break;
                case "left":
                    answer[0] = Math.max(answer[0] - 1, -maxX);
            }
        }
        return answer;
    }
}
