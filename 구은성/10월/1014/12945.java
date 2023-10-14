class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] fib = {0, 1};
        int temp = 0;
        
        for (int i = 2; i <= n; i++) {
            temp = fib[0] + fib[1];
            if(i % 2 == 0) {
                fib[0] = temp % 1234567;
            }
            else {
                fib[1] = temp % 1234567;
            }
                
        }
        
        if(n % 2 == 0) {
            answer = fib[0];
        }
        else {
            answer = fib[1];
        }
        
        return answer;
    }
}