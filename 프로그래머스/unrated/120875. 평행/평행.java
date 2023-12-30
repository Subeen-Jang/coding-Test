class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        for (int i = 0; i < dots.length; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                int slopeX1 = dots[j][0] - dots[i][0];
                int slopeY1 = dots[j][1] - dots[i][1];

                for (int k = 0; k < dots.length; k++) {
                    if (k == i || k == j) {
                        continue;
                    }

                    for (int l = k + 1; l < dots.length; l++) {
                        if (l == i || l == j) {
                            continue;
                        }

                        int slopeX2 = dots[l][0] - dots[k][0];
                        int slopeY2 = dots[l][1] - dots[k][1];

                        if (slopeX1 * slopeY2 == slopeX2 * slopeY1) {
                            answer = 1;
                            return answer;
                        }
                    }
                }
            }
        }

        return answer;
    }
}
