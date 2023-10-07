class Solution {
    public int solution(String s) {
        int answer = 0;
        int charCnt = 1;
        int diffChar = 0;
        int charIdx = 0;
        
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(charIdx) == s.charAt(i)) {
                charCnt++;
            }
            else {
                diffChar++;
            }
            
            if(charCnt == diffChar) {
                answer++;
                charIdx = i + 1;
                charCnt = 0;
                diffChar = 0;
            }
        }
        
        if(charCnt != diffChar) {
            answer++;
        }
        
        return answer;
    }
}