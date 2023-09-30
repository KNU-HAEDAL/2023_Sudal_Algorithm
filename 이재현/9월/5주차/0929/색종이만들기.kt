package a230929
//색종이 만들기
import java.util.StringTokenizer

lateinit var paper:Array<BooleanArray>

fun main()=with (System.`in`.bufferedReader()){
    //N받기
    val N  = readLine().toInt()

    //for N, paper채우기
    paper=Array(N,{BooleanArray(N,{false})})
    for (i in 0 until N ){
        var st=StringTokenizer(readLine())
        for (j in 0 until N){
            var temp = st.nextToken().toInt()
            if (temp==1) paper[i][j]=true
        }
    }
    //분할정복
    var whiteBlue=conquer(0,0,N)
    println(whiteBlue[0])
    println(whiteBlue[1])
}

fun conquer(x:Int, y:Int, size:Int):IntArray{
    //for row에서 size만큼
    // for col에서 size만큼
    var standard = paper[x][y]
    var div=false
    for (i in x until x+size){
        if (div) break;
        for (j in y until y+size){
            if (paper[i][j]!=standard) {
                div=true
                break;
            }
        }
    }

    if (div){

        //분할정복 시행해서 값을 더 함
        var ans1=conquer(x,y,size/2)
        var ans2=conquer(x,y+size/2,size/2)
        var ans3=conquer(x+size/2,y,size/2)
        var ans4=conquer(x+size/2,y+size/2,size/2)
        return intArrayOf(ans1[0]+ans2[0]+ans3[0]+ans4[0],ans1[1]+ans2[1]+ans3[1]+ans4[1])
    }
    else{
        if (standard) return intArrayOf(0,1)
        else return intArrayOf(1,0)
    }

}