def solution(n):
    answer = 0
    save_n = n
    current = 1
    while current<=n:
        for i in range(current,n+1):
            save_n -= i
            if save_n==0:
                answer += 1
                break
            elif save_n<0:
                break
            i += 1
        save_n = n
        current += 1
    
    return answer