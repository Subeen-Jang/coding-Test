import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
       List<Integer> arr = new ArrayList<Integer>();
        
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                int result = numbers[i] + numbers[j];
                arr.add(result);
            }
        }
        
        Set<Integer> set = new HashSet<Integer>(arr);
        List<Integer> newArr = new ArrayList<Integer>(set);
        
        Collections.sort(newArr);
        
        int[] answer = new int[newArr.size()];
        
        for(int i=0;i<newArr.size();i++){
            answer[i] = newArr.get(i).intValue();
        }
        
        return answer;
    }
}