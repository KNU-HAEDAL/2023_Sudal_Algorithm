# [unrated] 문자열 정수의 합 - 181849

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181849?language=python3)

### 성능 요약

메모리: 10.2 MB, 시간: 0.03 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

Empty

### 문제 설명

<p>한 자리 정수로 이루어진 문자열 <code>num_str</code>이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>3 ≤ <code>num_str</code> ≤ 100</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>num_str</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>"123456789"</td>
<td>45</td>
</tr>
<tr>
<td>"1000000"</td>
<td>1</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>문자열 안의 모든 숫자를 더하면 45가 됩니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>문자열 안의 모든 숫자를 더하면 1이 됩니다.</li>
</ul>

> 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges

## 풀이

이 문제는 문자열(str)을 정수로 바꿔주는 과정이 필요하다.
또한, 파이썬에서는 문자열이 배열처럼, 사용가능하다는 점을 알고 있어야 한다.

1. 문자열을 받아온다.
2. 숫자로 변환해서 담을 리스트와 변수 sum을 초기화한다.
3. for 문을 문자열의 길이만큼 반복하고, 문자열 첫글자부터 정수로 변환한 후 리스트에 담는다.
4. 리스트로 담은 숫자를 sum 변수에 더함과 동시에 추가한다.
5. sum을 출력한다.
