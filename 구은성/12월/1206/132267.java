class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a) {
            int get = n / a * b;
            int remain = n % a; 
            
            answer += get;
            n = get + remain;
        }
        
        return answer;
    }
}