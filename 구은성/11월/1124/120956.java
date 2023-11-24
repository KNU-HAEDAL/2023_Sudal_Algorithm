class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] avail = {"aya", "ye", "woo", "ma"};
        
        for(String s : babbling) {
            for(String availPro : avail) {
                if(s.contains(availPro)) {
                    s = s.replace(availPro, "-");
                }
            }
            
            s = s.replaceAll("-" , "");
            if(s.equals("")) {
                answer++;
            }
        }
        
        return answer;
    }
}