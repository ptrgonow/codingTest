class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        // 모두 같
        // a == b && b == c
        
        // 모두 다
        // a != b && a != c && b != c 
        
        // 두개 같 하나 다른
        // (a == b && b != c) || (a == c && b != c) || (b == c && a != b)

        
        
        
        
        if (a == b && b == c) {
            answer = (a + a + a) * ((b * b) + (b * b) + (b * b)) * ((c * c * c) + (c * c * c) + (c * c * c));
        } else if (a != b && a != c && b != c) {
            answer = a + b + c;
        } else if ((a == b && b != c) || (a == c && b != c) || (b == c && a != b)) {
            answer = (a + b + c) * ((a * a) + (b * b) + (c * c));
        }

        return answer;
    }
}