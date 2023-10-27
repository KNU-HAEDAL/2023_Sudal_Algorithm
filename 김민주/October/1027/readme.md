## programmers [ 인덱스 바꾸기 ] ; 120895

<https://school.programmers.co.kr/learn/courses/30/lessons/120895>

### python 리스트

- 코드가 너무 길어서 다른 코드도 찾아봄,,,,
- 역시나 간결한 코드는 있었음 ㅋ ㅋ

- 문자열은 인덱스로 접근 불가능하므로 리스트로 바꾸어주고
- a,b= b,a 가 가능한 python의 성질을 이용한다
- list를 문자열로 출력할 때 join함수 쓰는거!!! 왕까먹고있었다..

~~복습복습 좀 해 ㅜㅜ ~~

---

def solution(my_string, num1, num2):
answer = ''
your_string = list(my_string)
your_string[num1], your_string[num2] = your_string[num2], your_string[num1]
answer = ''.join(your_string)
print(answer)

solution('hello', 1,2)
