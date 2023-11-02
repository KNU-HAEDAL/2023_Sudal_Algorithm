import java.util.*;

class Solution {
    public String solution(String[] seoul) {
        String answer;
        List<String> list = new ArrayList<>(Arrays.asList(seoul));
        
        answer = "김서방은 " + list.indexOf("Kim") + "에 있다";
        
        return answer;
    }
}