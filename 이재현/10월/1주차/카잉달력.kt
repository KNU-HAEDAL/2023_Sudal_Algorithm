package a231001

import java.lang.StringBuilder
import java.util.StringTokenizer

//백준 6064번
// https://acmicpc.net/problem/6064
//step
// % 연산일때 범위를 항상 잘 생각할 것
fun main()=with(System.`in`.bufferedReader()) {
    //T받음
    val T = readLine().toInt()
    val sb = StringBuilder()
    //repeat T
    repeat(T) {
        // maxX maxY targetX targetY 받음
        val st = StringTokenizer(readLine())
        val maxX = st.nextToken().toInt()
        val maxY = st.nextToken().toInt()
        val targetX = st.nextToken().toInt()
        val targetY = st.nextToken().toInt()
        // <x:y> -> <(x+1)%M+1 : (y+1)%N+1>
        // 어쨌든 값을 늘리면서 맞는지 확인해야 함

        //while을 통해서 해당값이 마지막이 아닌지만 파악하면 됨
        //year
        var cnt =1
        for (i in targetX..maxX * maxY step maxX) {
            // targetX와 targetY를 찾으려면
            // targetX에서 +maxX를 하면서
            // 그 값이 %y 했을 때, 조건에 부합하는 가를 확인해야 한다.
            if ((i-1)%maxY+1==targetY) {
                println(i)
                return@repeat
            }

        }
        println(-1)

    }
}