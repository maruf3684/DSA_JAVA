package DS_ALGO.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParen {
    public static void main(String[] args) {
        int n = 3;
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        generateParenthesis(n,0,0,ans,sb);
        System.out.println(ans);

    }

    public static void generateParenthesis(int n,int open,int close, List<String> ans,StringBuilder sb) {
        if(sb.length()==n+n){
            ans.add(sb.toString());
            return;
        }

        if (open < n) {
            sb.append("(");
            generateParenthesis(n, open + 1, close, ans,new StringBuilder(sb));
            sb.setLength(sb.length() - 1);
        }

        if (close < open) {
            sb.append(")");
            generateParenthesis(n, open, close + 1,ans,new StringBuilder(sb));
            sb.setLength(sb.length() - 1);
        }

    }
}

