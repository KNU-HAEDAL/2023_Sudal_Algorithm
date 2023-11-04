import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        List<Integer> list = Arrays.stream(d)
            .boxed()
            .collect(Collectors.toList());
        
        list.sort(Comparator.naturalOrder());
        
        int sum = 0;
        for(int num : list) {
            sum += num;
            if (sum > budget) {
                break;
            }
            else {
                answer++;
            }
        }
        
        return answer;
    }
}