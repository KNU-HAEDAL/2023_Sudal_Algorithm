class Solution {
    public int solution(long num) {
        int answer = 0;
        
        if (num == 1) {
            answer = 0;
        }
        else {
            answer = collatz(num, 0);
        }
        return answer;
    }
    
    public int collatz(long num, int cnt) {
        if (num % 2 == 0) {
            num = num / 2;
        }
        else {
            num = num * 3 + 1;
        }
        
        cnt++;
        
        if (num == 1){
            return cnt;
        }
        else if (cnt >= 500) {
            return -1;
        }
        else {
            return collatz(num, cnt);
        }
    }
}