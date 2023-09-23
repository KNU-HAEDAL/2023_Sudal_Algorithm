def solution(a, b, n):
    remain_bottle = 0
    final_bottle = 0

    while(n >= a):
        remain_bottle = n % a 
        n = (n // a) * b
        final_bottle += n
        n += remain_bottle
    return final_bottle

