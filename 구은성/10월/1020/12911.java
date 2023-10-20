class Solution {
    public int solution(int n) {
        int answer = 0;
        int numOfOneInN = binaryOne(n);
        
        while(true) {
            n++;
            int numOfOne = binaryOne(n);
            
            if(numOfOneInN == numOfOne) {
                answer = n;
                break;
            }
        }
        
        return answer;
    }
    
    public int binaryOne(int n) {
        int cnt = 0;
        while(n > 1) {
            if(n % 2 == 1) {
                cnt++;
            }
            n /= 2;
        }
        
        return cnt;
    }
}