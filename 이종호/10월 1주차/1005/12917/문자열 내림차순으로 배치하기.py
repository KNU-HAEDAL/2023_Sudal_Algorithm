def solution(s):
    answer = sorted(s, reverse=True)
    answer = "".join(answer)
    return answer