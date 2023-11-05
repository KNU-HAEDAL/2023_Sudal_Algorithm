class Solution {
    public String solution(String s) {
        String answer = "";
        String[] letters = s.split("");
        int idx = 0;
        
        for(String letter : letters) {
            if(letter.equals(" ")) {
                answer += " ";
                idx = -1;
            }
            else if(idx % 2 == 0) {
                answer += letter.toUpperCase();
            }
            else {
                answer += letter.toLowerCase();
            }
            
            idx++;
        }
        
        return answer;
    }
}