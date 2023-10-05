public class Solution {
    public int solution(int[] numList) {
        int length = numList.length;
        int result = 0;

        if (length >= 11) {
            // 리스트의 길이가 11 이상인 경우 원소들의 합을 계산
            for (int num : numList) {
                result += num;
            }
        } 
        else {
            // 리스트의 길이가 10 이하인 경우 원소들의 곱을 계산
            result = 1;
            for (int num : numList) {
                result *= num;
            }
        }
         return result;
}
}