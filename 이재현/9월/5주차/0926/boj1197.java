package a230926;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
//최소 스패닝 트리
public class boj1197 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());

        // V E 받기
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        //E만큼 받기
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        for (int i=0;i<E;i++){
            st=new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int length = Integer.parseInt(st.nextToken());
            pq.add(new Edge(start,end,length));
        }

        //kruskal
        //제일 작은 엣지 뽑자
        //그리고 이게 사이클을 만들지 않을경우, 넣자
        //>> 엣지 V-1개 생기기까지 반복

        //cnt : edge 추가된 개수
        //answer : 가중치
        int cnt=0, answer=0;

        //root : 자신이 속한 spanning tree의 부모노드 (제일작은값)
        //같은 spanning tree에 속하면 -> root값이 똑같음
        //엣지는 root값이 같지 않을시에 넣어주면 되는듯
        int [] root = new int[V+1];
        for (int i=0;i<V+1;i++){
            root[i]=i;
        }

        while (!pq.isEmpty() && cnt<V-1){
            //pq에서 edge빼냄
            Edge edge = pq.poll();
            //edge의 start와 end의 root값이 같은지 확인
            // 같으면 continue
            // 다르면 answer추가, cnt추가, root 바꾸기 진행
            if (root[edge.start]!=root[edge.end]){
                answer+=edge.length;
                cnt++;
                int min = Math.min(root[edge.start],root[edge.end]);
                int max = Math.max(root[edge.start],root[edge.end]);
                for (int i=1;i<V+1;i++){
                    if (root[i]==max) root[i]=min;
                }
            }
        }

        System.out.println(answer);
    }

    static class Edge implements Comparable<Edge>{
        int start;
        int end;
        int length;

        public Edge(int start, int end, int length) {
            this.start = start;
            this.end = end;
            this.length = length;
        }

        @Override
        public int compareTo(Edge o) {
            return this.length-o.length;
        }
    }
}
