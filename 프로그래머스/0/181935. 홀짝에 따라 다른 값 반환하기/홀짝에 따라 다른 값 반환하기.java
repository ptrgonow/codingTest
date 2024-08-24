class Solution {
    public int solution(int n) {
        
        int result = 0;
        
        // odd
        if (n % 2 == 1) {
            for (int i = 1; i <= n; i += 2) {
                result += i;
            }
            // even
        } else {
            for (int i = 2; i <= n; i += 2) {
                result += i * i;
            }
        }
    

        return result;
    }
}