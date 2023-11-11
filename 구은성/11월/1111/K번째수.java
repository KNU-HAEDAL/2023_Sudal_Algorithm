import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < commands.length; i++) {
            for(int j = commands[i][0]; j <= commands[i][1]; j++) {
                list.add(array[j-1]);
            }
            
            list.sort(Comparator.naturalOrder());
            answer[i] = list.get(commands[i][2] - 1);
            
            list.clear();
        }
        return answer;
    }
}