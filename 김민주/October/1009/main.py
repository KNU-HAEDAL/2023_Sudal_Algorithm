def solution(cipher, code):
    answer = ''
    cnt = 0
    for i in cipher:
        if cnt%code == code-1:
            answer += i
        cnt += 1
    return answer