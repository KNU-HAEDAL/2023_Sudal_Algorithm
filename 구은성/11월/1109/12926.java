class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char chArr[] = s.toCharArray();
        
        for(char ch: chArr) {
            if(ch >= 'a' && ch <= 'z') {
                ch = (char)((ch - 'a' + n) % 26 + 'a');
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char)((ch - 'A' + n) % 26 + 'A');
            }
            answer += ch;
        }
        
        return answer;
    }
}