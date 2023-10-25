class Solution {
    boolean solution(String s) {
        boolean answer;
        int pCnt = 0;
        int yCnt = 0;
        
        s = s.toLowerCase();
        
        for(int i = 0; i < s.length(); i++) {
            char ch  = s.charAt(i);
            if (ch == 'p') {
                pCnt++;
            }
            else if (ch == 'y') {
                yCnt++;
            }
        }

        if (pCnt == yCnt) {
            answer = true;
        }
        else {
            answer = false;
        }
        
        return answer;
    }
}