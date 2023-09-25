package a230925;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//파일합치기
//dp는 무조건 점화식을 세워라 무조건
public class boj11066 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //T받기
        int T = Integer.parseInt(br.readLine());

        //for T
        for (int t=0;t<T;t++){

            //N받기
            //dp[i][i]는 i부터 j까지 파일을 만드는데 필요한 비용
            //dp[i][j]=dp[i][k]+dp[k+1][j]+sum[i][k]+sum[k+1][j]
            int N = Integer.parseInt(br.readLine());
            int dp[][]= new int[N][N];
            int sum[][]= new int[N][N];

            //dp[i][i]부터 다 채우기
            StringTokenizer st =new StringTokenizer(br.readLine());
            for (int i=0;i<N;i++){
                sum[i][i]=Integer.parseInt(st.nextToken());
                Arrays.fill(dp[i],1_000_000_000);
                dp[i][i]=0;
            }



            //dp[i][j]=dp[i][k]+dp[k+1][j]+sum[i][k]+sum[k+1][j]
            for (int col=1; col<N; col++){
                for (int row=0; row<N-col; row++){
                    sum[row][col+row]=sum[row][row]+sum[row+1][col+row];
                    for (int k=row;k<N-1;k++){
                        dp[row][col+row]=Math.min(dp[row][col+row],
                                dp[row][k]+dp[k+1][col+row]+sum[row][k]
                        +sum[k+1][col+row]);
                    }

                }
            }

            System.out.println(dp[0][N-1]);

        }



    }
}
