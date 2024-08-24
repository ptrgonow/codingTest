import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
       
        List<Integer> li = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
             
                li.add(num_list[i]);
              
        }
        
        int[] result = new int[li.size()];
        
        for (int i = 0; i < li.size(); i++) {
            result[i] = li.get(i);
        }
        return result;
    }
}