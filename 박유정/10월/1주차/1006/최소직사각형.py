def solution(sizes):
    width = []
    length = []
    
    for i in sizes:
        if i[0]>i[1]:
            width.append(i[0])
            length.append(i[1])
        else:
            width.append(i[1])
            length.append(i[0])
            
    answer = max(width) * max(length)
        
    return answer