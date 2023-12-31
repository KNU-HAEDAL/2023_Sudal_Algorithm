# [level 2] 가장 큰 수 - 42746

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42746?language=python3#)

### 성능 요약

메모리: 10.3 MB, 시간: 0.03 ms

### 구분

코딩테스트 연습 > 정렬

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 문제 설명

<p>0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.</p>

<p>예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.</p>

<p>0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.</p>

<h5>제한 사항</h5>

<ul>
<li>numbers의 길이는 1 이상 100,000 이하입니다.</li>
<li>numbers의 원소는 0 이상 1,000 이하입니다.</li>
<li>정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.</li>
</ul>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>numbers</th>
<th>return</th>
</tr>
</thead>
        <tbody><tr>
<td>[6, 10, 2]</td>
<td>"6210"</td>
</tr>
<tr>
<td>[3, 30, 34, 5, 9]</td>
<td>"9534330"</td>
</tr>
</tbody>
      </table>
<hr>

<p>※ 공지 - 2021년 10월 20일 테스트케이스가 추가되었습니다.</p>

> 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges

## 풀이

숫자를 String으로 바꿔서 정렬을 하면 사전순으로 정렬이 된다고 한다.<br/>
즉, 숫자가 작은 순서대로가 아니라, 앞자리 숫자가 작은 순서대로 정렬이 된다고 한다.<br/>
하지만 문제에서는 숫자가 큰 순서대로 정렬을 해야하므로 reverse를 이용해 정렬을 뒤집는다.<br/>
그 후 각 원소마다 3을 곱해준다. <br/>
이후 다시 int형으로 바꿔서 join을 이용해 출력한다.
