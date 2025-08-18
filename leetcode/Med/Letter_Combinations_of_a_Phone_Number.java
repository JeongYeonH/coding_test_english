package leetcode.Med;

import java.util.*;

public class Letter_Combinations_of_a_Phone_Number {
    Map<String, String[]> map = new HashMap<>();
    List<String> answer = new ArrayList<>(); 
    
    public List<String> letterCombinations(String digits) {              
        map.put("2", new String[] {"a", "b", "c"});
        map.put("3", new String[] {"d", "e", "f"});
        map.put("4", new String[] {"g", "h", "i"});
        map.put("5", new String[] {"j", "k", "l"});
        map.put("6", new String[] {"m", "n", "o"});
        map.put("7", new String[] {"p", "q", "r", "s"});
        map.put("8", new String[] {"t", "u", "v"});
        map.put("9", new String[] {"w", "x", "y", "z"});

        List<String[]> proto = new ArrayList<>();
        for(int i = 0; i < digits.length(); i++){
            String str = digits.substring(i, i + 1);
            String[] arr = map.get(str);
            proto.add(arr);
        }

        calculate(proto, 0, "");
        return answer;
    }

    public void calculate(List<String[]> proto, int row, String arr){
        if(row >= proto.size()){
            if(!arr.equals("")){
                answer.add(arr);
            }
            return;
        }

        for(int i = 0; i < proto.get(row).length; i++){
            String[] strArr = proto.get(row);
            arr += strArr[i];
            row += 1;
            
            calculate(proto, row, arr);
            
            arr = arr.substring(0, arr.length()-1);
            row -= 1;
        }
    }
}
