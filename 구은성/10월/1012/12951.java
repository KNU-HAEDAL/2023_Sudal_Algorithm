import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(s.toLowerCase(), " ", true);
        
        while(st.hasMoreTokens()) {
            String word = st.nextToken();
            if(word.equals(" ")) {
                answer += word;
            }
            else {
                answer = answer + word.substring(0, 1).toUpperCase() + word.substring(1);
            }
        }
        
        return answer;
    }
}