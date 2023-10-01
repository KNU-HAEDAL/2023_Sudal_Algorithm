def solution(price, money, count):
    total = 0
    sum = 0
    answer = 0
    for i in range (1,count+1) :
        sum = price * i
        total = total + sum
    answer = total - money
    if answer < 0 :
        return 0
    else :
        return answer