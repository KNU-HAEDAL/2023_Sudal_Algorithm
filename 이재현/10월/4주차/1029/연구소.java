package a231028;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 연구소 {
    static int[][] map;
    static int row;
    static int col;
    static int minVirusArea=Integer.MAX_VALUE;
    //상하좌우 기준
    static int[] dRow = {-1,1,0,0};
    static int[] dCol = {0,0,-1,1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //row col 입력받기
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());
        int cleanArea = 0;
        //row * col 동안, map 입력받기
        map = new int[row][col];
        for (int i=0; i<row; i++){
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<col; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j]!=1) cleanArea++;
            }
        }

        bruteForce(0);

        System.out.println(cleanArea-minVirusArea-3);

    }

    private static void bruteForce(int wall) {
        if (wall==3) {
            findVirusArea();
            return ;
        }

        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                if (map[i][j]==0) {
                    map[i][j]=1;
                    bruteForce(wall+1);
                    //이 라인이 실행됨 = map[i][j]=1인 모든 경우를 탐색 했음
                    //즉, 여기에서는 map[i][j]=0인 경우를 탐색하도록 해야 함.
                    map[i][j]=0;
                }
            }
        }

    }

    //2에서 만들 수 있는 범위의 크기를 구하고 minVirusArea에 넣어줌
    private static void findVirusArea() {
        int[][] virusMap = new int[row][col];
        int virusArea = 0;
        //2의 위치를 전부 queue에 넣음
        Queue<int[]> queue = new LinkedList<>();
        for (int i=0; i<row; i++) {
            for (int j = 0; j < col; j++) {
                if (map[i][j]==2) {
                    queue.add(new int[]{i,j});
                }
                virusMap[i][j] = map[i][j];

            }
        }

        //while (!queue.isEmpty())동안
        while (!queue.isEmpty()){
            int[] now = queue.poll();
            int nowRow = now[0];
            int nowCol = now[1];

            virusArea++;

            //queue를 꺼내서 visit하고, 좌표 근처의 동료확인
            //  1. 갈 수 있는 인덱스 범위인가?
            //  2. 해당 인덱스의 map값이 0인가?
            //  3. 방문을 안 했는가? -> queue에 추가
            for (int i=0; i<4; i++){
                int nextRow = nowRow + dRow[i];
                int nextCol = nowCol + dCol[i];
                if (!isOutOfIndex(nextRow,nextCol)
                && virusMap[nextRow][nextCol]==0) {
                    virusMap[nextRow][nextCol] = 2;
                    queue.add(new int[]{nextRow,nextCol});
                }
            }
        }

        if (virusArea < minVirusArea) minVirusArea = virusArea;

    }

    private static boolean isOutOfIndex(int x, int y) {
        if (x < 0 || x >= row || y < 0 || y >= col) return true;
        return false;
    }

}
