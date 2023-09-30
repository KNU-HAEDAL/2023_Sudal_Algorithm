def solution(absolutes, signs):
    answer = 0
    cnt = 0
    for i in signs :
        if i == True :
            answer = answer + absolutes[cnt]
        else :
             answer = answer + (absolutes[cnt] * (-1))
        cnt += 1
    return answer