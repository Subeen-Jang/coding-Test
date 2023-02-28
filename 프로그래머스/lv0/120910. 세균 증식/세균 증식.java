class Solution {
    public int solution(int n, int t) {
        int i=1;
        while(i<=t){
            n=n*2;
            i++;
        }
        return n;
    }
}