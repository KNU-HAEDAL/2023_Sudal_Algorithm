package a230915;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj2169 {
    static int[] dRow = {0,1,0};
    static int[] dCol = {-1,0,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());

        //row col 받기
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        //for row
        // for col
        //map에 받기
        int[][] map =new int[row][col];

        //visit은 음수 최대값으로 초기화
//        int[][] visit = new int[row][col];
        //visit안쓰고 Node 자체 값을 통해서 max값 얻자.
        for (int i=0;i<row;i++){
            st=new StringTokenizer(br.readLine());
            for (int j=0;j<col;j++){
                map[i][j]= Integer.parseInt(st.nextToken());
//                visit[i][j]= Integer.MIN_VALUE;
            }
        }

        //DP로 풀 것임
        int[][] dp =new int[row][col];
        dp[0][0]=map[0][0];
        for (int i=1;i<col;i++) {
            dp[0][i]=dp[0][i-1]+map[0][i];
        }

        for (int i=1;i<row;i++){
            int [] right = new int[col];
            int [] left = new int[col];
            // 좌 -> 우
            right[0]=dp[i-1][0]+map[i][0];
            for (int j=1;j<col;j++) {
                right[j]=Math.max(right[j-1],dp[i-1][j])+map[i][j];
            }

            // 좌 <- 우
            left[col-1]=dp[i-1][col-1]+map[i][col-1];
            for (int j=col-2;j>=0;j--){
                left[j]=Math.max(left[j+1],dp[i-1][j])+map[i][j];

            }

            for (int j=0;j<col;j++){
                dp[i][j]=Math.max(left[j], right[j]);
            }
        }
        System.out.println(dp[row-1][col-1]);
    }

    static boolean outOfIndex(int row, int col, int realRow, int realCol){
        if (row<0 || row>=realRow || col<0 || col>=realCol) return true;
        else return false;
    }
    static class Node{
        int row;
        int col;
        int value;

        // -1 0 1로 나타내자.
        int dir;

        public Node(int row, int col, int value, int dir) {
            this.row = row;
            this.col = col;
            this.value = value;
            this.dir = dir;
        }
    }
}
