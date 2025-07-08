package leetcode.Med;

import java.util.HashMap;
import java.util.Map;

public class Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        Map<String, Integer> map = new HashMap<>();
        int l = 0;
        int length = 0;
        for(int r=0; r < s.length(); r++){
            String str = s.substring(r, r+1);
            if(map.containsKey(str) && map.get(str) >= l){
                l = map.get(str) + 1;
            }else{
                length = Math.max(length, r - l + 1);
            }
            map.put(str, r);
        }

        return length;
    }
}
