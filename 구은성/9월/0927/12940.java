class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int temp;
        
        if(m > n) {
            temp = n;
            n = m;
            m = temp;
        }
        
        answer[0] = gcd(n, m);
        answer[1] = n * m / answer[0];
        
        return answer;
    }
    
    public int gcd(int n, int m) {
        if(m == 0) {
            return n;
        }
        else {
            return gcd(m, n%m);
        }        
    }
} 