import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        
        for(int num : array) {
            if(!hm.containsKey(num)) {
                hm.put(num, 1);
            } else {
                hm.replace(num, hm.get(num) + 1);
            }
        }
        
        Iterator<Map.Entry<Integer, Integer>> itr = hm.entrySet().iterator();
        int freq = -1;
        while(itr.hasNext()) {
            Map.Entry<Integer, Integer> entry = itr.next();
            if(entry.getValue() > freq) {
                freq = entry.getValue();
                answer = entry.getKey();
            } else if(entry.getValue() == freq) {
                answer = -1;
            }
        }
        return answer;
    }
}