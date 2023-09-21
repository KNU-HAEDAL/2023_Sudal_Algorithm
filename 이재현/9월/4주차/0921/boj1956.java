package a230921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj1956 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());

        //V E 받기
        int V= Integer.parseInt(st.nextToken());
        int E= Integer.parseInt(st.nextToken());

        //for E : floyd에 값 넣기
        int floyd[][]=new int[V+1][V+1];
        for (int i=1;i<V+1;i++) {
            Arrays.fill(floyd[i],10_000_000);
        }

        for (int i=0;i<E;i++){
            st=new StringTokenizer(br.readLine());
            int start=Integer.parseInt(st.nextToken());
            int end=Integer.parseInt(st.nextToken());
            int length=Integer.parseInt(st.nextToken());

            floyd[start][end]=length;
        }

        for (int k=1;k<V+1;k++){
            for (int i=1;i<V+1;i++){
                for (int j=1;j<V+1;j++){
                    floyd[i][j]=Math.min(floyd[i][j],floyd[i][k]+floyd[k][j]);
                }
            }
        }
        int answer=10_000_001;
        for (int i=1;i<V+1;i++){
            answer=Math.min(answer,floyd[i][i]);
        }

        if (answer==10_000_000) System.out.println(-1);
        else System.out.println(answer);

    }
}
