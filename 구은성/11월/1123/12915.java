import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        for(int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].charAt(n) + strings[i];
        }
        
        List<String> list = Arrays.asList(strings);
        
        list.sort(Comparator.naturalOrder());
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }
        
        return answer;
    }
}