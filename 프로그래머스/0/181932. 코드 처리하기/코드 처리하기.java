class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;
        
        for (int idx = 0; idx < code.length(); idx++) {
            
            char currentChar = code.charAt(idx);
            
            // 조건 1 mode 0
            if (mode == 0) {
                if (currentChar != '1' && idx % 2 == 0) {
                     ret.append(currentChar);
                    // 모드 변경
                } else if (currentChar == '1') {
                    mode = 1;
                }
                // 조건 2 mode 1
            } else {
                 if (currentChar != '1' && idx % 2 == 1) {
                     ret.append(currentChar);
                     // 모드 변경
                 } else if (currentChar == '1') {
                     mode = 0;
                 }
            }
        }
        
        return ret.length() == 0 ? "EMPTY" : ret.toString();
    }
}