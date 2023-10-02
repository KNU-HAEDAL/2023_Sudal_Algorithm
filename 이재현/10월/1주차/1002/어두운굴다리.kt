package a231002

import java.util.StringTokenizer
//https://www.acmicpc.net/problem/17266
//구현? 이분탐색이라는데 굳이 싶음..
fun main()=with(System.`in`.bufferedReader()){
    //LEN 받기
    val LEN = readLine().toInt()
    // lightNum 받기
    val lightNum = readLine().toInt()

    // for lightNum, 배열에 값 담을 light선언
    var light = IntArray(lightNum+2,{0})

    // 0번 인덱스에는 0을, lightNum+1인덱스에는 LEN을 넣기
    light[lightNum+1]=LEN

    // for lightNum, 배열에 값 담기
    val st = StringTokenizer(readLine())
    for ( i in 1 .. lightNum){
        light[i]=st.nextToken().toInt()
    }
//   가로등이    3  5 에 있다고 치자.
    // 그럼 간격은 사실 3개가 존재하는데, 가로등 사이 간격은 하나임
    // 가로등 사이 간격에 필요한 높이는 5-3 /2이고
    //양옆간격은 나누지 않고 차이로 한다.
    // 이 중 가장 큰 값을 구하면 된다.
    // 배열 순회하면서 차이가 가장 큰 것을 갱신해서 print
    var max = Math.max(light[1]-light[0], light[lightNum+1]-light[lightNum])

    for (i in 2..lightNum){
        var len= (light[i]-light[i-1])
        if (len/2+len%2>max)max=len/2+len%2
    }

    println(max)
}