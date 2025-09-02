package leetcode.Easy;

import java.util.*;

public class Valid_Parentheses {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        
        Map<String, String> map = new HashMap<>();
        map.put(")", "(");
        map.put("}", "{");
        map.put("]", "[");
        
        for(int i = 0; i < s.length(); i++){
            String str = s.substring(i, i + 1);
            if(map.containsKey(str)){
                String match = map.get(str);
                
                if(stack.isEmpty()) return false;
                String onTheTop = stack.peek();

                if(!onTheTop.equals(match)) return false;
                stack.pop();
            }else{
                stack.add(str);
            }

        }
        
        if(stack.isEmpty()) return true;
        else return false;
    }
}
