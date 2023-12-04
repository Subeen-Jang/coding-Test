class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] str = polynomial.split(" \\+ ");
        int count = 0;
        int num = 0;
        int tmp = 0;
        
        for(int i=0;i<str.length;i++){
            if(str[i].equals("x")){
                count++;
            }else if(str[i].contains("x")){
                for(int j=0;j<str[i].length();j++){
                    if(str[i].charAt(j) == 'x'){
                        tmp = j;
                        break;
                    }
                }
                count += Integer.parseInt(str[i].substring(0,tmp));
            }else if(str[i].matches(".*\\d.*")){
                num += Integer.parseInt(str[i]);
            }
        }
        
        if(num > 0 && count>0){
            answer = count + "x + " + num;
            if(count == 1){
                answer = "x + " + num;
            }
        }else if(num == 0){
            answer = count + "x";
            if(count == 1){
                answer = "x";
            }
        }else if(count == 0){
            answer = String.valueOf(num);
        }

        return answer;
    }
   
        
}