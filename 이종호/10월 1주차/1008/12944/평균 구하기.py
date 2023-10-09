def solution(arr):
    
    # 예외 피하기 위한 조건
    if len(arr) == 0:
        return 0
    
    return sum(arr) / len(arr)