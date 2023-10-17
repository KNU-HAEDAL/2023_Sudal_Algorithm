class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        
        while(s.length() != 1) {
            answer[1] = answer[1] + (s.length() - s.replaceAll("0", "").length());
            s = s.replaceAll("0", "");
            s = Integer.toBinaryString(s.length());
            answer[0]++;
        }
        
        return answer;
    }
}