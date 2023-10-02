package a231002

import java.util.StringTokenizer
//https://www.acmicpc.net/problem/11049
//dp
fun main()=with(System.`in`.bufferedReader()){
    // N받기
    val N = readLine().toInt()

    // for N, matrix[]에는 [5,3]과 같이 들어가야 함
    //matrix 2차원 배열 생성
    val matrix = Array(N,{LongArray(2,{0L})})

    for (i in 0 until N){
        val st = StringTokenizer(readLine())
        matrix[i][0]=st.nextToken().toLong()
        matrix[i][1]=st.nextToken().toLong()
    }

    //dp생성
    //dp[i][j]= matrix[i]부터 matrix[j]까지 합치는데 최소비용
    //dp[i][i+1]=고정
    //dp[i][i+2] = dp[i][i+1] + dp[i+2][i+2] + matrix[i][0]*matrix[i+1][1]*matrix[i+2][1]
    //dp[i][i+3] = dp[i][i] + dp[i+1][i+3] + matrix[i][0]*matrix[i][1]*matrix[i+3][1]

    //0~3을 구하려면
    //0~1, 1~2, 2~3 구하고
    //0~2, 1~3 구하고
    //0~3 구하면 됨
    var dp = Array(N,{LongArray(N,{Int.MAX_VALUE.toLong() })})
    for (i in 0 until N){
        dp[i][i]=0L
    }
    for (k in 1 until N){
        for (i in 0 until N-k){
            for (j in i until i+k){
                dp[i][i+k]=
                        Math.min(dp[i][i+k],dp[i][j]+dp[j+1][i+k]+matrix[i][0]*matrix[j][1]*matrix[i+k][1])
            }
        }
    }

    println(dp[0][N-1])
}