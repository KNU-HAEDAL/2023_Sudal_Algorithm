import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] num = String.valueOf(n).split("");
        String number = "";
        
        Arrays.sort(num, Collections.reverseOrder());
       
        for(String s : num) {
            number += s;
        }
        
        answer = Long.parseLong(number);
        
        return answer;
    }
}