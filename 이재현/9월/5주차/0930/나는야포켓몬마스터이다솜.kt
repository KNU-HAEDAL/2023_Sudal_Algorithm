package a230930

import java.util.StringTokenizer
//나는야 포켓몬 마스터 이다솜
//https://www.acmicpc.net/problem/1620
fun main()=with(System.`in`.bufferedReader()){
    // N T 받기
    var st = StringTokenizer(readLine())
    val N = st.nextToken().toInt()
    val T = st.nextToken().toInt()

    // for 1..N 동안, 인덱스와 문자열 Map에 넣기
    var mapWithInt = mutableMapOf<Int, String>()
    var mapWithStr = mutableMapOf<String, Int>()

    for (i in 1..N){
        var str = readLine()
        mapWithInt[i]=str
        mapWithStr[str]=i
    }
    val sb = StringBuilder()
    //T받고, 맨 앞ㅍ자리가 숫자이면 숫자 map에서 찾고,영어면 영어Map에서
    for (i in 0 until T){
        var str = readLine()
        if ('0'<=str.get(0)&& str.get(0)<='9') sb.appendLine(mapWithInt[str.toInt()])
        else sb.appendLine(mapWithStr[str])
    }
    println(sb)
}