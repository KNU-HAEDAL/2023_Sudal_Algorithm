class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if (isPrime(n - 1)) {
            answer = n - 1;
        }
        else {
            answer = minDivisor(n - 1);
        }
        
        return answer;
    }
    
    public boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public int minDivisor(int n) {
        int minDiv = n + 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0 && i < minDiv) {
                minDiv = i;
            }
        }
        return minDiv;
    }
}