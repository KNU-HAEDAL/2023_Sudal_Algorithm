package a231002

import java.util.StringTokenizer
//https://www.acmicpc.net/problem/1205
//구현
fun main()=with(System.`in`.bufferedReader()){
    //rankNum, myPoint ,rankMaxNum받기
    var st = StringTokenizer(readLine())
    val rankNum = st.nextToken().toInt()
    val myPoint = st.nextToken().toInt()
    val rankMaxNum = st.nextToken().toInt()

    //point배열 생성
    var point = IntArray(rankMaxNum+1,{-1})

    if (rankNum!=0) {
        st= StringTokenizer(readLine())
        //repeat N, 배열에 point 집어넣기
        for (i in 1..rankNum){
            point[i]=st.nextToken().toInt()
        }
    }


    point[0]= Int.MAX_VALUE
    // 배열 rankMaxNum부터 시작해서, 값 비교해서
    var index=rankMaxNum+1
    for (i in rankMaxNum downTo 0){
        //얘보다 큰 거 만난 순간, i+1번 인덱스를 받으면 됨
        if (point[i]>=myPoint) {
            index=i+1
            break
        }
    }


// 작은 순간에 넣기
    if (index==rankMaxNum+1) println(-1)
    else {
        for (i in index-1 downTo 0){
            if (myPoint==point[i]) index--
        }
        println(index)
    }


}