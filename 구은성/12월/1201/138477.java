import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> answerList = new ArrayList<>();
        List<Integer> scores = new ArrayList<>();
        
        for(int i = 0; i < score.length; i++) {
            scores.add(score[i]);
            Collections.sort(scores, Collections.reverseOrder());
            if(i < k) {
                answerList.add(scores.get(scores.size() - 1));
            } else {
                answerList.add(scores.get(k - 1));
            }
        }
        
        int[] answer = answerList.stream()
            .mapToInt(i->i)
            .toArray();
        
        return answer;
    }
}