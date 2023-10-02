package a231002

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

//https://www.acmicpc.net/problem/11501
//greedy

fun main() =with(java.io.StreamTokenizer(System.`in`.bufferedReader())) {

    //T받기
    val T = nextToken().toInt()
    val sb = StringBuilder()

    repeat (T){
        // N받기
        val N = nextToken().toInt()
        // for N, cost배열에 넣기
        var cost = IntArray(N,{0})
        val st = StringTokenizer(readLine())
        for (i in 0 until N){
            cost[i]=st.nextToken().toInt()
        }
        // 뒤에서부터 앞으로가면서, 값이 max보다 크면 max갱신, 작으면 차이를 ans에 더하기
        //ans를 builder에 넣기
        var max = cost[N-1]
        var ans = 0L
        for (i in N-2 downTo 0){
            if (max<cost[i]) max=cost[i]
            else ans+=max-cost[i]
        }
        sb.append(ans).append("\n")

    }
    println(sb)
}