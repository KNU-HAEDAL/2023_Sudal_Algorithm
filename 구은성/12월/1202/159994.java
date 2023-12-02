import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer;
        Queue<String> words1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> words2 = new LinkedList<>(Arrays.asList(cards2));
        List<String> goalList = new ArrayList<>(Arrays.asList(goal));
        
        for(String word : goal) {
            String card1 = words1.peek();
            String card2 = words2.peek();
            if (word.equals(card1)) {
                words1.remove();
                goalList.remove(word);
            } else if (word.equals(card2)) {
                words2.remove();
                goalList.remove(word);
            }
        }
        
        if(!goalList.isEmpty()) {
            answer = "No";
        } else {
            answer = "Yes";
        }
        
        return answer;
    }
}