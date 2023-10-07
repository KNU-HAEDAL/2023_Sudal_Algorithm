def solution(num):
    cnt = 0
    answer = 0
    while True:
        if num == 1:
            break
        if cnt == 500:
            cnt = -1
            break
        if num%2==0:
            num = num/2
            cnt +=1
        elif num%2 !=0:
            num = (num*3)+1
            cnt +=1
    answer = cnt
    return answer