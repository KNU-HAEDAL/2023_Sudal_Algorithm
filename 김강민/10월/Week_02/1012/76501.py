def solution(absolutes, signs):
    sum = 0
    
    for i in range(len(absolutes)):
        if signs[i]:
            sum += absolutes[i]
        else:
            sum -= absolutes[i]
    return sum