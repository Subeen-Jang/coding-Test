class Solution {
    public int solution(int n) {
        int nCount = count(n);

        while (true) {
            n++;
            if (nCount == count(n)) {
                return n;
            }
        }
    }

    private int count(int num) {
        int count = 0;
        while (num > 0) {
            count += num % 2;
            num /= 2;
        }
        return count;
    }
}
