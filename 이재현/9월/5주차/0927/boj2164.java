package a230927;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//카드2
//queeu
public class boj2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        //N받기
        int N = Integer.parseInt(br.readLine());
        //N까지 Queue초기화
        Queue<Integer> queue =new LinkedList<>();
        for (int i=1;i<=N;i++){
            queue.add(i);
        }
        //Queue가 비어있지 않을 때 동안
        int last=1;
        while (!queue.isEmpty()){
            last=queue.poll();
            if (queue.isEmpty()) break;
            last=queue.poll();
            queue.add(last);
        }
        //pop하고, pop->add

        System.out.println(last);
    }
}
