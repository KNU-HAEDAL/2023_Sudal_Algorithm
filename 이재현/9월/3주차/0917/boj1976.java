package a230917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj1976 {
    static ArrayList<Integer>[] city;
    static boolean visit[] ;
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        // cityCnt받기
        int cityCnt = Integer.parseInt(br.readLine());
        // goalCnt받기
        int goalCnt = Integer.parseInt(br.readLine());

        // for : cityCnt * cityCnt -> 받기
        //ArrayList로 받자. ArrayList[]로 받자.
        //dfs 돌려서 scc얻음 - 연결만 되어 있으면 상관이 없음.
        city = new ArrayList[cityCnt+1];
        visit=new boolean[cityCnt+1];
        for (int i=0;i<cityCnt+1;i++) city[i]=new ArrayList<>();

        StringTokenizer st ;
        for (int i=1;i<cityCnt+1;i++){
            st=new StringTokenizer(br.readLine());
            for (int j =1; j<cityCnt+1;j++) {
                // st로 받은 게 0이면 continue
                if (Integer.parseInt(st.nextToken()) == 0) continue;

                // st로 받은 게 1이면 city[i]에 j 넣고, city[j]에 i넣음
                city[i].add(j);
                city[j].add(i);

            }
        }

        //goal[]받기
        int []goal = new int[goalCnt];
        st=new StringTokenizer(br.readLine());
        for (int i=0;i<goalCnt;i++){
            goal[i]=Integer.parseInt(st.nextToken());
        }

        dfs(goal[0]); //->visit얻어냄

        //goal 배열 돌리면서 goal[i]에 해당하는 visit이 true인지 false인지
        //false가 하나라도 나오면? -> NO
        boolean possible = true;
        for (int n : goal){
            if (!visit[n]) {
                possible=false;
                break;
            }
        }
        System.out.println((possible)? "YES":"NO");
    }

    static void dfs(int node){
        //방문확인
        visit[node]=true;

        //방문 가능성 확인
        //city[node]를 순회할 예정
        for (int i=0;i<city[node].size();i++){
            int frined = city[node].get(i);
            if (!visit[frined]) dfs(frined);
        }

    }
}
