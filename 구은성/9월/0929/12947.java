class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int harshad = 0;
        String num = Integer.toString(x);
        
        for(int i = 0; i < num.length(); i++) {
            harshad = harshad + (num.charAt(i) - '0');
        }
        
        if(x % harshad != 0) {
            answer = false;
        }
        
        return answer;
    }
}