import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int al = arr.length;
        
        for (int i = 0; i < al; i++) {
            
            if (arr[i] < 50 && arr[i] % 2 == 1) {
                arr[i] *= 2;
                
            } else if (arr[i] >= 50 && arr[i] % 2 == 0) {
                arr[i] /= 2;
            }

        }
        
        return arr;
        
    }
}