class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        int[] answer = new int[str.length()];
        
        for(int i = 0; i < str.length(); i++) {
            answer[i] = Character.getNumericValue(str.charAt(str.length() - i - 1));
        }
        
        return answer;
    }
}