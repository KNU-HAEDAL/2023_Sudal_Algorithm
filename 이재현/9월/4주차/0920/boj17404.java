package a230920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj17404 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        //N받기
        int N = Integer.parseInt(br.readLine());

        //int color[3][N] 받기
        int color[][]= new int[N][3];

        for (int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            for (int j=0;j<3;j++){
                color[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        //0번 집의 1번 컬러 -> color[0][1]

        //dp 활용
        // [i][j] -> i번째 집까지의 합, 마지막이 j컬러
        // [i+1][j] -> [i][j아닌 수]+color[i][j]
        //             or [i][j아닌 또 다른 수]+color[i][j]
        //초기 [0][0~2] 값 존재
        // i만큼 순회하면 됨

        //이러면 맨 뒤와 맨 앞 컬러 불일치 가능
        //dp채우면서, 맨 앞 컬러 track하는
        // 맨 앞 컬러를 고정해놓고 3가지 dp배열을 만들자
        int[][] dp = new int[N][3];
        int answer=Integer.MAX_VALUE;
        for (int k=0;k<3;k++){
            for (int i=0;i<3;i++){
                if (i==k) dp[0][i]=color[0][i];
                else dp[0][i]=100_000;
            }
            for (int i=1;i<N;i++) {
                //시작이 k인 dp에 대해서, [0][1][2]를 찾아서 넣어주면 됨.
                dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + color[i][0];
                dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + color[i][1];
                dp[i][2] = Math.min(dp[i - 1][1], dp[i - 1][0]) + color[i][2];
            }

            for (int i=0;i<3;i++) {
                if (i!=k) answer=Math.min(answer,dp[N-1][i]);
            }
        }
        System.out.println(answer);



//        int answer=Math.min(answer0,answer1);
//        answer=Math.min(answer,answer2);
//        System.out.println(answer);

    }
}
