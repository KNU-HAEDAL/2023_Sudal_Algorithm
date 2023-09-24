package a230924;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
//가운데를 말해요
public class boj1655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> minHeap =new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap =new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        //maxHeap에 더 많이 담으면서 maxHeap의 peek()를 center로 해놓음
        //만약에 넣으려는데, maxHeap의 peek()보다 작은값을 minHeap에 넣으려고 하면,
        //그냥 짝수면 maxHeap에 넣고, 홀수면 minHeap에 넣음
        // 근데, maxHeap에 넣는데 minHeap의 peek보다 크다면? 넣고 교환
        // minHeap에 넣는데 maxHeap의 peek보다 작다면? 넣고 교환



        //for : N 입력을 받음
        //for : 1의 경우에는 그냥 넣음
        maxHeap.add(Integer.parseInt(br.readLine()));
        StringBuilder sb =new StringBuilder();
        sb.append(maxHeap.peek()).append("\n");
        for (int i=1;i<N;i++){
            int input = Integer.parseInt(br.readLine());
            if (i%2==0){
                //[1,2][3,4]
                //[1,2,3][4,5]
                //maxHeap에 넣을 것임
                //minHeap의 peek보다 크면 minHeap의 peek를 maxHeap에 넣고
                // minHeap에 input을 넣어주면 됨
                if (input>minHeap.peek()) {
                    int min = minHeap.poll();
                    maxHeap.add(min);
                    minHeap.add(input);
                }
                else maxHeap.add(input);
            }
            else{
                //[1,3][4]
                //[0,1][3,4]

                //minHeap에 넣을 것임
                //maxHeap의 peek보다 작으면,
                // maxHeap값을 minHeap에 넣고
                // 넣을 값을 minHeap에 넣으면 됨.
                if (maxHeap.peek()>input){
                    int max=maxHeap.poll();
                    minHeap.add(max);
                    maxHeap.add(input);
                }
                else minHeap.add(input);
            }
            sb.append(maxHeap.peek()).append("\n");
//            System.out.println(maxHeap.peek());
        }
        System.out.println(sb);
    }

}
