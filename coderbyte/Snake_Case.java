package coderbyte;

public class Snake_Case {
    public static String SnakeCase(String str) {
        String answer = "";
        for(int i = 0; i < str.length(); i++){     
        String st = str.substring(i, i+1);
        String lower = st.toLowerCase();
            if(lower.matches("[a-zA-Z]+")){
                answer += lower;
            }else{
                answer += "_";
            }
        }  
        return answer;
    }
}
