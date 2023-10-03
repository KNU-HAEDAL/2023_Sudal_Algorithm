package a231003

import java.util.PriorityQueue
import java.util.StringTokenizer
import kotlin.math.pow
import kotlin.math.roundToInt
import kotlin.math.sqrt

//https://www.acmicpc.net/problem/4386
//kruskal
fun main()=with(System.`in`.bufferedReader()){
    //N받기
    val N = readLine().toInt()

    //N만큼, star배열에 넣기
    //아래 라인 주목!!
    val stars = Array<Star>(N,{Star(0.0,0.0)})
    for (i in 0 until N){
        val st = StringTokenizer(readLine())
        val x = st.nextToken().toDouble()
        val y = st.nextToken().toDouble()
        stars[i]=Star(x,y)
    }

    //N번동안 i~N까지 거리구하고, pq에 넣기
    val pq = PriorityQueue<Edge>()

    for (i in 0 until N){
        for (j in i+1 until N){
            //stars[i]와 stars[j]사이의 거리 구하고,
            // i j 거리로 edge만들어서 pq에 투여
            val lenX =stars[i].x-(stars[j].x)
            val lenY =stars[i].y-(stars[j].y)
            //(i의 x - j의 x)^2 + (i의 y - j의y)^2
            val len = sqrt(lenX.pow(2) +(lenY.pow(2)))
            //val len = hypot(lenX, lenY)으로도 가능하다.

            //pq에 넣기
            pq.add(Edge(i,j,len))
        }
    }
    var cnt=0
    var answer:Double=0.0
    val parent = IntArray(N,{it})
    while (cnt<N-1){
        //edge반환
        val edge =pq.poll()

        //v1의 parent와 v2의 parent가 동일하면 continue
        if (parent[edge.v1]==parent[edge.v2]) continue

        //동일하지 않으면, 둘 중 부모가 작은 애들을 통일시켜줌
        val max=Math.max(parent[edge.v1],parent[edge.v2])
        val min=Math.min(parent[edge.v1],parent[edge.v2])
        for (i in 0 until N){
            if (parent[i]==max)parent[i]=min
        }
        answer+=edge.len
        cnt++
    }
    //pq에서 빼내면 visit확인하고 !
    println((answer*100.0).roundToInt()/100.0)
}

class Star(val x:Double, val y:Double) {
//    var x:Double ;
//    var y:Double;

}

class Edge(val v1 :Int, val v2:Int, val len :Double) :Comparable<Edge>{

    override fun compareTo(other: Edge): Int {
       if (this.len-other.len>0) return 1
        else if (this.len==other.len) return 0
        else return -1
    }

}