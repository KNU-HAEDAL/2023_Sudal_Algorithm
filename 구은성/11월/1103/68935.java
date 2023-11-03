class Solution {
    public int solution(int n) {
        int answer = 0;
        String trinary = Integer.toString(n, 3);
        
        StringBuffer sb = new StringBuffer(trinary);
        String reverseStr = sb.reverse().toString();
        
        answer = Integer.parseInt(reverseStr, 3);
        
        return answer;
    }
}