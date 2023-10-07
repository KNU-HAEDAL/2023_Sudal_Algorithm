package a231006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 앱 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //N M받기
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        //for N, weight 받기
        int weight[]=new int[N+1];
        st=new StringTokenizer(br.readLine());
        int sum=0;
        for (int i=1;i<N+1;i++){
            weight[i]=Integer.parseInt(st.nextToken());
            sum+=weight[i];
        }

        int max = sum-M;
        //for N, cost받기
        int cost[] = new int[N+1];
        st=new StringTokenizer(br.readLine());
        int costSum=0;
        for (int i=1;i<N+1;i++){
            cost[i]=Integer.parseInt(st.nextToken());
            costSum+=cost[i];
        }

        //그냥 60의 용량이 필요하면, 전체-60의 용량만큼의 배낭에 최대값을 담는다고 생각하자.
        // dp[j,w] = dp[j-1,w], dp[j-1, w-weight[j]]+cost[j]
        int dp[][] =new int[2][max+1];
        for (int j=1;j<N+1;j++){
            for (int w=1;w<max+1;w++){
                dp[1][w]=dp[0][w];
                if (w-weight[j]>=0){
                    dp[1][w]=Math.max(dp[1][w],dp[0][w-weight[j]]+cost[j]);
                }
            }
            for (int w=1;w<max+1;w++){
                dp[0][w]=dp[1][w];
            }
        }

        System.out.println(costSum-dp[1][max]);


        // 1~j까지의 아이템을 선택해서, w을 넘기는 최소값
        // dp[j,w] = dp[j-1,w], dp[j-1, w-weight[j]]+cost[j]
        //결국 값을 구하려면 j-1을 알아야 함.
        //dp[][]

        //knapsack의 경우는
        // dp[j,w] = dp[j-1,w] vs dp[j-1,w-weight[j]] + cost[j]

    }
}
