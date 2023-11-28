class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++) {
            String binary1 = toBinary(arr1[i], n);
            String binary2 = toBinary(arr2[i], n);
            String map = "";
            
            for(int j = 0; j < n; j++) {
                if(binary1.charAt(j) == '1' || binary2.charAt(j) == '1') {
                    map += "#";
                } else if(binary1.charAt(j) == '0' || binary2.charAt(j) == '0') {
                    map += " ";
                }
            }
            answer[i] = map;
        }
        
        return answer;
    }
    
    public String toBinary(int num, int n) {
        String binary = Integer.toBinaryString(num);
        while(binary.length() != n) {
            binary = "0" + binary;
        }
        
        return binary;
    }
}