package a230916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.BatchUpdateException;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class boj13144 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        //N받기
        int N = Integer.parseInt(br.readLine());

        //for N 수열 받기
        int[] arr = new int[N];
        StringTokenizer st =new StringTokenizer(br.readLine());

        for (int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        //투포인터 구현
        //초기 상태? left,right=0
        //while을 통해서 right늘리면서 판단하자.
        // cnt배열을 통해서 left이동할 때 마다 넣어주자.
        int left=0,right=0;
        boolean[] exist =new boolean[100001];
        long answer=0L;
        while(left<N) {
            //가능한 right최대로 올리기
            while(right<N && !exist[arr[right]]){
                exist[arr[right]]=true;
                right++;
            }
            answer+=right-left;
            exist[arr[left]]=false;
            left++;

        }

        System.out.println(answer);
    }
}
