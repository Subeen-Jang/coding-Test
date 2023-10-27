import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        List<String> list = new ArrayList<>();
        
        for(int i=1;i<food.length;i++){
            while(food[i]>=2){
                list.add(Integer.toString(i));
                food[i] = food[i]-2; 
            }
        }
        
        List<String> list2 = new ArrayList<>(list);
        Collections.reverse(list2);
        
        list.add("0");
        list.addAll(list2);

        answer = String.join("",list);

        return answer;
    }
}