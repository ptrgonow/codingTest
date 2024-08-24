import java.util.*;

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        String p1 = my_string.substring(0, s);
        String p2 = my_string.substring(s + overwrite_string.length());
        
        System.out.println(p1 + " / " + p2);
        
        answer = p1 + overwrite_string + p2;
        
        return answer;
    }
}