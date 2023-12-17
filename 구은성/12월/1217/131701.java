import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer;
        Set<Integer> answerSet = new HashSet<>();
        int count = elements.length;
        
        int[] sum = new int[count];
        
        //부분 수열의 합 계산
        for(int i = 1; i <= count; i++) {
            for(int j = 0; j < count; j++) {
                sum[j] += elements[(j+i-1) % count]; 
                    /*
                        이전 단계의 합을 이용하는 것(Dynamic Programming, 동적계획법)
                        다시 말해, 길이가 n인 연속 부분 수열의 합은 길이가 n - 1인 연속 부분 수열의 합 + element의 합과 동일함
                        
                        예를 들어 원형 수열이 [7, 9, 1, 1, 4]라고 했을 때,
                        길이가 3인 연속 부분 수열의 합은 [17, 11, 6, 12, 20]임
                        
                        이 중 17은 [7, 9, 1]로 이루어진 연속 부분 수열의 합
                        7 + 9 + 1 = 16 + 1
                        여기서 16은 길이가 2인 연속 부분 수열의 합으로 볼 수 있음
                        
                    */
                answerSet.add(sum[j]);
            }
        }
        
        answer = answerSet.size();
        return answer;
    }
}