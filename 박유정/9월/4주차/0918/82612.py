def solution(price, money, count):
    sum = 0
    for i in range(1,count+1):
        i *= price
        sum += i
    
    result = sum - money
    if money>sum:
        result = 0
    
    answer = result

    return answer
