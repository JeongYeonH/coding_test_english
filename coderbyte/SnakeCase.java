package coderbyte;

import java.util.Scanner;

public class SnakeCase {
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

    public static void main (String[] args) {   
        Scanner s = new Scanner(System.in);
        System.out.print(SnakeCase(s.nextLine())); 
    }
}
