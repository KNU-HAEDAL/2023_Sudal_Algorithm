def solution(strings, n):
    answer = []
    n_keyword = [] #문자열의 n번째 단어를 저장해놓을 리스트
    strings.sort() #추가!
    
    for i in strings:
        keyword = i[n]
        n_keyword.append(keyword)
    
    n_keyword.sort()
    
    for i in n_keyword: # n번째 알파벳 기준으로
        for j in strings:
            if i == j[n] and j not in answer:
                answer.append(j)
    
    return answer