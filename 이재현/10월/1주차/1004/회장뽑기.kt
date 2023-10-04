package a231004

import java.util.*

//https://www.acmicpc.net/problem/2660
//floyd-warshall
fun main()=with(System.`in`.bufferedReader()){
    //1번사람이 2번, 3번, 4번, 5번 사람과의 거리를 파악해서
    //가장 큰 값을 그 사람의 번호로 매김
    // 이 경우에 min에 해당하는 사람들을 배열에 다시 넣고
    // 출력해주면 되는 시스템
    // 즉, floyd-warshall

    //N받기
    val N = readLine().toInt()

    // (N+1) * (N+1) 배열 생성
    // default값= 최대값이고, i=i인 경우에 0
    val floyd = Array(N+1,{IntArray(N+1,{1000})})
    for (i in 1..N)   floyd[i][i]=0

    //while -1-1이 아닐경우 관계 받아서 넣기
    while (true){
        val st = StringTokenizer(readLine())
        val v1 = st.nextToken().toInt()
        val v2 = st.nextToken().toInt()

        if (v1==-1 && v2==-1) break;

        floyd[v1][v2]=1;
        floyd[v2][v1]=1;
    }

    //floyd 돌리기
    for (k in 1 .. N){
        for (i in 1..N){
            for (j in 1..N){
                floyd[i][j]=Math.min(floyd[i][j],floyd[i][k]+floyd[k][j])
            }
        }
    }

    //min이면 값을 넣고, min보다 작으면 초기화해서 넣음
    Arrays.sort(floyd[1])
    var min = floyd[1][N-1]
    val pq = PriorityQueue<Int>()
    for (i in 1..N){
        Arrays.sort(floyd[i])
        if (min==floyd[i][N-1]) pq.add(i);
        else if (min>floyd[i][N-1]){
            pq.clear()
            min=floyd[i][N-1]
            pq.add(i)
        }

    }
    val sb = StringBuilder()
    sb.append(min).append(" ").append(pq.size).append("\n")
    while (!pq.isEmpty()){
        sb.append(pq.poll()).append(" ")
    }
    println(sb)
}