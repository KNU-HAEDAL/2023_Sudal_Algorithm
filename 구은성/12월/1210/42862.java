import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        boolean[] participate = new boolean[n];
        Arrays.fill(participate, true);
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        List<Integer> lostStudents = Arrays.stream(lost)
            .boxed()
            .collect(Collectors.toList());
        
        List<Integer> reserveStudents = Arrays.stream(reserve)
            .boxed()
            .collect(Collectors.toList());
        
        for(int i = 0; i < n; i++) {
            if(lostStudents.contains(i+1)) {
                participate[i] = false;
            }
        }
        
        for(int reserveStudent : reserve) {
            if(lostStudents.contains(reserveStudent)) { 
                participate[reserveStudent - 1] = true;
                reserveStudents.remove(Integer.valueOf(reserveStudent));
            }
        }
        
        for(int lostStudent: lost) {
            if(reserveStudents.size() == 0) {
                break;
            } else {
                if(reserveStudents.remove(Integer.valueOf(lostStudent - 1)) || 
                  reserveStudents.remove(Integer.valueOf(lostStudent + 1))) {
                    participate[lostStudent - 1] = true;
                }
            }
        }
        
        for(int i = 0; i < participate.length; i++) {
            if(participate[i]) {
                answer++;
            }
        }
        return answer;
    }
}