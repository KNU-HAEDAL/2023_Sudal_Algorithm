class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int area = brown + yellow;
        int width = 0;
        int height = 0;
        
        for(int i = area; i >= Math.sqrt(area); i--) {
            if(area % i == 0) {
                width = i;
                height = area / i;
                if((width - 2) * (height - 2) == yellow) {
                    answer[0] = width;
                    answer[1] = height;
                    break;
                }
            }
        }
        
        return answer;
    }
}