class Solution {
    public int solution(int a, int b) {
        
        int ra = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        
        int rb = 2 * a * b;
        
        
        return ra >= rb ? ra : rb; 
        
    }
}