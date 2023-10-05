class Solution {
    public int solution(String n_str) {
        char[] arr = n_str.toCharArray();
        int[] result = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            result[i] = Character.getNumericValue(arr[i]);
        }

        int finalResult = arrayToInteger(result);
        return finalResult;
    }
    
    public int arrayToInteger(int[] digits) {
        int sum = 0;
        int power = 0; // 거듭제곱 초기값
        
        for (int k = 0; k < digits.length; k++) {
            power=digits.length-k-1;
            sum += digits[k] * (int)Math.pow(10, power); // 거듭제곱 계산 
        }
        return sum;
    }
}
