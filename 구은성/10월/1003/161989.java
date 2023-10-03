class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int roller = section[0];
        
        for(int i = 1; i < section.length; i++) {
            if(roller + m - 1 < section[i]) {
                answer++;
                roller = section[i];
            }
        }
        
        return answer;
    }
}