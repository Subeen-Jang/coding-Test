import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero = 0;
        int min = 0;

        for (int num : lottos) {
            if (num == 0) {
                zero++;
            } else{
                for(int i=0;i<win_nums.length;i++){
                    if(num == win_nums[i]){
                        min++;
                    }
                }
            }
        }

        int max = min + zero;

        answer[0] = getRank(max);
        answer[1] = getRank(min);

        return answer;
    }

    private int getRank(int count) {
        switch (count) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }
}
