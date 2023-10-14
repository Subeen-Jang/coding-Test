class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];

        for(int i=0;i<arr1.length;i++){
            String str = Integer.toBinaryString(arr1[i]|arr2[i]);
            
             while (str.length() < n) {
                str = "0" + str;
            }

            answer[i] = "";
            
            for(int j=0;j<n;j++){
                if(str.charAt(j)=='1'){
                answer[i] += "#";
                }else{
                answer[i] +=" ";
                }
            }   
        }
        return answer;
    }
}