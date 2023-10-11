class Solution {
    public String solution(String s) {
        String answer = "";
        String[] nums = s.split(" ");
        
        int minIdx = 0;
        int maxIdx = 0;
        
        for(int i = 1; i < nums.length; i++) {
            if(Integer.parseInt(nums[minIdx]) > Integer.parseInt(nums[i])) {
                minIdx = i;
            }
            
            if(Integer.parseInt(nums[maxIdx]) < Integer.parseInt(nums[i])) {
                maxIdx = i;
            }
        }
        
        answer = answer + nums[minIdx] + " " + nums[maxIdx];
        
        return answer;
    }
}