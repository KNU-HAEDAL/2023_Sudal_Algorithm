package a230930
//1로 만들기
fun main()=with(System.`in`.bufferedReader()){
    //N받기
    val N = readLine().toInt()
    //dp돌릴 예정
    // dp[N] = N까지 가는데 필요한 횟수
    // dp[N]= dp[N/3] vs dp[N/2] vs dp[N-1]
    // 3으로 나눠지면 min, 2로 나눠지면 min해서 계속 배열에 넣음
    var dp = IntArray(N+1,{0})

    //dp초기값 설정
    dp[1]=0

    for (i in 2 .. N){
        var min = dp[i-1]+1
        if (i%2==0) min=Math.min(min,dp[i/2]+1)
        if (i%3==0) min=Math.min(min,dp[i/3]+1)
        dp[i]=min
    }

    println(dp[N])
}