import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        ArrayList<String> arr = new ArrayList<>();
        
        for(int i=0;i<strings.length;i++){
            arr.add(strings[i].substring(n,n+1));
        }
        
        Collections.sort(arr);

        Arrays.sort(strings);
        
        List<String> list = new ArrayList<>(Arrays.asList(strings));
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<list.size();j++){
                String a = list.get(j).substring(n,n+1);
                 if(a.equals(arr.get(i))){
                    answer[i] = list.get(j);
                    list.remove(list.get(j));
                    break;
                }
            }
        }
        return answer;
    }
}


