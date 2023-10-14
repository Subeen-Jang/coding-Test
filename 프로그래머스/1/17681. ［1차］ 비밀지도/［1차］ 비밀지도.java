import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        String[] result = new String[arr1.length];
        
        for(int i=0;i<arr1.length;i++){
            
            result[i] = String.format("%0"+n+"d",Long.parseLong(Integer.toBinaryString(arr1[i] | arr2[i])));

            answer[i] = "";
            
            for(int j=0;j<result[i].length();j++){
                if(result[i].charAt(j)=='1'){
                answer[i] += "#";
                }else{
                answer[i] +=" ";
                }
            }   
        }
        return answer;
    }
}