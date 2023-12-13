class Solution {
    public int solution(String dartResult) {
        int answer;
        int[] scores = new int[3];
        int scoreIdx = -1;
        
        for(int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);
            int score;
            
            if(Character.isDigit(ch)) {
                if(ch == '1' && dartResult.charAt(i + 1) == '0') {
                    score = 10;
                    i++;
                } else {
                    score = ch - '0';
                }
            
                scores[++scoreIdx] = score;
            } else {
                switch(ch) {
                    case 'D': 
                        scores[scoreIdx] = (int)Math.pow(scores[scoreIdx], 2);
                        break;
                    case 'T': 
                        scores[scoreIdx] = (int)Math.pow(scores[scoreIdx], 3);
                        break;
                    case '*':
                        if(scoreIdx - 1 >= 0) {
                            scores[scoreIdx - 1] *= 2;
                        }
                        scores[scoreIdx] *= 2;
                        break;
                    case '#':
                        scores[scoreIdx] *= -1;
                        break;
                }
            }
        }
        answer = scores[0] + scores[1] + scores[2];
        
        return answer;
    }
}