import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stringStack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stringStack.push(s.charAt(i));
            }
            else {
                if(stringStack.isEmpty() || stringStack.pop() != '(') {
                    answer = false;
                    break;
                }
            }
        }
        
        if(!stringStack.isEmpty()) {
            answer = false;
        }

        return answer;
    }
}