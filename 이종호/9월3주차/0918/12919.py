def solution(seoul):
    cnt = 0
    for name in seoul : 
        if name == 'Kim' :
            answer = "김서방은 " + str(cnt) + "에 있다"
        else :
            cnt = cnt + 1
    return answer        