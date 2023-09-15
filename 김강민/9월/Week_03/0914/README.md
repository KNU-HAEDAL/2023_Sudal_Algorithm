# [level 1] 직사각형 별찍기 - 12969

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12969)

### 성능 요약

메모리: 7.64 MB, 시간: 12.90 ms

### 구분

코딩테스트 연습 > 연습문제

### 채점결과

Empty

### 문제 설명

<p>이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.<br>
별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.</p>

<hr>

<h5>제한 조건</h5>

<ul>
<li>n과 m은 각각 1000 이하인 자연수입니다.</li>
</ul>

<hr>

<h5>예시</h5>

<p>입력</p>
<div class="highlight"><pre class="codehilite"><code>5 3
</code></pre></div>
<p>출력</p>
<div class="highlight"><pre class="codehilite"><code>*****
*****
*****
</code></pre></div>

> 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges

## 풀이

1. 별의 갯수인 n과 반복횟수인 m을 입력받는다.
2. 반복횟수만큼 for문을 돌린다.
3. 별의 갯수만큼 출력하기 위해 별에다가 n을 곱한다.
