import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] students = new int[n];
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        Arrays.fill(students,1);
        
        for(int i:lost){
              students[i-1] -= 1;
        }
        
        for(int i:reserve){
            students[i-1] += 1;
        }
        
        
        for(int i=0;i<students.length;i++){
            if(students[i] == 0){
                if(i>0 && students[i-1] ==2){
                    students[i] += 1;
                    students[i-1] -= 1;
                }else if(i<students.length-1 && students[i+1] ==2){
                    students[i] += 1;
                    students[i+1] -= 1;
                }
            }
        }
        
        
        for(int i:students){
            if(i!=0){
               answer ++; 
            }
        }
            
        return answer;
    }
}