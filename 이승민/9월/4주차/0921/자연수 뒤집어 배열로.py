def solution(n):
    answer = []
    n=str(n)
    for i in n:
        k = int(i)
        answer.append(k)
    answer.reverse()
    return answer