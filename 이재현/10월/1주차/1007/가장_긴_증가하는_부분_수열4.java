package a231007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//https://www.acmicpc.net/problem/14002


public class 가장_긴_증가하는_부분_수열4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        //N받기
        int N = Integer.parseInt(br.readLine());

        //for N 배열 받기
        int arr[]=new int[N];
        StringTokenizer st =new StringTokenizer(br.readLine());
        for (int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        //for 0 to N-1
        // A = {10, 20, 10, 30, 20, 50, 21, 22, 23}
        //       1  2   1   3   2   4,  3,  4,
        //그냥 순회하면 될 거 같은데
        //dp[i] = arr[i]보다 작은 인덱스에 대해서 +1 or 없으면 1
        //그렇게 해서 나온 값 출력하면 됨

        //dp배열 만들고 초기선언
        int dp[]=new int[N];
        dp[0]=1;
        Arrays.fill(dp,1);

        // i인덱스에 해당하는 최대 길이 찾기
        for (int i=1;i<N;i++){
            //j를 통해서 내려가면서 값 비교

            for (int j=i-1;j>=0;j--){
                //arr[i] > arr[j] 이면 dp[j]+1을 해주고
                if (arr[i]>arr[j] && dp[i]<=dp[j])  dp[i]=dp[j]+1;
                //아니면 넘어감

            }
        }


        StringBuilder sb= new StringBuilder();
        //for 순회 -> dp에서 max값 찾기
        int max=0;
        for (int n : dp)    if (n>max)max=n;
        System.out.println(max);
//        sb.append(max).append("\n");
        //for 거꾸로 순회 -> max--하면서 해당 값 출력
        for (int i=N-1;i>=0;i--){
            if (dp[i]==max) {
                sb.insert(0,arr[i]+" ");
                max--;
            }
        }
        System.out.println(sb);
    }
}
