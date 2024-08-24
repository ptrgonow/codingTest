class Solution {
    public int solution(int a, int b) {

        
        String sa = String.valueOf(a);
        String sb = String.valueOf(b);
        
        String abSum = sa + sb;
        String baSum = sb + sa;
        
        int ab = Integer.parseInt(abSum);
        int ba = Integer.parseInt(baSum);

        return ab >= ba ? ab : ba;
    }
}