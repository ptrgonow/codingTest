class Solution {
    public int solution(int a, int d, boolean[] included) {
      
        // 첫 항이 a이고 공차가 d인 등차수열 만들기
        // 조건 확인 (included[i]가 i + 1항을 의미한다 = i)
        // [0]부터 included.length 까지 true에 동치되는 배열의 숫자찾아서 더하기
        int sum = 0;
        
         for (int i = 0; i < included.length; i++) {
             if (included[i] == true) {
                 int intArr = a + (i * d);
                 sum += intArr;
             }
         }
        return sum;
    }
}