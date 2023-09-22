def solution(N, stages):
    loser_per = []
    arrive_stage = len(stages)
    for stage in range(1,N+1):
        count = 0
        for j in range(0,len(stages)):
            if stages[j] == stage:
                count += 1
        if count == 0:
            loser_per.append(0)
        else:
            loser_per.append(count/arrive_stage)
        arrive_stage -= count
    
    sort = sorted(loser_per,reverse=True)
    answer = []
    
    for i in range(0,len(sort)):
        idx = loser_per.index(sort[i]) + 1
        answer.append(idx)
        loser_per[loser_per.index(sort[i])] = -1
        
    return answer