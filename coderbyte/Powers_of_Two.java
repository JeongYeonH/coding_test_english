package coderbyte;

import java.util.Scanner;

public class Powers_of_Two {
    public static boolean PowersOfTwo(String num) {
        boolean isPow = false;
        int rest = Integer.parseInt(num);
        while(rest%2 == 0 && rest >2){
            rest = rest/2;
        }
        if(rest == 2) isPow = true;
        return isPow;
    }

    public static void main (String[] args) {  
        Scanner s = new Scanner(System.in);
        System.out.print(PowersOfTwo(s.nextLine())); 
    }
}
