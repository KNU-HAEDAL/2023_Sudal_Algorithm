import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> completions = new HashMap<>();
        
        for(String name : completion) {
            if(completions.containsKey(name)) {
                completions.put(name, completions.get(name) + 1);
            } else {
                completions.put(name, 1);
            }
        }
        
        for(String name : participant) {
            if(!completions.containsKey(name)) {
                answer = name;
                break;
            } else {
                if(completions.get(name) >= 1) {
                    completions.put(name, completions.get(name) - 1);
                } else if(completions.get(name) < 1) {
                    answer = name;
                    break;
                }
            }
        }
        
        return answer;
    }
}