package leetcode.Med;

import java.util.*;

public class Integer_to_Roman {
        public String intToRoman(int num) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1000, "M");
        map.put(500, "D");
        map.put(100, "C");
        map.put(50, "L");
        map.put(10, "X");
        map.put(5, "V");
        map.put(1, "I");
        
        StringBuilder sb = new StringBuilder();
        int digits = 10;

        while(num > 0){
            int rest = num%digits;
            int temp = rest;
            StringBuilder ss = new StringBuilder();
            while(temp > 0){               
                for(Map.Entry<Integer, String> cases : map.entrySet()){
                    int key = cases.getKey();
                    if(key - (key/10) == temp && map.containsKey(key/10) && map.containsKey(key)){
                        ss.append(map.get(key/10));
                        ss.append(map.get(key));
                        temp = 0;
                        break;
                    }else if(key - (key/5) == temp && map.containsKey(key/5) && map.containsKey(key)){
                        ss.append(map.get(key/5));
                        ss.append(map.get(key));
                        temp = 0;
                        break;
                    }                   
                    if(key <= temp){
                        ss.append(map.get(key));
                        temp -= key;
                        break;
                    }
                }
            }
            sb.insert(0,ss);            
            num -= rest;
            digits *= 10;
        }
        return sb.toString();
    }
}
