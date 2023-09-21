def solution(food):
    food[0] = 0
    answer = ''
    
    for i in range(1,len(food)):
        num = food[i]//2
        answer = answer+str(i)*num
    
    answer = answer+str(food[0])
    re_food = list(answer)
    del re_food[-1]
    re_food.reverse()
    answer = answer+''.join(re_food)      
    
    return answer