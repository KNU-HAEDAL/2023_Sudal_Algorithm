def solution(n):
    num = list(str(n))
    num.reverse()
    
    return list(map(int, num))