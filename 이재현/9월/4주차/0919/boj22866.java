package a230919;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj22866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //N받기
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st= new StringTokenizer(br.readLine());

        //빌딩[] 받기
        Building[] buildings = new Building[N+1];
        for (int i=1;i<N+1;i++){
            buildings[i]=new Building(i,Integer.parseInt(st.nextToken()));
        }

        //오른쪽 방향으로 순회하면, 왼쪽 건물은 전부 다 확인 가능하다.
        //자신보다 작은 것들 stack에서 다 빼내면, 큰 것만 순서대로 남게 된다.
        //따라서, stack을 통해 건물 개수를 파악할 수 있다.
        //그리고 stack상단의 building을 통해 제일 가까운 건물 번호도 알 수 있다.
        int leftNum[]=new int[N+1];
        int rightNum[] =new int[N+1];
        int leftLoc[]=new int[N+1];
        Arrays.fill(leftLoc,-1000000);
        int rightLoc[]=new int[N+1];
        Arrays.fill(rightLoc,1000000);
        Stack<Building> stack = new Stack<>();

        for (int i=1;i<N+1;i++){
            //i번째 건물보다 높이가 낮은 것들 stack에서 전부 뺴냄
            while(!stack.isEmpty() && stack.peek().height<=buildings[i].height){
                stack.pop();
            }
            //left가 0이 아닐 시, stack상단의 building location 저장
            if (stack.size()!=0) leftLoc[i]=stack.peek().location;


            //stack의 크기를 left에 담음
            leftNum[i]= stack.size();

            stack.push(buildings[i]);

        }

        stack=new Stack<>();
        for (int i=N;i>0;i--){
            //i번째 건물보다 높이가 낮은 것들 stack에서 전부 뺴냄
            while(!stack.isEmpty() && stack.peek().height<=buildings[i].height){
                stack.pop();
            }

            //stack의 크기를 left에 담음
            rightNum[i]= stack.size();

            //left가 0이 아닐 시, stack상단의 building location 저장
            if (stack.size()!=0) rightLoc[i]=stack.peek().location;

            stack.push(buildings[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i=1;i<=N;i++){
            if (leftNum[i]+rightNum[i]==0) {
                sb.append("0").append("\n");
                continue;
            }

            else sb.append(leftNum[i]+rightNum[i]+" ");

            if (i-leftLoc[i] <= rightLoc[i]-i) sb.append(leftLoc[i]);
            else sb.append(rightLoc[i]);

            sb.append("\n");

        }

        System.out.println(sb);
    }

    static class Building{
        int location;
        int height;

        public Building(int location, int height) {
            this.location = location;
            this.height = height;
        }
    }
}
