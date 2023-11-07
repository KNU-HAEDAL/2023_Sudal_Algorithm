import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int front = 0;
        int rear = people.length - 1;
        Arrays.sort(people);
        
        while(front <= rear) {
            answer++;
            if(people[front] + people[rear] <= limit) {
                front += 1;
            }
            rear -= 1;
        }
        
        return answer;
    }
}