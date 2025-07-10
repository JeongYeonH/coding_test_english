package leetcode.Med;

public class Zigzag_Conversion {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        int length = s.length();
        boolean isDown = true;
        int level = 1;

        StringBuilder[] levels = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++){
            levels[i] = new StringBuilder(); 
        }

        for(int i = 1; i <= length; i++){
            levels[level-1].append(s.charAt(i-1));
            if(isDown){
                level++;
                if(level == numRows) isDown = false;
            }else{
                level--;
                if(level == 1) isDown = true;
            }
        }

        StringBuilder result = new StringBuilder();
        for(int i=0; i < numRows; i++){
            result.append(levels[i]);
        }
        return result.toString();
    }
}
