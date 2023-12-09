import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer;
        List<Integer> list = new ArrayList<>();
        
        for(int num : nums) {
            if(list.size() >= nums.length / 2) {
                break;
            }
            
            if(!list.contains(num)) {
                list.add(num);
            }
        }
        
        answer = list.size();
        
        return answer;
    }
}