package a230917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj14658 {
    //이 문제 어려운 이유 : 어떻게 완전탐색을 진행할 것인가..
    static int tramLen, height, width, starCnt;
    static Star[] stars;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());

        //width, height, tramLen, starCnt 받기
        width  = Integer.parseInt(st.nextToken());
        height  = Integer.parseInt(st.nextToken());
        tramLen  = Integer.parseInt(st.nextToken());
        starCnt = Integer.parseInt(st.nextToken());

        //for : starCnt , star좌표 받기
        stars = new Star[starCnt];
        for (int i=0;i<starCnt;i++){
            st=new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            stars[i]=new Star(x,y);
        }

        //최소 x좌표와 최소 y좌표를 사용해서 가능한 좌표를 구함(모서리에 있게 하기 위함)
        //트램펄린으로 커버할 수 있는 star 개수
        int coverCnt=0;
        for (int i=0;i<starCnt;i++){
            for (int j=0;j<starCnt;j++){
                int x =stars[i].x;
                int y =stars[j].y;

                //x,y를 꼭짓점으로 하는 tramLen 의 사각형에 얼마나 들어있는 지 확인
                int cnt = howManyStar(x,y);
                coverCnt = Math.max(coverCnt,cnt);
            }
        }
        System.out.println(starCnt-coverCnt);
    }

    //x,y를 좌상단 꼭짓점으로 가지는 trampulin내에 얼마나 많은 star을 보유하는 지 확인하는 함수
    static int howManyStar(int x, int y){
        //  - - - - - -
        //  |         |
        //  |         |
        //  - - - - - -
        int maxX=Math.min(width,x+tramLen);
        int maxY=Math.min(height,y+tramLen);
        int cnt=0;
        //for : star
        for (int i=0;i<starCnt;i++){
            if (stars[i].x>=x && stars[i].x<=maxX
            && stars[i].y>=y && stars[i].y<=maxY)  cnt++;
        }
        return  cnt;

    }

    static class Star{
        //가로가 x, 세로가 y라고 생각하자
        // 사실상 좌표는 [y][x]가 되는 것임.
        int x;
        int y;

        public Star(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
