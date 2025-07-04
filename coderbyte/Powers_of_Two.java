package coderbyte;

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
}
