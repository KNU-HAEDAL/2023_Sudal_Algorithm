class Solution {
    public String solution(String X, String Y) {
        String answer;
        StringBuilder sb = new StringBuilder();
        int[] arrX = new int[10];
        int[] arrY = new int[10];
        
        countNum(X, arrX);
        countNum(Y, arrY);
        
        for(int i = arrX.length - 1; i >= 0; i--) {
            while(arrX[i] > 0 && arrY[i] > 0) {
                arrX[i]--;
                arrY[i]--;
                sb.append(i);
            }
        }
        
        answer = sb.toString();
        
        if(answer.equals("")) {
            answer += "-1";
        } else if(answer.charAt(0) == '0') {
            answer = answer.substring(0, 1);
        }
        
        return answer;
    }
    
    void countNum(String str, int[] arr) {
        for(int i = 0; i < str.length(); i++) {
            char num = str.charAt(i);
            arr[num - '0']++;
        }
    }
}