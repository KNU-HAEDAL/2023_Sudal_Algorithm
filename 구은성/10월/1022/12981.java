import java.util.HashMap;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        HashMap<String, Integer> hm = new HashMap<>();
        
        hm.put(words[0], 1);
        for(int i = 1; i < words.length; i++) {
            String word1 = words[i - 1];
            String word2 = words[i];
            
            if(word1.charAt(word1.length() - 1) != word2.charAt(0) || hm.containsKey(word2)) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            else {
                hm.put(word2, i % n);
            }
        }
        

        return answer;
    }
}