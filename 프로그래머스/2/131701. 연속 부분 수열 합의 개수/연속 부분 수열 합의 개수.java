import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int len = elements.length;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < elements.length; i++) {
            int sum = elements[i];
            set.add(sum);

            for (int j = i + 1; j < i + len; j++) {
                sum += elements[j % len];
                set.add(sum);
            }
        }

        return set.size();
    }
}
