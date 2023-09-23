package a230923;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
//인구이동
public class boj16234 {
    static boolean[][] visit;
    static ArrayList<int[]> country;
    static int peopleNum;
    static int L;
    static int R;
    static int N;

    //아래 오른 위 왼쪽
    static int[] dRow = {1,0,-1,0};
    static int[] dCol= {0,1,0,-1};
    static int[][] people;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        //N L R 받기
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        //N*N만큼 받기
        people = new int[N][N];
        for (int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            for (int j=0;j<N;j++){
                people[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        //scc문제
        //dfs를 통해서 scc를 찾고,
        // 그 scc값 통일시켜줌
        int day =0;
        while(true){
            boolean canGo = false;
            visit=new boolean[N][N];
            //scc로 인구이동 로직
            //한번이라도 dfs가 2개 이상이 나오면 true

            //모든 국가에 대해서 미방문 노드에서 dfs실행
            //dfs
            for (int i=0;i<N;i++){
                for (int j=0;j<N;j++){
                    country=new ArrayList<>();
                    peopleNum=0;
                    if (!visit[i][j]) dfs(i,j);
                    else continue;

                    //dfs를 한 경우
                    // cnt==1이면 continue
                    // cnt!=1이면 peopleNum/cnt를 cnt만큼 국가에 분배
                    if (country.size()==1) continue;
                    int num = peopleNum/country.size();
                    for (int k=0;k<country.size();k++){
                        int[] index = country.get(k);
                        people[index[0]][index[1]]=num;
                    }
                    canGo=true;
                }
            }

            //canGo가 여전히 false -> 그대로 break;
            //else day++;
            if (!canGo) break;
            else day++;
        }

        System.out.println(day);
    }

    static void dfs(int row, int col){
        visit[row][col]=true;
        int beforeP = people[row][col];
        peopleNum+=beforeP;
        country.add(new int[]{row,col});
        //2개의 경우에 대해서
        for (int i=0;i<4;i++){
            int nextRow = row+dRow[i];
            int nextCol = col+dCol[i];


            if (!outOfIndex(nextRow,nextCol)
            && !visit[nextRow][nextCol]
            && L<=Math.abs(beforeP-people[nextRow][nextCol])
            && Math.abs(beforeP-people[nextRow][nextCol])<=R) {
                dfs(nextRow,nextCol);
            }
        }
        //인덱스 범위 가능한지
        // visit하지 않았는지
        //  L R 사이인지

    }

    static boolean outOfIndex(int row, int col){
        if (row<0 || row>=N || col<0 || col>=N) return true;
        else return false;
    }
}
