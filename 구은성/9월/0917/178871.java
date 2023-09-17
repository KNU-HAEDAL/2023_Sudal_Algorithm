import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        
        HashMap<String, Integer> playerHm = new HashMap<>();
        HashMap<Integer, String> gradeHm = new HashMap<>();
        
        for(int i = 0; i < players.length;i++) {
            playerHm.put(players[i], i);
            gradeHm.put(i, players[i]);
        }
        
        for(int i = 0; i < callings.length; i++) {
            outrun(callings[i], playerHm, gradeHm);
        }
        
        for(int i = 0; i<players.length; i++) {
            answer[i] = gradeHm.get(i);
        }
        
        return answer;
    }
    
    public static void outrun(String calledPlayer, HashMap<String, Integer> playerHm, HashMap<Integer, String> gradeHm) {
        int grade = playerHm.get(calledPlayer); //호명된 player의 (추월 이전) 등수
        String overtaken = gradeHm.get(grade-1); // 추월당한 player
        
        playerHm.put(calledPlayer, grade - 1);
        playerHm.put(overtaken, grade);
        
        gradeHm.put(grade, overtaken);
        gradeHm.put(grade - 1, calledPlayer);
    }
}