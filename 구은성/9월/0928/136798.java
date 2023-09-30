class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i = 1; i <= number; i++) {
            int divCou = getDivCou(i);
            if (divCou > limit) {
                answer += power;
            }
            else {
                answer += divCou;
            }
        }
        
        return answer;
    }
    
    public int getDivCou(int num) {
        int cou = 0;
        
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (i == Math.sqrt(num)) {
                cou++;
            }
            else if (num % i == 0) {
                cou += 2;
            }
        }
        
        return cou;
    }
}