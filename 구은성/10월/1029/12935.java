import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        List<Integer> list = Arrays.stream(arr)
            .boxed()
            .collect(Collectors.toList());
        
        if(list.size() == 1) {
            answer = new int[1];
            answer[0] = -1;
        }
        else {
            int min = list.get(0);
            for(int num : arr) {
                min = Math.min(min, num);
            }
            list.remove(Integer.valueOf(min));
            answer = list.stream()
                .mapToInt(i -> i)
                .toArray();
        }
        
        return answer;
    }
}