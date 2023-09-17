def solution(n):
    answer = lcm(6,n)//6
    return answer

def gcd(a, b):  # 최대공약수
    while b > 0:
        a, b = b, a % b
    return a


def lcm(a, b):
    return a * b / gcd(a, b)