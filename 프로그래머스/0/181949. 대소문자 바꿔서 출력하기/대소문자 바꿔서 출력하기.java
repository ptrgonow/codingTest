import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] chArray = new char[a.length()];
        
        for (int i = 0; i < a.length(); i++) {
            
            char ch = a.charAt(i);
            
            if (Character.isUpperCase(ch)) {
                chArray[i] = Character.toLowerCase(ch);
            } else {
                chArray[i] = Character.toUpperCase(ch);
            }
        }
        
        String result = new String(chArray);
        
        System.out.println(result);
    }
}