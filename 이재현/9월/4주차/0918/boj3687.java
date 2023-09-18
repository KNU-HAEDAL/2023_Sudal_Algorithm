package a230918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj3687 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in   ));

        //T받기
        int T = Integer.parseInt(br.readLine());
        //for : T, -> 출력
//1 : 2개 필요
        //7 : 3개 필요
        //4 : 4개 필요
        //2 : 5개 필요
        //0 : 6개 필요 (조건 : 맨 앞x)
        //6 : 6개 필요
        //8 : 7개 필요
        //제일 작은 수를 만들기 위해선, 자릿수를 줄여야 함
        // 성냥개비 2~7개 -> 1자리 수
        // 성냥개비 8~14개 -> 2자리 수
        //8개 : 10 2+6개 3+5, 4+4, 5+3, 6+2
        //9개 : 7+2 6+3 5+4 4+5 3+6 2+7
        //10개 : 7+3 6+4 5+5 4+6 3+7
        //11개 : 7+4 6+5 5+6 6+
        //12개 : 28
        //13개 : 68
        //14개 : 88
        //어쨌든 몇 개가 필요하든, 8개 이상이면
        // 그 전 값+2~7까지 덧붙이기로 구할 수 있음
        long minDp[]=new long[101];
        Arrays.fill(minDp,Long.MAX_VALUE);
        minDp[2] = 1;
        minDp[3] = 7;
        minDp[4] = 4;
        minDp[5] = 2;
        minDp[6] = 6;
        minDp[7] = 8;
        minDp[8] = 10;

        String[] add = {"1","7","4","2","0","8"};

        for (int i=9;i<=100;i++){
            for (int k=2;k<=7;k++){
                String line =""+minDp[i-k]+add[k-2];
                minDp[i]=Math.min(Long.parseLong(line),minDp[i]);
            }
        }

        for (int i=0;i<T;i++){
            //가장 큰 수 : 1과 7만 활용 (숫자/2 => 길이 & 홀수면 앞자리 7)
            int targetNum=Integer.parseInt(br.readLine());
            StringBuilder max = new StringBuilder();
            if (targetNum%2==1) {
                max.append("7");
            }
            else max.append("1");

            for (int j=0;j<targetNum/2-1;j++){
                max.append("1");
            }

            System.out.println(minDp[targetNum]+" "+max);
        }

    }
}
