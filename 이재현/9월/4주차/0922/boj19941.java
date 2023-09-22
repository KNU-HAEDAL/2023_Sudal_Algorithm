package a230922;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj19941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());

        //N과 K받기
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        //for N동안 순회하면서 PriorityQueue에 넣기

        Queue<Integer> person = new LinkedList<>();
        Queue<Integer> hamburger = new LinkedList<>();
        String line = br.readLine();
        for (int i=1;i<N+1;i++){
            if (line.charAt(i-1)=='H') hamburger.add(i);
            else person.add(i);
        }

        //while 둘 다 비어있지 않은 경우
        // hamburger로 하나 빼고,
        // 사람이 먹을 수 있는 경우, 먹고 hamburger,person하나씩 빼줌
        // 사람이 못 먹는 경우(멀다),
        int answer=0;
        while(person.size()!=0 && hamburger.size()!=0){
            //   햄버거-K < person < 햄버거+K 범위면, 둘 다 빼줌
            // person < 햄버거-K 이면, person빼줌
            // 햄버거+K < person이면, 햄버거빼줌
            if (hamburger.peek()-K<= person.peek()
            && person.peek()<=hamburger.peek()+K) {
                person.poll();
                hamburger.poll();
                answer++;
            }
            else if (person.peek()< hamburger.peek()){
                person.poll();
            }
            else hamburger.poll();
        }

        System.out.println(answer);
//        PriorityQueue<Integer> person=new PriorityQueue<>();
//        PriorityQueue<Integer> hamburger=new PriorityQueue<>();

    }
}
