class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        if(s.length() == 4 || s.length() == 6) {
            if (s.matches("^[\\d]*$")) {
                answer = true;
            }
        }
        
        return answer;
    }
}