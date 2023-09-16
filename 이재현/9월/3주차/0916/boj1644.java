

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        //N을 받음
        int N = Integer.parseInt(br.readLine());

        //~~의 체로 소수 걸러서 ArrayList에 넣어둠
        boolean [] prime = new boolean[N+1];
        for (int i=0;i<N+1;i++) prime[i]=true;

        prime[0]=false;
        prime[1]=false;
        ArrayList<Integer> primeList=new ArrayList<>();

        for (int i=2; i*i<=N; i++){
            //소수가 아니면, skip
            if (!prime[i]) continue;

            //해당 값이 소수이면, 배수를 전부 제외시킴
            // arraylist에 넣기
//            primeList.add(i);
            for (int j=i*i; j<=N; j=j+i){
                prime[j]=false;
            }

        }

        for (int i=2;i<N+1;i++){
            if (prime[i]) primeList.add(i);
        }

        //넣어둔 소수 리스트 바탕으로 투 포인터
        int left=0,right=0;
        int size = primeList.size();
        int sum=0;
        int answer=0;

        // 2 3 5 7 11 13 17 19 23 ...
        while (left<size){
            while(right<size && sum+primeList.get(right)<=N ){
                sum+=primeList.get(right);
                right++;
            }
            if (sum==N) answer++;
            if (right>=size)break;
            sum-=primeList.get(left);
            left++;
        }

        //결과 반환
        System.out.println(answer);
    }
}
