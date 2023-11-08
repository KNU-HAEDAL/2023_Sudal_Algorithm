class Solution {
    public int solution(int[][] sizes) {
        int answer;
        int maxWidth = 0;
        int maxHeight = 0;
        
        for(int i = 0; i < sizes.length; i++) {
            int width = Math.max(sizes[i][0], sizes[i][1]);
            int height = Math.min(sizes[i][0], sizes[i][1]);
            
            maxWidth = Math.max(maxWidth, width);
            maxHeight = Math.max(maxHeight, height);
        }
        
        answer = maxWidth * maxHeight;
        
        return answer;
    }
}