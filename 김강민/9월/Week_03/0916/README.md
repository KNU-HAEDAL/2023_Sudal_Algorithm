# [level 1] 시저 암호 - 12926

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12926)

### 성능 요약

메모리: 10.3 MB, 시간: 2.44 ms

### 구분

코딩테스트 연습 > 연습문제

### 채점결과

Empty

### 문제 설명

<p>어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.  예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.</p>

<h5>제한 조건</h5>

<ul>
<li>공백은 아무리 밀어도 공백입니다.</li>
<li>s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.</li>
<li>s의 길이는 8000이하입니다.</li>
<li>n은 1 이상, 25이하인 자연수입니다.</li>
</ul>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>s</th>
<th>n</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>"AB"</td>
<td>1</td>
<td>"BC"</td>
</tr>
<tr>
<td>"z"</td>
<td>1</td>
<td>"a"</td>
</tr>
<tr>
<td>"a B z"</td>
<td>4</td>
<td>"e F d"</td>
</tr>
</tbody>
      </table>

> 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges

## 풀이

1. 문자가 담긴 s 를 list의 형태로 바꾼다.
2. s의 길이만큼 for문을 반복한다.
3. if문으로 2가지 case로 나눈다. 1 -> 문자가 대문자일때, 2 -> 문자가 소문자일때
4. join을 이용하여 문자를 붙여서 출력한다.
