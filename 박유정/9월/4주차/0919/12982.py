def solution(d, budget):
    count = 0
    for i in range(0,len(d)):
        budget = budget - min(d)
        count += 1
        d.remove(min(d))
        
        if budget<0:
            count -= 1
            break
    
    answer = count
    return answer
