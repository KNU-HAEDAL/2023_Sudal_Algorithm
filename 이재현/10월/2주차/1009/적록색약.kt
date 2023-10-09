package a231009

import java.util.StringTokenizer
var N:Int = 0 //lateinit Int, Long, Short등에는 사용 불가
var dRow:IntArray = intArrayOf(-1,0,1,0)
var dCol:IntArray = intArrayOf(0,1,0,-1)

fun main()=with(System.`in`.bufferedReader()){
    // N받음
    N = readLine().toInt()

    //color배열 선언
    val color = Array(N,{CharArray(N)})
    val colorRG = Array(N,{CharArray(N)})
    val visited = Array(N,{BooleanArray(N,{false})})
    val visitedRG=Array(N,{BooleanArray(N,{false})})
    // for N*N, color받음
    for (i in 0 until N){
        val line = readLine()
        for (j in 0 until N){
            color[i][j]=line[j]
            colorRG[i][j]=line[j]//문자열이 인덱싱 가능..
            if (line[j]=='G') colorRG[i][j]='R'
        }
    }

    //for N*N, visited==false이면 dfs
    var cnt=0
    var cntRG=0

    for (i in 0 until N){
        for (j in 0 until N){
            if (!visited[i][j]) {
                dfs(color, visited, i, j)
                cnt++
            }
            if (!visitedRG[i][j]){
                dfs(colorRG, visitedRG,i,j)
                cntRG++
            }
        }
    }

    println("$cnt $cntRG")
}

fun dfs(color:Array<CharArray>, visited:Array<BooleanArray>, row:Int, col:Int){
    visited[row][col]=true

    //친구 찾기
    //상하좌우 돌아가면서
    for (i in 0 .. 3){
        val nextRow = row+dRow[i]
        val nextCol = col+dCol[i]
        if (!outOfIndex(nextRow,nextCol)&&
                !visited[nextRow][nextCol]&&
                color[row][col]==color[nextRow][nextCol])
            dfs(color,visited,nextRow,nextCol)
    }
    //1. 인덱스 범위 초과안하고
    //2. 방문 안 했고
    //3. 색깔 동일하면
    // dfs

}

fun outOfIndex(row:Int,col:Int):Boolean{
    if (row<0 || row>=N || col<0 || col>=N) return true
    else return false
}