import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        String answer;
        LocalDate input = LocalDate.of(2016, a, b);
        
        answer = input.getDayOfWeek().toString().substring(0, 3);
        
        return answer;
    }
}