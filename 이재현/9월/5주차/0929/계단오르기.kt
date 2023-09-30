package a230929
//계단 오르기
fun main() = with(System.`in`.bufferedReader()) {
    //N받기
    val N = readLine().toInt()

    //for N , step받기
    var step = IntArray(N+1,{0})

    for (i in 1 .. N ){
        step[i]=readLine().toInt()
    }

    //dp
    //6번 step이 도착지라고 해보자.
    // 2번 연속 밟은 4 vs
    // 1번 연속 밟은 4 vs
    // 1번 연속 밟은 5

    //dp[연속][지금밟는step]
    // dp[][2]까지는 기본 설정 가능
    // dp[1][1]=10
    // dp[1][2]=20
    // dp[2][2]=dp[1][1]+step[2]
    var dp = Array(3,{IntArray(N+1,{0})})
    if (N==1) {
        println(step[1])
        return;
    }

    dp[1][1]=step[1]
    dp[1][2]=step[2]
    dp[2][2]=step[1]+step[2]
    for (i in 3..N){
        //1번 밟은 경우 -> 2번 점프하는 경우
        dp[1][i]=Math.max(dp[1][i-2],dp[2][i-2])+step[i]

        //2번 밟은 경우 -> 1번 점프하는경우
        dp[2][i]=dp[1][i-1]+step[i]
    }

    println(Math.max(dp[1][N],dp[2][N]))
}