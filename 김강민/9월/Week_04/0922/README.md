# [unrated] 콜라 문제 - 132267

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/132267)

### 성능 요약

메모리: 10.4 MB, 시간: 0.00 ms

### 구분

코딩테스트 연습 > 연습문제

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 문제 설명

<p>오래전 유행했던 콜라 문제가 있습니다. 콜라 문제의 지문은 다음과 같습니다.</p>

<blockquote>
<p>정답은 아무에게도 말하지 마세요.</p>

<p>콜라 빈 병 2개를 가져다주면 콜라 1병을 주는 마트가 있다. 빈 병 20개를 가져다주면 몇 병을 받을 수 있는가?</p>

<p>단, 보유 중인 빈 병이 2개 미만이면, 콜라를 받을 수 없다.</p>
</blockquote>

<p>문제를 풀던 상빈이는 콜라 문제의 완벽한 해답을 찾았습니다. 상빈이가 푼 방법은 아래 그림과 같습니다. 우선 콜라 빈 병 20병을 가져가서 10병을 받습니다. 받은 10병을 모두 마신 뒤, 가져가서 5병을 받습니다. 5병 중 4병을 모두 마신 뒤 가져가서 2병을 받고, 또 2병을 모두 마신 뒤 가져가서 1병을 받습니다. 받은 1병과 5병을 받았을 때 남은 1병을 모두 마신 뒤 가져가면 1병을 또 받을 수 있습니다. 이 경우 상빈이는 총 10 + 5 + 2 + 1 + 1 = 19병의 콜라를 받을 수 있습니다.</p>

<p><img src="https://grepp-programmers.s3.ap-northeast-2.amazonaws.com/files/production/95ce1c11-2f21-4248-8bfc-e330299cbb9a/image6.PNG" title="" alt="image6.PNG"></p>

<p>문제를 열심히 풀던 상빈이는 일반화된 콜라 문제를 생각했습니다. 이 문제는 빈 병 <code>a</code>개를 가져다주면 콜라 <code>b</code>병을 주는 마트가 있을 때, 빈 병 <code>n</code>개를 가져다주면 몇 병을 받을 수 있는지 계산하는 문제입니다. 기존 콜라 문제와 마찬가지로, 보유 중인 빈 병이 <code>a</code>개 미만이면, 추가적으로 빈 병을 받을 순 없습니다. 상빈이는 열심히 고심했지만, 일반화된 콜라 문제의 답을 찾을 수 없었습니다. 상빈이를 도와, 일반화된 콜라 문제를 해결하는 프로그램을 만들어 주세요.</p>

<p>콜라를 받기 위해 마트에 주어야 하는 병 수 <code>a</code>, 빈 병 a개를 가져다 주면 마트가 주는 콜라 병 수 <code>b</code>, 상빈이가 가지고 있는 빈 병의 개수 <code>n</code>이 매개변수로 주어집니다. 상빈이가 받을 수 있는 콜라의 병 수를 return 하도록 solution 함수를 작성해주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ <code>b</code> &lt; <code>a</code> ≤ <code>n</code> ≤ 1,000,000</li>
<li>정답은 항상 int 범위를 넘지 않게 주어집니다.</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>a</th>
<th>b</th>
<th>n</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>2</td>
<td>1</td>
<td>20</td>
<td>19</td>
</tr>
<tr>
<td>3</td>
<td>1</td>
<td>20</td>
<td>9</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p><strong>입출력 예 #1</strong></p>

<ul>
<li>본문에서 설명한 예시입니다.</li>
</ul>

<p><strong>입출력 예 #2</strong></p>

<ul>
<li>빈 병 20개 중 18개를 마트에 가져가서, 6병의 콜라를 받습니다. 이때 상빈이가 가지고 있는 콜라 병의 수는 8(20 – 18 + 6 = 8)개 입니다.</li>
<li>빈 병 8개 중 6개를 마트에 가져가서, 2병의 콜라를 받습니다. 이때 상빈이가 가지고 있는 콜라 병의 수는 4(8 – 6 + 2 = 4)개 입니다.</li>
<li>빈 병 4 개중 3개를 마트에 가져가서, 1병의 콜라를 받습니다. 이때 상빈이가 가지고 있는 콜라 병의 수는 2(4 – 3 + 1 = 2)개 입니다.</li>
<li>3번의 교환 동안 상빈이는 9(6 + 2 + 1 = 9)병의 콜라를 받았습니다.</li>
</ul>

> 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges

## 풀이

나누기와 나머지를 이용하여 무한 루프문을 돌려 푸는 문제이다.

1. 남은 병과 최종 병의 갯수를 0으로 초기화 한다.
2. 문제 조건에 맞게 n이 a 보다 크거나 같을때 멈추도록 while문을 선언한다.
3. 남은 병의 갯수는 총 콜라(n) 에서 마트에 줘야하는 병의 수 (a)를 나눈 나머지로 구한다.
4. 마트에서 남은 콜라수를 n // a \* b 를 해서 구해준다.
5. 받은 콜라의 수를 최종 병의 갯수에 더해준다.
6. 이후 남은 병을 더해줘서 다음에 콜라를 살때 이용한다.

### 다른사람 풀이

```Python
solution = lambda a, b, n: max(n - b, 0) // (a - b) * b
```

화밖에 안나네ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
