


import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
       List<Integer> arr = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>(arr);
        
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        int[] answer = new int[set.size()];
        
        Iterator iter = set.iterator();	
        while(iter.hasNext()) {
            arr.add((Integer)iter.next());
        }
        
        Collections.sort(arr);
        
        for(int i=0;i<arr.size();i++){
            answer[i] = arr.get(i).intValue();
        }
        return answer;
    }
}