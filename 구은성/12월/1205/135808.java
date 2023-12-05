import java.util.*;
import java.util.stream.Collectors;
import java.util.Collections;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        List<Integer> scoreList = Arrays.stream(score)
            .boxed()
            .collect(Collectors.toList());
        
        scoreList.sort(Comparator.naturalOrder());
        
        for(int i = scoreList.size(); i >= m; i -= m) {
            answer += m * scoreList.get(i - m);
        }
        
        return answer;
    }
}