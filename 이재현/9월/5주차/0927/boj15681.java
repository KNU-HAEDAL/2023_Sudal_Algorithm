package a230927;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//트리와 쿼리
public class boj15681 {
    static ArrayList<Integer>[] edge;
    static boolean[] visited;
    static int[] count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());

        //vertexNum, root, queryNum받기
        int vertexNum = Integer.parseInt(st.nextToken());
        int root = Integer.parseInt(st.nextToken());
        int queryNum = Integer.parseInt(st.nextToken());

        //for : vertexNum-1, 간선받기
        //ArrayList[]로 받기
        edge = new ArrayList[vertexNum+1];
        visited=new boolean[vertexNum+1];
        count=new int[vertexNum+1];

        //ArrayList[] 초기화
        for (int i=1;i<vertexNum+1;i++){
            edge[i]=new ArrayList<>();
        }

        for (int i=0;i<vertexNum-1;i++){
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            edge[v1].add(v2);
            edge[v2].add(v1);
        }

        //루트에서 bfs로 target

        //query : 100_000 -> 미리 저장해놓는게 매우 좋을듯
        //vertexNum : 100_000

        //1. dp -> 메모이제이션 써야할듯
       countVertex(root);
        StringBuilder sb =new StringBuilder();
        for (int i=0;i<queryNum;i++){
            int q = Integer.parseInt(br.readLine());
            sb.append(count[q]).append("\n");
        }
        System.out.println(sb);
    }

    static int countVertex(int node){
        // node에 있는 visit안한 애들(부모 아닌 애들) 다 더해줌(재귀함수)
        // if 값이 없으면 넣어주고 리턴
        // if 값이 있으면 그냥 그 값 리턴
        visited[node]=true;
        if (count[node]!=0) return count[node];
        else{
            int cnt=1;
            for (int i=0;i<edge[node].size();i++){
                int friend = edge[node].get(i);
                if (visited[friend]) continue;
                cnt+=countVertex(friend);
            }
            count[node]=cnt;
            return cnt;
        }

    }
}
