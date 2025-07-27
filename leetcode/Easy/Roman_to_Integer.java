package leetcode.Easy;

public class Roman_to_Integer {
    public int romanToInt(String s) {
        String[] subStr = new String[] {"M", "CM", "D","CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] subInt = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int result = 0;
        int i = 0;
        
        while(i < s.length()){
            for(int j = 0; j < subStr.length; j++){
                String sub = subStr[j];
                if(i + sub.length() <= s.length() && s.substring(i, i + sub.length()).equals(sub)){
                    result +=subInt[j];
                    i += sub.length();
                    break;
                }
            }
        }
        return result;
    }
}
