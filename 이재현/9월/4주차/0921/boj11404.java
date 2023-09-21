package a230921;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj11404 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        //cityNum 받기
        int cityNum=Integer.parseInt(br.readLine());

        //edgeNum 받기
        int edgeNum = Integer.parseInt(br.readLine());

        //for : edgeNum
        // StringTokenizer로 쪼개서
        // 배열에 넣기 (floyd-warshall -> 쪼갤필요 x)
        int [][] floyd = new int[cityNum+1][cityNum+1];
        for (int i=1;i<cityNum+1;i++){
            Arrays.fill(floyd[i],100_000_001);
            floyd[i][i]=0;
        }


        StringTokenizer st ;
        for (int i=0;i<edgeNum;i++){
            st = new StringTokenizer(br.readLine());
            int start=Integer.parseInt(st.nextToken());
            int end=Integer.parseInt(st.nextToken());
            int length=Integer.parseInt(st.nextToken());

            //if (floyd[start][end]==0) floyd[start][end]=length;
            floyd[start][end]=Math.min(floyd[start][end],length);
        }

        //floyd-warshall
        // k=1 to cityNum
        //    i=1 to cityNum
        //       j=1 to cityNum
        for (int k=1;k<cityNum+1;k++){
            for (int i=1;i<cityNum+1;i++){
                for (int j=1;j<cityNum+1;j++){
                    if (i==j) continue;
                    floyd[i][j]=Math.min(floyd[i][j],floyd[i][k]+floyd[k][j]);
                }
            }
        }
        StringBuilder sb= new StringBuilder();
        for (int i=1;i<cityNum+1;i++){
            for (int j=1;j<cityNum+1;j++){
                if (floyd[i][j]==100_000_001) sb.append("0 ");
                else sb.append(floyd[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }
//    static class Node{
//        int end;
//        int length;
//
//        public Node(int destination, int length) {
//            this.end = destination;
//            this.length = length;
//        }
//    }
}
