class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++) {
            if(couDiv(i) % 2 == 0) {
                answer += i;
            }
            else {
                answer -= i;
            }
        }
        
        return answer;
    }
    
    public int couDiv(int num) {
        int cou = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cou++;
            }
        }
        return cou;
    }
}