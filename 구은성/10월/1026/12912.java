class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if (a == b) {
            answer = a;
        }
        else {
            long num = Math.abs(b - a) + 1;
            answer = num * (a + b) / 2;
        }
        
        return answer;
    }
}