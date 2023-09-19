def solution(s):
    answer = []
    compare = {}
    
    for idx, word in enumerate(list(s)): #enumerate : 입력으로 받은 리스트의 인덱스와 정보를 포함
        if word not in compare:
            answer.append(-1)
            compare[word] = idx
        else:
            answer.append(idx - compare[word])
            compare[word] = idx
            
    return answer