import java.util.*;
class Solution {
    public String solution(String s) {
        String answer;
        String[] charAtS = s.split("");
        List<String> list = new ArrayList<>(Arrays.asList(charAtS));
        
        list.sort(Comparator.reverseOrder());
        answer = String.join("", list);
        
        return answer;
    }
}