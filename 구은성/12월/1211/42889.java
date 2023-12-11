import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer;
        Map<Integer, Double> failureInfo = new HashMap<>();
        
        for(int i = 1; i <= N; i++) {
            int challenge = 0;
            int fail = 0;
            double failure;
            for(int j = 0; j < stages.length; j++) {
                if(stages[j] >= i) {
                    challenge++;
                    if(stages[j] == i) {
                        fail++;
                    }
                }
            }
            
            if(challenge == 0) {
                failure = 0;
            } else {
                failure = (double)fail / (double)challenge;
            }
            
            failureInfo.put(i, failure);
        }
        
        List<Integer> stage = new ArrayList<>(failureInfo.keySet());
        Collections.sort(stage, (o1, o2) -> Double.compare(failureInfo.get(o2), failureInfo.get(o1)));
        
        answer = stage.stream()
            .mapToInt(i -> i)
            .toArray();
        
        return answer;
    }
}