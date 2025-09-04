package leetcode.Med;

import java.util.*;

public class Generate_Parentheses {
    List<String> answer = new ArrayList<>();
    
    public List<String> generateParenthesis(int n) {        
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        dfs(sb, 1, 1, n);
        return answer;
    }

    public void dfs(StringBuilder sb, int used, int depth, int n){
        if(used >= n){
            for(int i = 0; i < depth; i++){
                sb.append(")");
            }
            answer.add(sb.toString());
            sb.delete(sb.length() - depth,sb.length());
            return;
        }

        for(int i = 0; i < 2; i++){
            if(i == 0){
                if(depth < 0) continue;
                used += 1;
                depth += 1;
                dfs(sb.append("("), used, depth, n);
                used -= 1;
                depth -= 1;

                sb.delete(sb.length() - 1, sb.length());
            }else{
                if(depth < 0) continue;
                depth -= 1;
                dfs(sb.append(")"), used, depth, n);
                depth += 1;     

                sb.delete(sb.length() - 1, sb.length());          
            }
        }
    }
}
