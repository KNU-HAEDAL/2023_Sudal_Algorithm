import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        Stack<Integer> s = new Stack<>();
        
        for(int i = 0; i < n; i++) {
            if(visited[i]) {
                continue;
            } 
            
            s.push(i);
            
            while(!s.isEmpty()) {
                int computer = s.pop();
                visited[computer] = true;
                
                for(int j = 0; j < n; j++) {
                    if(computers[computer][j] == 1 && !visited[j]) {
                        s.push(j);
                    }
                }
            }
            
            answer++;
        }
        
        return answer;
    }
}
    