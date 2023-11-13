class Solution {
    public int solution(String s) {
        int answer;
        String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < number.length; i++) {
            s = s.replace(number[i], Integer.toString(i));
        }
        
        answer = Integer.parseInt(s);
        
        return answer;
    }
}