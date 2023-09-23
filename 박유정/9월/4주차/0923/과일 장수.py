def solution(k, m, score):
    answer = 0
    box = []
    score = sorted(score, reverse = True)
    
    for i in range(0,len(score),m):
        box = score[i:m+i]
        if len(box)==m:
            answer = answer + min(box)*m
    
    return answer