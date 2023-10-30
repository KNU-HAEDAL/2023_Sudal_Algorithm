class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long totalPrice = count * (count + 1) / 2L * price;
        
        long amount = totalPrice - money;
        
        if (amount <= 0) {
            answer = 0;
        } else {
            answer = amount;
        }
        
        return answer;
    }
}