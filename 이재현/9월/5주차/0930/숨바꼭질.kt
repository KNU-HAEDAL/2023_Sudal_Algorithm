package a230930
//숨바꼭질
import java.util.*

fun main()=with(System.`in`.bufferedReader()){
    //N K 받기
    val st = StringTokenizer(readLine())
    val N = st.nextToken().toInt()
    val K = st.nextToken().toInt()

    //bfs임
    //visit하면서 계속 진행
    //결국 K에 도달하면 끝
    //visit을 intArray로 설정하고 진행하자
    var visit = IntArray(100001,{0})
    var queue = LinkedList<Int>()
    queue.add(N)

    while(!queue.isEmpty()){
        //거리는 이미 초기화가 되어있음
        var value = queue.pop()
        if (value==K) {
            println(visit[K])
            return
        }
        //-1 +1 *2 인덱스 가능한지 확인
        if (!outOfIndex(value+1) && visit[value+1]==0) {
            queue.add(value+1)
            visit[value+1]=visit[value]+1
        }
        if (!outOfIndex(value-1) && visit[value-1]==0) {
            queue.add(value-1)
            visit[value-1]=visit[value]+1
        }
        if (!outOfIndex(value*2) && visit[value*2]==0) {
            queue.add(value*2)
            visit[value*2]=visit[value]+1
        }
    }

}

fun outOfIndex(n:Int):Boolean{
    if (n<0 || n>100000) return true
    else return false
}