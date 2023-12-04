import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer;
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scores = {0, 0, 0};
        
        for(int i = 0; i < answers.length; i++) {
            int testAnswer = answers[i];
            
            if(testAnswer == one[i % 5]) {
                scores[0]++;
            }
            
            if(testAnswer == two[i % 8]) {
                scores[1]++;
            }
            
            if(testAnswer == three[i % 10]) {
                scores[2]++;
            }
        }
        
        int max = Math.max(scores[0] , Math.max(scores[1], scores[2]));
        
        List<Integer> first = new ArrayList<>();
        
        for(int i = 0; i < scores.length; i++) {
            if(scores[i] == max) {
                first.add(i+1);
            }
        }
        
        answer = first.stream()
            .mapToInt(Integer::intValue)
            .toArray();
        
        return answer;
    }
}