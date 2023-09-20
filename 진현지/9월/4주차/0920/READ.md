# [Bronze III] 알고리즘 수업 - 알고리즘의 수행 시간 5 - 24266 

[문제 링크](https://www.acmicpc.net/problem/24266) 

**오늘 알고리즘 시간에 시간복잡도에 대해 배워서 관련문제를 풀어보았다**
[시간복잡도](https://coding-factory.tistory.com/608)

---

**int 범위를 처음에 잘못 설정해서 틀렸다. (int 의 범위는 대략 21억에서 -21억) *범위 조심***

### 분류

구현, 수학, 시뮬레이션

### 문제 설명

<p>오늘도 서준이는 알고리즘의 수행시간 수업 조교를 하고 있다. 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.</p>

<p>입력의 크기 <em>n</em>이 주어지면 MenOfPassion 알고리즘 수행 시간을 예제 출력과 같은 방식으로 출력해보자.</p>

<p>MenOfPassion 알고리즘은 다음과 같다.</p>

<pre>MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n
        for j <- 1 to n
            for k <- 1 to n
                sum <- sum + A[i] × A[j] × A[k]; # 코드1
    return sum;
}</pre>



