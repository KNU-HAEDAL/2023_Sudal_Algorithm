import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String[] num = Integer.toString(n).split("");
        
        for(int i = 0; i < num.length; i++) {
            int temp = Integer.parseInt(num[i]);
            
            answer += temp;
        }

        return answer;
    }
}