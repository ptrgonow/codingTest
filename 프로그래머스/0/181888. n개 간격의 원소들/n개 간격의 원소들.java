import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
      
        List<Integer> na = new ArrayList<>();
        
        for (int i = 0; i < num_list.length; i += n) {
                na.add(num_list[i]);
        }
        
        int[] result = new int[na.size()];
        
        for (int i = 0; i < na.size(); i++) {
            result[i] = na.get(i);
        }
        
        return result;
        
    }
}