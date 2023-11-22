class Solution {
    public int solution(int[] arr) {
        int answer;
        int gcd = getGcd(arr[0], arr[1]);
        int lcm = (arr[0] * arr[1]) / gcd;
        
        for(int i = 2; i < arr.length; i++) {
            gcd = getGcd(lcm, arr[i]);
            lcm = (lcm * arr[i]) / gcd;
        }
        
        answer = lcm;
        
        return answer;
    }
    
    public int getGcd(int n, int m) {
        if(n % m == 0) {
            return m;
        }
        return getGcd(m, n%m);
    }
}