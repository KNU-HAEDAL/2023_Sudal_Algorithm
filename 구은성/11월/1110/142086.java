import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if(!map.containsKey(ch)) {
                answer[i] = -1;
                map.put(ch, i);
            } else {
                answer[i] = i - map.get(ch);
                map.put(ch, i);
            }
        }
        
        return answer;
    }
}