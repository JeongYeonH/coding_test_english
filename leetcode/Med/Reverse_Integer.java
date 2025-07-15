package leetcode.Med;

public class Reverse_Integer {
    public int reverse(int x) {
        double max_int = Math.pow(2, 31) - 1;
        double min_int = - Math.pow(2, 31);
        int reverse = 0;

        while(x != 0){
            if(reverse > max_int/10 || reverse < min_int/10) return 0;
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x /= 10;
        }

        return reverse;
    }
}
