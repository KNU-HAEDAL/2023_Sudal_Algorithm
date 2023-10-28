package a231008
//https://www.acmicpc.net/problem/10282
import java.util.*
import kotlin.collections.ArrayList

fun main()=with(System.`in`.bufferedReader()){
    //T받기
    val T =readLine().toInt()
    //repeat (T)
    repeat(T){
        var st =StringTokenizer(readLine())
    //  vertexNum, edgeNum, start 주어짐
        val vertexNum=st.nextToken().toInt()
        val edgeNum=st.nextToken().toInt()
        val start=st.nextToken().toInt()

        //vertexNum크기의 ArrayList배열 생성
        val edge = Array(vertexNum+1,{ArrayList<Node>()})
        // for edgeNum, a b s 받아서 arraylist에 넣어줌
        repeat(edgeNum){
            st= StringTokenizer(readLine())
            //b에서 a로 edge가 가는게 자연스러움
            val a =st.nextToken().toInt()
            val b =st.nextToken().toInt()
            val s =st.nextToken().toInt()
            edge[b].add(Node(a,s))
        }

        //bfs
        val queue:Queue<Int> = LinkedList<Int>()
        //queue에 start넣어두고 시작
        queue.add(start)
        val visited = IntArray(vertexNum+1,{Int.MAX_VALUE})
        visited[start]=0
        while (!queue.isEmpty()){
            val present = queue.poll()
            //친구 탐색 + visit값이 이하이면 queue에 넣음
            for (i in 0 until edge[present].size ){
                val friend = edge[present].get(i)
                if (visited[friend.end]>visited[present]+friend.len){
                    visited[friend.end]=visited[present]+friend.len
                    queue.add(friend.end)
                }
            }
            //거리도 최소값으로 바꾸어줌

        }
        var max:Int=0
        var cnt:Int=0
        for ( i in 1..vertexNum){
            if (visited[i] != Int.MAX_VALUE){
                cnt++
                if (visited[i]>max)max=visited[i]
            }
        }
        println("${cnt} ${max}")
    }
}

//클래스 내부 변수는 초기화를 해야 함?
class Node(val end:Int, val len:Int){

}