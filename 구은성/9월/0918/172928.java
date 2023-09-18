class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        
        int h = -1;
        int w = -1;
        int height = park.length;
        int width = park[0].length();
        
        for(int i = 0; i < height; i++) {
            if (park[i].contains("S")) {
                h = i;
                w = park[i].indexOf("S");
                break;
            }
        }
        
        for(int i = 0; i < routes.length; i++) {
            String[] command = routes[i].split(" ");
            String op = command[0];
            int n = Integer.parseInt(command[1]);
            
            int currH = h;
            int currW = w;
            
            boolean exe = true;
            if(op.equals("N")) {
                for (int j = 0; j < n; j++) {
                    if(currH <= 0) {
                        exe = false;
                        break;
                    }
                    else if(park[currH - 1].charAt(currW) == 'X') {
                        exe = false;
                        break;
                    }
                    currH--;
                }
                if(exe) {
                    h = currH;
                }
            }
            else if(op.equals("S")) {
                for(int j = 0; j < n; j++) {
                    if(currH >= height - 1) {
                        exe = false;
                        break;
                    }
                    else if(park[currH + 1].charAt(currW) == 'X') {
                        exe = false;
                        break;
                    }
                    currH++;
                }
                if(exe) {
                    h = currH;
                }
            }
            else if(op.equals("W")) {
                for(int j = 0; j < n; j++) {
                    if(currW <= 0) {
                        exe = false;
                        break;
                    }
                    else if(park[currH].charAt(currW - 1) == 'X') { 
                        exe = false;
                        break;
                    }
                    currW--;
                }
                if(exe) {
                    w = currW;
                }
            }
            else if(op.equals("E")) {
                for(int j = 0; j < n; j++) {
                    if(currW >= width - 1) {
                        exe = false;
                        break;
                    }
                    else if(park[currH].charAt(currW + 1) == 'X') { 
                        exe = false;
                        break;
                    }
                    currW++;
                }
                if(exe) {
                    w = currW;
                }
            }
        }
        
        answer[0] = h;
        answer[1] = w;
        return answer;
    }
    
}