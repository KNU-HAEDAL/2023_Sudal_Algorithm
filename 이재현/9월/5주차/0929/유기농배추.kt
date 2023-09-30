package a230929
//유기농배추
import java.util.StringTokenizer
var row:Int = 0
var col:Int =0
//아 lateinit을 통해서 대입하지 않아도 오류가 안 생기게 되는구나
lateinit var map:Array<BooleanArray>
lateinit var visited:Array<BooleanArray>
val dRow = arrayOf(0,-1,0,1)
val dCol= arrayOf(-1,0,1,0)
fun main() = with(System.`in`.bufferedReader()){
    //T받고
    val T = readLine().toInt()

    for (i in 0 until T){
        //row, col, N받기
        var st = StringTokenizer(readLine())
        row = st.nextToken().toInt()
        col = st.nextToken().toInt()
        val N = st.nextToken().toInt()

        map = Array(row, {BooleanArray(col,{false})})
        visited = Array(row,{BooleanArray(col,{false})})
        //N만큼 위치 받기
        for (j in 1..N){
            st= StringTokenizer(readLine())
            // x y받기
            var x = st.nextToken().toInt()
            var y = st.nextToken().toInt()
            map[x][y]=true
        }

        //row col동안 visited도 아니고 map은 true인 경우
        //dfs실행 -> +1
        var cnt:Int = 0
        for(x in 0 until row){
            for (y in 0 until col){
                if (!visited[x][y] && map[x][y]) {
                    dfs(x,y)
                    cnt++
                }
            }
        }
        println(cnt)

    //N으로 dfs돌리면 됨
    }
}

fun dfs(x:Int,y:Int){
    visited[x][y]=true

    //상하좌우 확인
    // index가 범위 내인가
    // map은 true인가
    // visit은 하지 않았는가
    for (i in 0 until 4){
        val nextRow = x+dRow[i]
        val nextCol = y+dCol[i]
        if (!outOfIndex(nextRow,nextCol)
                && map[nextRow][nextCol]
                && !visited[nextRow][nextCol])
            dfs(nextRow,nextCol)

    }
}

fun outOfIndex(x:Int, y:Int):Boolean{
    if (x<0 || x >=row || y<0 || y>=col) return true
    return false
}