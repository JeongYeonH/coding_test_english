package leetcode.Med;

public class String_to_Integer {
    public int myAtoi(String s) {
        StringBuilder sb = new StringBuilder();
        boolean digitStarted = false;

        for(int i = 0; i < s.length(); i++){
            String str = s.substring(i, i+1);
            
            if(!digitStarted && str.equals(" ")) continue;
            if(!digitStarted){
                if(str.equals("+") || str.equals("-")){
                    sb.append(str);
                    digitStarted = true;
                    continue;
                }
            }
            if(!digitStarted && !str.matches("^[0-9]*$")) return 0;
            if(!digitStarted && str.matches("^[0-9]*$")){
                digitStarted = true;
            } 

            if(digitStarted){
                if(str.matches("^[0-9]*$")){
                    sb.append(str);
                }else{
                    break;
                }
            }
        }
        String answer = sb.toString();
        answer = answer.replaceFirst("^([+-]?)0+", "$1");
        if(answer.equals("+") || answer.equals("-") || answer.isEmpty()) return 0;
        
        if(answer.length() > 11){
            return answer.startsWith("-") ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }else if( answer.length() == 11){
            if (answer.startsWith("-")) {
                if (answer.compareTo("-2147483648") > 0) {
                    return Integer.MIN_VALUE;
                }
            } else {
                if (answer.compareTo("2147483647") > 0) {
                    return Integer.MAX_VALUE;
                }
            }
        }
                
        long num = Long.parseLong(answer);

        if (num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int) num;
    }
}
