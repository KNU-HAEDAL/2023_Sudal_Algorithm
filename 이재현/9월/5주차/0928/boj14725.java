package a230928;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj14725 {
    static HashMap<String, HashSet<String>>[] tree;
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        //N받기
        int N = Integer.parseInt(br.readLine());

        //HashMap<String, PriorityQueue<String>>을 15개 배열로 사용할 예정
        tree = new HashMap[16];
        for (int i=1;i<16;i++){
            tree[i]=new HashMap<>();
        }
        tree[1].put("root",new HashSet<>());
        //1층 -> 1번 인덱스, key값 : 부모 , value : 정렬된
        //for N,
        StringTokenizer st ;
        for (int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());

            //k받기
            int K = Integer.parseInt(st.nextToken());

            //for K, 입력받고 hashmap에 넣기
            //1번째애는 특별하게 root라는 key에 넣기
            String before = st.nextToken();
            tree[1].get("root").add(before);

            for (int j=2; j<=K ;j++){
                String after = st.nextToken();
                if (tree[j].containsKey(before)){

                }
                else {
                    tree[j].put(before,new HashSet<>());

                }
                tree[j].get(before).add(after);
                before=after;
            }

        }
        ArrayList<String> arrayList=new ArrayList<>(tree[1].get("root"));
        Collections.sort(arrayList);
        StringBuilder sb =new StringBuilder();
        for (int i=0;i<arrayList.size();i++){
            String oneFloorNode = arrayList.get(i);

            // dfs 진행 -> 출력
            dfs(oneFloorNode,2,sb);

        }
        System.out.println(sb);



    }

    static void dfs(String parent, int floor, StringBuilder sb){
        for (int i=0;i<floor-2;i++){
            sb.append("--");
//            System.out.print("--");
        }
        sb.append(parent).append("\n");
//        System.out.print(parent);
//        System.out.println();

        if (!tree[floor].containsKey(parent)) return;
        //친구탐색
        ArrayList<String> arrayList=new ArrayList<>(tree[floor].get(parent));
        for (int i=0;i<arrayList.size();i++){
            String child = arrayList.get(i);
            dfs(child,floor+1,sb);
        }


    }
}
