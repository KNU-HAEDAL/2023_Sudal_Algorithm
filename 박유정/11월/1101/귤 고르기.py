def solution(k, tangerine):
    answer = 0
    dic = {}
    for i in tangerine:
        if i in dic:
            dic[i] += 1
        else:
            dic[i] = 1
    sort_tan = sorted(dic.items(), key = lambda x: x[1], reverse=True)
    for i in range(len(sort_tan)):
        k -= sort_tan[i][1]
        answer += 1
        if k<=0:
            break
    return answer
    
    '''
    딕셔너리 사용x -> 시간초과
    while(1):
        tan_max = max(set(tangerine), key = tangerine.count)
        k -= tangerine.count(tan_max)
        answer += 1
        if k<=0:
            break
        Tan.remove(tan_max)
    return answer
    '''