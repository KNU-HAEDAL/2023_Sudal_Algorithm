import java.util.*;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> allSum = new ArrayList<>();
        
        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if(!allSum.contains(sum)) {
                    allSum.add(sum);
                }
            }
        }
        allSum.sort(Comparator.naturalOrder());
        
        answer = allSum.stream()
            .mapToInt(i->i)
            .toArray();
        
        return answer;
    }
}