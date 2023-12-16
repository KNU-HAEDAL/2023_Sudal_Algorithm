import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> amount = new HashMap<>();
        
        for(int t : tangerine) {
            amount.put(t, amount.getOrDefault(t, 0) + 1);
        }
        
        List<Integer> list = new ArrayList<>(amount.keySet());
        Collections.sort(list, (o1, o2) -> Integer.compare(amount.get(o2), amount.get(o1)));
        
        int sum = 0;
        for(int i = 0; i < list.size(); i++) {
            if(sum >= k) {
                break;
            }
            sum += amount.get(list.get(i));
            answer++;
        }
        
        return answer;
    }
}