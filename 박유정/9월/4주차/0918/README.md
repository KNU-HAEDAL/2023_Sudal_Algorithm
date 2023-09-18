def solution(num):
    if num != 1:
        count = 0
        while count<500:
            if num%2==0:
                num = num/2
                count += 1
            else:
                num = num*3 + 1
                count += 1
            
            if num==1:
                break
            
        if count>=500:
            count = -1
    else:
        count = 0
        
    answer = count
    
    return answer
